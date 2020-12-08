package com.cordsenboyz.cordsenmod.objects.blocks;

import com.cordsenboyz.cordsenmod.init.ModTileEntityTypes;
import com.cordsenboyz.cordsenmod.tileentity.DiamondBarrelTileEntity;
import com.cordsenboyz.cordsenmod.tileentity.GoldBarrelTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class GoldBarrelBlock extends Block {
    public GoldBarrelBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return ModTileEntityTypes.GOLD_BARREL.get().create();
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult result) {
        if(!worldIn.isRemote){
            TileEntity tile = worldIn.getTileEntity(pos);
            if(tile instanceof GoldBarrelTileEntity);
            NetworkHooks.openGui((ServerPlayerEntity)player, (GoldBarrelTileEntity)tile, pos);
            return ActionResultType.SUCCESS;
        }  return ActionResultType.FAIL;
    }

    @Override
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        if(state.getBlock() != newState.getBlock()) {
            TileEntity te = worldIn.getTileEntity(pos);
            if(te instanceof GoldBarrelTileEntity){
                InventoryHelper.dropItems(worldIn, pos, ((GoldBarrelTileEntity) te).getItems());
            }
        }
    }
}
