package dev.alexjf.vanilla_improvements_agriculture;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;

public class Crop extends CropBlock {
    public Crop(AbstractBlock.Settings settings) {
        super(settings.nonOpaque());
    }
}