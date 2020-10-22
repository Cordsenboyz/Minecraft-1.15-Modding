package com.cordsenboyz.cordsenmod.client.entity.model;

import com.cordsenboyz.cordsenmod.entities.ExampleEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class ExampleEntityModel<T extends ExampleEntity> extends EntityModel<T> {
    private final ModelRenderer Body;
    private final ModelRenderer Legs;
    private final ModelRenderer Back;
    private final ModelRenderer RightBack;
    private final ModelRenderer LeftBack;
    private final ModelRenderer Front;
    private final ModelRenderer RightFront;
    private final ModelRenderer LeftFront;
    private final ModelRenderer Head;
    private final ModelRenderer bb_main;

    public ExampleEntityModel() {
        textureWidth = 64;
        textureHeight = 64;

        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 24.0F, 0.0F);


        Legs = new ModelRenderer(this);
        Legs.setRotationPoint(0.0F, 0.0F, 0.0F);
        Body.addChild(Legs);
        Legs.setTextureOffset(4, 0).addBox(2.0F, -2.0F, 7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        Back = new ModelRenderer(this);
        Back.setRotationPoint(0.0F, 0.0F, 0.0F);
        Legs.addChild(Back);


        RightBack = new ModelRenderer(this);
        RightBack.setRotationPoint(0.0F, 0.0F, 0.0F);
        Back.addChild(RightBack);
        RightBack.setTextureOffset(4, 4).addBox(-3.0F, -2.0F, 7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        LeftBack = new ModelRenderer(this);
        LeftBack.setRotationPoint(0.0F, 0.0F, 0.0F);
        Back.addChild(LeftBack);


        Front = new ModelRenderer(this);
        Front.setRotationPoint(0.0F, 0.0F, 0.0F);
        Legs.addChild(Front);


        RightFront = new ModelRenderer(this);
        RightFront.setRotationPoint(0.0F, 0.0F, 0.0F);
        Front.addChild(RightFront);
        RightFront.setTextureOffset(0, 3).addBox(-3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        LeftFront = new ModelRenderer(this);
        LeftFront.setRotationPoint(0.0F, 0.0F, 0.0F);
        Front.addChild(LeftFront);
        LeftFront.setTextureOffset(0, 0).addBox(2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        Head = new ModelRenderer(this);
        Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        Body.addChild(Head);
        Head.setTextureOffset(0, 17).addBox(-2.0F, -8.0F, -8.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.setTextureOffset(0, 0).addBox(-3.0F, -6.0F, -5.0F, 6.0F, 4.0F, 13.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Body.render(matrixStack, buffer, packedLight, packedOverlay);
        bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
    }
    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
        super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);
    }
}