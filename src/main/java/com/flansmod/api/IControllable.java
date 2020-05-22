package com.flansmod.api;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

public interface IControllable {
	
	//Fired every tick
	//DeltaX is how far your mouse horizontally
	//DeltaY is how far your mouse vertically
	public void onMouseMoved(int deltaX, int deltaY);
	
	//key is the keycode of the key on your keyboard
	//held shows if it was used
	public boolean pressKey(int key, boolean held);
	
	public void updateKeyHeldState(int key, boolean held);
	
	public Entity getControllingEntity();
	
	public boolean isDead();
	
	//Get the player's view roll
	public float getPlayerRoll();
	
	//Get the player's 3rd person camera distance
	public float getCameraDistance();
	
	@OnlyIn(Dist.CLIENT)
	public LivingEntity getCamera();

}
