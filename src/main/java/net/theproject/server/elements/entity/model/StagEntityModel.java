package net.theproject.server.elements.entity.model;

import com.google.common.collect.ImmutableList;

import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import net.theproject.server.elements.entity.StagEntity;

public class StagEntityModel extends EntityModel<StagEntity> {

    private final ModelPart Body;
	private final ModelPart Leg1A;
	private final ModelPart Leg2A;
	private final ModelPart Leg3A;
	private final ModelPart Leg4A;
	private final ModelPart Head;
	private final ModelPart UMouth;
	private final ModelPart MuleEarL;
	private final ModelPart Neck;
	private final ModelPart rightdeerantlers;
	private final ModelPart leftdeerantlers;;

    public StagEntityModel(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Leg1A = root.getChild("Leg1A");
		this.Leg2A = root.getChild("Leg2A");
		this.Leg3A = root.getChild("Leg3A");
		this.Leg4A = root.getChild("Leg4A");
		this.Head = root.getChild("Head");
		this.UMouth = root.getChild("UMouth");
		this.MuleEarL = root.getChild("MuleEarL");
		this.Neck = root.getChild("Neck");
		this.rightdeerantlers = root.getChild("rightdeerantlers");
		this.leftdeerantlers = root.getChild("leftdeerantlers");
	}

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
    	ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild("Body", ModelPartBuilder.create().uv(0, 32).cuboid(-5.0F, -8.0F, -20.0F, 10.0F, 10.0F, 22.0F), ModelTransform.pivot(0.0F, 11.0F, 9.0F));

        modelPartData.addChild("Leg1A", ModelPartBuilder.create().uv(56, 0).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), ModelTransform.pivot(-3.0F, 13.0F, 9.0F));

        modelPartData.addChild("Leg2A", ModelPartBuilder.create().uv(56, 0).cuboid(0.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), ModelTransform.pivot(3.0F, 13.0F, 9.0F));

        modelPartData.addChild("Leg3A", ModelPartBuilder.create().uv(56, 0).cuboid(-1.0F, 0.0F, -2.0F, 2.0F, 11.0F, 2.0F), ModelTransform.pivot(-3.0F, 13.0F, -9.0F));

        modelPartData.addChild("Leg4A", ModelPartBuilder.create().uv(56, 0).cuboid(-1.0F, 0.0F, -2.0F, 2.0F, 11.0F, 2.0F), ModelTransform.pivot(3.0F, 13.0F, -9.0F));

        modelPartData.addChild("Head", ModelPartBuilder.create().cuboid(0.0F, -4.0F, -11.0F, 0.5236F, 0.0F, 0.0F).cuboid(-3.0F, -7.0F, -15.0F, 6.0F, 5.0F, 7.0F), ModelTransform.pivot(0F, 0F, 0F));


        modelPartData.addChild("UMouth", ModelPartBuilder.create().uv(0, 25).cuboid(-2.0F, -5.0F, -18.0F, 4.0F, 3.0F, 3.0F), ModelTransform.pivot(0F, 0F, 0.0F));

        modelPartData.addChild("MuleEarL", ModelPartBuilder.create().uv(24, 16).cuboid(0.0F, 7.0F, -8.0F, 0.5236F, 0.0F, 0.2618F), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));

        modelPartData.addChild("Neck", ModelPartBuilder.create().uv(29, 0).cuboid(0.0F, 7.0F, -8.0F, 0.5236F, 0.0F, 0.0F).cuboid(-1.0F, -14.0F, -13.0F, 6.0F, 22.0F, 5.0F).cuboid(0.0F, -8.0F, 10.0F, 4.0F, 12.0F, 7.0F), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));

        float y = -19;
        float z = -10;
        float x = 10;
        modelPartData.addChild("rightdeerantlers", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F + x, -9.0F + y, -10.0F, 1.0F, 9.0F, 1.0F)
        .cuboid(-5.0F + x, -1.0F + y, -10.0F, 7.0F, 1.0F, 1.0F)
        .cuboid(-5.0F + x, -1.0F + y, -10.0F, 7.0F, 1.0F, 1.0F)
        .cuboid(-7.0F + x, -7.0F + y, -10.0F, 1.0F, 5.0F, 1.0F)
        .cuboid(6.0F + x, -8.0F + y, z + 0.0F, -13.0F, 1.0F, 1.0F)
        .cuboid(-5.0F + x, -13.0F + y, z + 0.0F, 1.0F, 6.0F, 1.0F)
        .cuboid(1.0F + x, -15.0F + y, z + 0.0F, 1.0F, 8.0F, 1.0F)
        .cuboid(4.0F + x, -11.0F + y, z + 0.0F, 1.0F, 4.0F, 1.0F), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));

       modelPartData.addChild("leftdeerantlers", ModelPartBuilder.create().uv(0, 0).cuboid(-18.0F + x, -1.0F + y, z + 0.0F, 7.0F, 1.0F, 1.0F)
       .cuboid(-16.0F + x, -9.0F + y, z + 0.0F, 1.0F, 9.0F, 1.0F)
       .cuboid(-18.0F + x, -2.0F + y, z + 0.0F, 1.0F, 2.0F, 1.0F)
       .cuboid(-10.0F + x, -7.0F + y, z + 0.0F, 1.0F, 5.0F, 1.0F)
       .cuboid(-9.0F + x, -8.0F + y, z + 0.0F, -13.0F, 1.0F, 1.0F)
       .cuboid(-12.0F + x, -13.0F + y, z + 0.0F, 1.0F, 6.0F, 1.0F)
       .cuboid(-18.0F + x, -15.0F + y, z + 0.0F, 1.0F, 8.0F, 1.0F)
       .cuboid(-21.0F + x, -11.0F + y, z + 0.0F, 1.0F, 4.0F, 1.0F), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
        
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(StagEntity entity, float limbAngle, float limbDistance, float animationProgress,
            float headYaw, float headPitch) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green,
            float blue, float alpha) {
        ImmutableList.of(this.Body).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
        ImmutableList.of(this.Head).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
        ImmutableList.of(this.Leg1A).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
        ImmutableList.of(this.Leg2A).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
        ImmutableList.of(this.Leg3A).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
        ImmutableList.of(this.Leg4A).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
        ImmutableList.of(this.UMouth).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
        ImmutableList.of(this.Neck).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
        ImmutableList.of(this.MuleEarL).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
        ImmutableList.of(this.rightdeerantlers).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
        ImmutableList.of(this.leftdeerantlers).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });

    }

    
}
