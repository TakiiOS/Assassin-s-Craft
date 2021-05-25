
package net.taki.assassin.world.structure;

import net.taki.assassin.world.WorldThethirdcrusade1189;
import net.taki.assassin.world.WorldItaly1459;
import net.taki.assassin.ElementsAssassincrownMod;

import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;

import java.util.Random;

@ElementsAssassincrownMod.ModElement.Tag
public class StructureNormal_watchtower extends ElementsAssassincrownMod.ModElement {
	public StructureNormal_watchtower(ElementsAssassincrownMod instance) {
		super(instance, 146);
	}

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		boolean isNetherType = false;
		if (dimID == 0)
			dimensionCriteria = true;
		if (dimID == WorldItaly1459.DIMID) {
			dimensionCriteria = true;
			isNetherType = WorldItaly1459.NETHER_TYPE;
		}
		if (dimID == WorldThethirdcrusade1189.DIMID) {
			dimensionCriteria = true;
			isNetherType = WorldThethirdcrusade1189.NETHER_TYPE;
		}
		if (!dimensionCriteria)
			return;
		if ((random.nextInt(1000000) + 1) <= 4000) {
			int count = random.nextInt(1) + 1;
			for (int a = 0; a < count; a++) {
				int i = i2 + random.nextInt(16) + 8;
				int k = k2 + random.nextInt(16) + 8;
				int height = 255;
				if (isNetherType) {
					boolean notpassed = true;
					while (height > 0) {
						if (notpassed && world.isAirBlock(new BlockPos(i, height, k)))
							notpassed = false;
						else if (!notpassed && !world.isAirBlock(new BlockPos(i, height, k)))
							break;
						height--;
					}
				} else {
					while (height > 0) {
						if (!world.isAirBlock(new BlockPos(i, height, k)))
							break;
						height--;
					}
				}
				int j = height - 1;
				IBlockState blockAt = world.getBlockState(new BlockPos(i, j + 1, k));
				boolean blockCriteria = false;
				IBlockState require;
				require = Blocks.GRASS.getDefaultState();
				if (blockAt.getBlock() == require.getBlock())
					blockCriteria = true;
				require = Blocks.DIRT.getStateFromMeta(2);
				try {
					if ((blockAt.getBlock() == require.getBlock())
							&& (blockAt.getBlock().getMetaFromState(blockAt) == require.getBlock().getMetaFromState(require)))
						blockCriteria = true;
				} catch (Exception e) {
					if (blockAt.getBlock() == require.getBlock())
						blockCriteria = true;
				}
				if (!blockCriteria)
					continue;
				boolean biomeCriteria = false;
				Biome biome = world.getBiome(new BlockPos(i, j, k));
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("assassincrown:nomanlands")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("assassincrown:italianplains")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("assassincrown:syrianplains")))
					biomeCriteria = true;
				if (!biomeCriteria)
					continue;
				if (world.isRemote)
					return;
				Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
						new ResourceLocation("assassincrown", "basic_watchtower"));
				if (template == null)
					return;
				Rotation rotation = Rotation.values()[random.nextInt(3)];
				Mirror mirror = Mirror.values()[random.nextInt(2)];
				BlockPos spawnTo = new BlockPos(i, j + -1, k);
				IBlockState iblockstate = world.getBlockState(spawnTo);
				world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
				template.addBlocksToWorldChunk(world, spawnTo, new PlacementSettings().setRotation(rotation).setMirror(mirror)
						.setChunk((ChunkPos) null).setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
			}
		}
	}
}
