package com.flansmod.common;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("flansmod")
public class FlansMod {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	//Core mod stuff
	public static boolean DEBUG = false;
	public static ModConfig configFile;
	public static final String MODID = "flansmod";
	public static final String NAME = "Flans Mod Ultimate 1.15.2 Edition";
	public static final String VERSION = "1.0.0";
	
	public static boolean gunCarryLimitEnable = false;
    public static int gunCarryLimit = 3;
    public static int breakableArmor = 0;
    public static int defaultArmorDurability = 500;
    public static boolean armsEnable = true;
    public static boolean casingEnable = true;
    public static boolean crosshairEnable = false;
    public static boolean hitCrossHairEnable = true;
    public static boolean hdHitCrosshair = false;
	public static boolean bulletGuiEnable = true;
    public static float hitCrossHairColor[] = new float[]{ 1.0F, 1.0F, 1.0F, 1.0F };
    public static boolean addGunpowderRecipe = true;
    public static boolean addAllPaintjobsToCreative = false;
    public static int ticker = 0;
    public static File flanDir;
    
    public static ItemGroup tabFlans = new CreativeTabFlan();
	
	public FlansMod() {
		
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
		
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		
		LOGGER.info("Flans Mod is now preinitializing");
		
		//Creates the Flan folder
		
		flanDir = new File("Flan");
		if (!flanDir.exists()) {
			
			LOGGER.info("Flan folder not found. Creating empty folder.");
			LOGGER.info("You should get some content packs and put them in the Flan folder.");
			flanDir.mkdir();
			flanDir.mkdirs();
			
		}
		
	}
	
	private void doClientStuff(final FMLClientSetupEvent event) {
		
		LOGGER.info("Flans Mod is now initializing");
		
	}
	
	private void enqueueIMC(final InterModEnqueueEvent event) {
		
		
		
	}
	
	private void processIMC(final InterModProcessEvent event) {
		
		
		
	}
	
	@SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        
        LOGGER.info("Flans Mod is installed on this server");
        
    }
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
        	
            
            
        }
        
    }

}
