package net.theproject.server.elements;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.theproject.server.Init;
import net.theproject.server.elements.entity.*;

public class EntityInit {
    
    public static final EntityType<StagEntity> Stag = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(Init.MOD_ID, "stag"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, StagEntity::new).dimensions(EntityDimensions.fixed(2f, 2f)).build()
    );

    public static void init(){
        //Stag
        FabricDefaultAttributeRegistry.register(Stag, StagEntity.createMobAttributes());
    }
}
