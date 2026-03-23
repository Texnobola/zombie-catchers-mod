package zombie.catchers.client.model;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import zombie.catchers.Zombiecatchers;
import zombie.catchers.item.HarpoonGunItem;

public class HarpoonGunModel extends GeoModel<HarpoonGunItem> {

    @Override
    public ResourceLocation getModelResource(HarpoonGunItem item) {
        return new ResourceLocation(Zombiecatchers.MOD_ID, "geo/harpoon_gun.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HarpoonGunItem item) {
        return new ResourceLocation(Zombiecatchers.MOD_ID, "textures/item/harpoon_gun_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HarpoonGunItem item) {
        return new ResourceLocation(Zombiecatchers.MOD_ID, "animations/harpoon_gun.animation.json");
    }
}