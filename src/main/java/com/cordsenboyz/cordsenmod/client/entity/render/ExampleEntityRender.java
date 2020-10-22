package com.cordsenboyz.cordsenmod.client.entity.render;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.client.entity.model.ExampleEntityModel;
import com.cordsenboyz.cordsenmod.entities.ExampleEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ExampleEntityRender extends MobRenderer<ExampleEntity, ExampleEntityModel<ExampleEntity>> {
    protected static final ResourceLocation TEXTURE = new ResourceLocation(CordsenMod.MOD_ID, "textures/entity/example_entity.png");
    public ExampleEntityRender(EntityRendererManager rendererManagerIn) {
        super(rendererManagerIn, new ExampleEntityModel<ExampleEntity>(), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(ExampleEntity entity) {
        return TEXTURE;
    }
}
