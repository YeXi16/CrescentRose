package org.yexi_16.crescentrose.init.client;

import net.minecraft.resources.ResourceLocation;
import org.yexi_16.crescentrose.Crescentrose;
import org.yexi_16.crescentrose.init.animated.AnimatedItem;
import software.bernie.geckolib.model.GeoModel;

public class AnimatedItemModel extends GeoModel<AnimatedItem> {
    @Override
    public ResourceLocation getModelResource(AnimatedItem animatable) {
        return new ResourceLocation(Crescentrose.MODID,"geo/crescentrose.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AnimatedItem animatable) {
        return new ResourceLocation(Crescentrose.MODID,"textures/item/crescentrose.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AnimatedItem animatable) {
        return new ResourceLocation(Crescentrose.MODID,"animations/model.animation.json");
    }
}
