package com.flansmod.common.driveables;

import com.flansmod.api.IControllable;
import com.flansmod.api.IExplodable;

import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;

public class EntityDriveable extends Entity implements IControllable, IExplodable, IEntityAdditionalSpawnData{
	
	public boolean syncFromServer = true;
	//Ticks since last server update. Use to smoothly transition to new position
	public int serverPositionTransitionTicker;
	//Server side position, as synced by PacketVehicleControl packets
    public double serverPosX, serverPosY, serverPosZ;
	//Server side rotation, as synced by PacketVehicleControl packets
    public double serverYaw, serverPitch, serverRoll;
    
    //The driveable data which contains the inventory, the engine and the fuel
	public DriveableData driveableData;
	// The shortName of the driveable type, used to obtain said type
	public String driveableType;

}
