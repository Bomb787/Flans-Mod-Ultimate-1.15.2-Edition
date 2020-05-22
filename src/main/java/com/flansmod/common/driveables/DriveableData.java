package com.flansmod.common.driveables;

import com.flansmod.common.parts.PartType;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class DriveableData implements IInventory{
	
	//Name of this driveable's type
	public String type;
	//The sizes of each inventory, like bombs and stuff
	public int numGuns, numBombs, numMissiles, numCargo;
	//The inventory stacks
	public ItemStack [] ammo, bombs, missiles, cargo;
	//The engine in the vehicle
	public PartType engine;

}
