package com.flansmod.common;

import javax.annotation.Nonnull;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class CreativeTabFlan extends ItemGroup{
	
	public int type;
	public int icon;
	public String Bruh = "bruh";
	
	public CreativeTabFlan() {
		
		super(FlansMod.MODID);
		
	}
	
	@Nonnull
	@Override
	public ItemStack createIcon() {
		
		icon = FlansMod.ticker / 20;
		
		return new ItemStack(Items.BLUE_WOOL);
		
	}
	
	@Nonnull
	@Override
	public String getTranslationKey() {
		
		return Bruh;
		
	}

}
