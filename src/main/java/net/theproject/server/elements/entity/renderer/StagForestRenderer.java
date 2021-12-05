package net.theproject.server.elements.entity.renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import net.theproject.server.elements.entity.*;
import net.theproject.server.elements.entity.model.StagEntityModel;
import net.theproject.server.ClientInit;
import net.theproject.server.Init;

public class StagForestRenderer extends MobEntityRenderer<StagEntity, StagEntityModel> {
    
    public StagForestRenderer(EntityRendererFactory.Context context) {
        super(context, new StagEntityModel(context.getPart(ClientInit.MODEL_STAG_FOREST_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(StagEntity entity) {
        return new Identifier(Init.MOD_ID, "textures/entity/stag/stagforest.png");
    }
    
}