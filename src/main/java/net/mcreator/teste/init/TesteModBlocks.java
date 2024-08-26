
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.teste.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.teste.TesteMod;

public class TesteModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TesteMod.MODID);
	public static final RegistryObject<Block> CRAFTINGTABLE = REGISTRY.register("craftingtable", () -> new CraftingtableBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
