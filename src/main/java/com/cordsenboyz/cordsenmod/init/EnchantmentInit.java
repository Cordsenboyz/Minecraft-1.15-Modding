package com.cordsenboyz.cordsenmod.init;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.enchantments.LeechEnchantment;
import com.cordsenboyz.cordsenmod.enchantments.UpStepEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

public class EnchantmentInit {

    public static final DeferredRegister<Enchantment> ENCHANTMENTS = new DeferredRegister<>(ForgeRegistries.ENCHANTMENTS, CordsenMod.MOD_ID);

    public static final RegistryObject<Enchantment> UPSTEP = ENCHANTMENTS.register("upstep", () -> new UpStepEnchantment(Enchantment.Rarity.RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[] {EquipmentSlotType.FEET}));
    public static final RegistryObject<Enchantment> LEECH = ENCHANTMENTS.register("leech", () -> new LeechEnchantment(Enchantment.Rarity.RARE, EnchantmentType.WEAPON, new EquipmentSlotType[] {}));
}
