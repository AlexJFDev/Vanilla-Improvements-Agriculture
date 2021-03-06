package dev.alexjf.homegrown.block;

import dev.alexjf.homegrown.item.HomegrownItems;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.GourdBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class HomegrownBlocks {
    static String MOD_ID = "homegrown";
    
    public static final Block OAK_LOG_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block STRIPPED_OAK_LOG_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block OAK_WOOD_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block STRIPPED_OAK_WOOD_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block OAK_PLANKS_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final PostCropBlock TOMATO_CROP = new TomatoPostCropBlock(AbstractBlock.Settings.of(Material.SOLID_ORGANIC).nonOpaque().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
	public static final Block CANTALOUPE_BLOCK = new CantaloupeBlock(AbstractBlock.Settings.of(Material.GOURD, MapColor.LIME).strength(1.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ATTACHED_CANTALOUPE_STEM = new HomegrownAttachedStemBlock((GourdBlock)CANTALOUPE_BLOCK, () -> {
		return HomegrownItems.CANTALOUPE_SEEDS;
	}, AbstractBlock.Settings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.WOOD));
	public static final Block CANTALOUPE_STEM = new HomegrownStemBlock((GourdBlock)CANTALOUPE_BLOCK, () -> {
		return HomegrownItems.CANTALOUPE_SEEDS;
	}, AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.STEM));
	

    public static void init(){
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"oak_planks_post"), OAK_PLANKS_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"oak_log_post"), OAK_LOG_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stripped_oak_log_post"), STRIPPED_OAK_LOG_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"oak_wood_post"), OAK_WOOD_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stripped_oak_wood_post"), STRIPPED_OAK_WOOD_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"tomato"), TOMATO_CROP);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"cantaloupe_block"), CANTALOUPE_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"attached_cantaloupe_stem"), ATTACHED_CANTALOUPE_STEM);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"cantaloupe_stem"), CANTALOUPE_STEM);
    }
}
