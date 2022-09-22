
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.primitive.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.primitive.item.BarkItem;
import net.mcreator.primitive.PrimitiveMod;

public class PrimitiveModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PrimitiveMod.MODID);
	public static final RegistryObject<Item> BARK = REGISTRY.register("bark", () -> new BarkItem());
}
