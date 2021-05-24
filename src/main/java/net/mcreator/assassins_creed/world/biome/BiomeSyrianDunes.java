
package net.mcreator.assassins_creed.world.biome;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityChicken;

import net.mcreator.assassins_creed.entity.EntityTemplarofficer;
import net.mcreator.assassins_creed.entity.EntityEagle;
import net.mcreator.assassins_creed.ElementsAssassinsCraftMod;

import java.util.Random;

@ElementsAssassinsCraftMod.ModElement.Tag
public class BiomeSyrianDunes extends ElementsAssassinsCraftMod.ModElement {
	@GameRegistry.ObjectHolder("assassins_craft:syriandunes")
	public static final BiomeGenCustom biome = null;
	public BiomeSyrianDunes(ElementsAssassinsCraftMod instance) {
		super(instance, 162);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("syriandunes").setRainfall(0F).setBaseHeight(0.1F).setWaterColor(-14329397).setHeightVariation(0F)
					.setTemperature(1.25F));
			setRegistryName("syriandunes");
			topBlock = Blocks.SAND.getStateFromMeta(0);
			fillerBlock = Blocks.SANDSTONE.getStateFromMeta(0);
			decorator.generateFalls = false;
			decorator.treesPerChunk = 0;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 1;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
			this.spawnableCreatureList.add(new SpawnListEntry(EntityEagle.EntityCustom.class, 15, 1, 15));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityTemplarofficer.EntityCustom.class, 15, 1, 15));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, 15, 1, 15));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, 15, 1, 15));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 15, 1, 15));
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getGrassColorAtPos(BlockPos pos) {
			return -7442617;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getFoliageColorAtPos(BlockPos pos) {
			return -7442617;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getSkyColorByTemp(float currentTemperature) {
			return -5923733;
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return super.getRandomTreeFeature(rand);
		}
	}
}
