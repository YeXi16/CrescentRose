package org.yexi_16.crescentrose.init.client;

import org.yexi_16.crescentrose.init.animated.AnimatedItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class AnimatedItemRenderer extends GeoItemRenderer<AnimatedItem> {

    public AnimatedItemRenderer() {
        super(new AnimatedItemModel());
    }
}
