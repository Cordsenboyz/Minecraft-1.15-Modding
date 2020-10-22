package com.cordsenboyz.cordsenmod.container;

import com.cordsenboyz.cordsenmod.init.BlockInit;
import com.cordsenboyz.cordsenmod.init.ModContainerTypes;
import com.cordsenboyz.cordsenmod.tileentity.ExampleChestTileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IWorldPosCallable;

import java.util.Objects;


public class ExampleChestContainer extends Container {

    public final ExampleChestTileEntity tileEntity;
    private final IWorldPosCallable canInteractWithCallable;

    public ExampleChestContainer(final int windowId, final PlayerInventory playerInventory, final ExampleChestTileEntity tileEntity) {
        super(ModContainerTypes.EXAMPLE_CHEST.get(), windowId);
        this.tileEntity = tileEntity;
        this.canInteractWithCallable = IWorldPosCallable.of(tileEntity.getWorld(),tileEntity.getPos());

        //Main Inventory
        int startX = 8;
        int startY = 18;
        int slotSizePlus2 = 18;
        for(int row = 0; row < 6; ++row) {
            for(int column = 0; column < 9; ++ column){
                this.addSlot(new Slot(tileEntity, (row * 9)+ column, startX + (column * slotSizePlus2), startY + (row * slotSizePlus2)));
            }
        }
        //Main Player Inventory
        int startPlayerInvY = 140;
        for(int row = 0; row < 3; ++row){
            for(int column = 0; column < 9; ++column) {
                this.addSlot(new Slot(playerInventory, 9 + (row * 9) + column, startX + (column * slotSizePlus2), startPlayerInvY + (row * slotSizePlus2)));
            }
        }

        //Hotbar
        int hotbarY = 198;
        for(int column = 0; column < 9; ++column) {
            this.addSlot(new Slot(playerInventory, column, startX + (column * slotSizePlus2), hotbarY));
        }


    }
    private static ExampleChestTileEntity getTileEntity(final PlayerInventory playerInventory, final PacketBuffer data) {
        Objects.requireNonNull(playerInventory, "playerInventory cannot be null");
        Objects.requireNonNull(data, "data cannot be null");
        final TileEntity tileAtPos = playerInventory.player.world.getTileEntity(data.readBlockPos());
        if(tileAtPos instanceof ExampleChestTileEntity) {
            return (ExampleChestTileEntity)tileAtPos;
        }
        throw new IllegalStateException("Tile entity is not correct!" + tileAtPos);
    }

    public ExampleChestContainer(final int windowId, final PlayerInventory playerInventory, final PacketBuffer data) {
        this(windowId, playerInventory, getTileEntity(playerInventory, data));
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return isWithinUsableDistance(canInteractWithCallable, playerIn, BlockInit.EXAMPLE_CHEST.get());
    }

    @Override
    public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);
        if(slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
            if(index < 54) {
                if(!this.mergeItemStack(itemstack, 54, this.inventorySlots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            }else if(!this.mergeItemStack(itemstack1, 0, 54, false)) {
                return ItemStack.EMPTY;
            }
            if(itemstack1.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }
        }
        return itemstack;
    }
}
