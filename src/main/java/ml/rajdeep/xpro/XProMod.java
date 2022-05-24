package ml.rajdeep.xpro;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ml.rajdeep.xpro.XPriteMaterial;
import ml.rajdeep.xpro.XPriteAxeItem;
import ml.rajdeep.xpro.XPritePickaxeItem;
import ml.rajdeep.xpro.XPriteHoeItem;

public class XProMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("xpro");

	// Register XPrite
	public static final Item XPriteItem = new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64));
	public static ToolItem XPRITE_SHOVEL = new ShovelItem(XPriteMaterial.INSTANCE, 500.0F, -1.0F, new Item.Settings().group(ItemGroup.TOOLS));
	public static ToolItem XPRITE_SWORD = new SwordItem(XPriteMaterial.INSTANCE, (int) 20000.0F, 5000F, new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem XPRITE_PICKAXE = new XPritePickaxeItem(XPriteMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
	public static ToolItem XPRITE_AXE = new XPriteAxeItem(XPriteMaterial.INSTANCE, (int) 15000.0F, 2500F, new Item.Settings().group(ItemGroup.TOOLS));
	public static ToolItem XPRITE_HOE = new XPriteHoeItem(XPriteMaterial.INSTANCE, (int) 250.0F, -1.0F, new Item.Settings().group(ItemGroup.TOOLS));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Initialization successfull!");

		Registry.register(Registry.ITEM, new Identifier("xpro", "xprite"), XPriteItem);
		Registry.register(Registry.ITEM, new Identifier("xpro", "xprite_sword"), XPRITE_SWORD);
		Registry.register(Registry.ITEM, new Identifier("xpro", "xprite_shovel"), XPRITE_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("xpro", "xprite_axe"), XPRITE_AXE);
		Registry.register(Registry.ITEM, new Identifier("xpro", "xprite_hoe"), XPRITE_HOE);
		Registry.register(Registry.ITEM, new Identifier("xpro", "xprite_pickaxe"), XPRITE_PICKAXE);
	}
}
