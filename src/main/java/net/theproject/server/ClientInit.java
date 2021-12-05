package net.theproject.server;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

import net.theproject.server.elements.entity.*;
import net.theproject.server.elements.entity.model.StagEntityModel;
import net.theproject.server.elements.entity.renderer.StagForestRenderer;
import net.theproject.server.elements.EntityInit;


@Environment(EnvType.CLIENT)
public class ClientInit implements ClientModInitializer {
    public static final EntityModelLayer MODEL_STAG_FOREST_LAYER = new EntityModelLayer(new Identifier(Init.MOD_ID, "stag"), "main");

    @Override
    public void onInitializeClient() {
        /*
         * Registers our Cube Entity's renderer, which provides a model and texture for the entity.
         *
         * Entity Renderers can also manipulate the model before it renders based on entity context (EndermanEntityRenderer#render).
         */
        // In 1.17, use EntityRendererRegistry.register (seen below) instead of EntityRendererRegistry.INSTANCE.register (seen above)
        EntityRendererRegistry.register(EntityInit.Stag, (context) -> {
            return new StagForestRenderer(context);
        });
 
        EntityModelLayerRegistry.registerModelLayer(MODEL_STAG_FOREST_LAYER, StagEntityModel::getTexturedModelData);
    }
}
