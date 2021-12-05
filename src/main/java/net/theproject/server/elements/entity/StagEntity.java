package net.theproject.server.elements.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

public class StagEntity extends AnimalEntity {
    
    public StagEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }


    @Override
    public PassiveEntity createChild(ServerWorld arg0, PassiveEntity arg1) {
        // TODO Auto-generated method stub
        return null;
    }

}
