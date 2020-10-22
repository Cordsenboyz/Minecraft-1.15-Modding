package com.cordsenboyz.cordsenmod.init;

import com.cordsenboyz.cordsenmod.CordsenMod;

import com.cordsenboyz.cordsenmod.recipes.ExampleRecipe;
import com.cordsenboyz.cordsenmod.recipes.ExampleRecipeSerializer;
import com.cordsenboyz.cordsenmod.recipes.IExampleRecipe;
import net.minecraft.item.crafting.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.layer.EdgeLayer;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RecipeSerializerInit {

    public static final IRecipeSerializer<ExampleRecipe> EXAMPLE_RECIPE_SERIALIZER = new ExampleRecipeSerializer();
    public static final IRecipeType<IExampleRecipe> EXAMPLE_TYPE = registerType(IExampleRecipe.RECIPE_TYPE_ID);

    public static final DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZERS = new DeferredRegister<>(
            ForgeRegistries.RECIPE_SERIALIZERS, CordsenMod.MOD_ID);

    public static final RegistryObject<IRecipeSerializer<?>> EXAMPLE_SERIALIZER = RECIPE_SERIALIZERS.register("example",
            () -> EXAMPLE_RECIPE_SERIALIZER);

    private static class RecipeType<T extends IRecipe<?>> implements IRecipeType<T> {
        @Override
        public String toString() {
            return Registry.RECIPE_TYPE.getKey(this).toString();
        }
    }

    private static <T extends IRecipeType> T registerType(ResourceLocation recipeTypeId) {
        return (T) Registry.register(Registry.RECIPE_TYPE, recipeTypeId, new RecipeType<>());
    }
}