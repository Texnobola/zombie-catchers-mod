package zombie.catchers.client.renderer;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoItemRenderer;
import zombie.catchers.item.HarpoonGunItem;
import zombie.catchers.Zombiecatchers;

public class HarpoonGunRenderer extends GeoItemRenderer<HarpoonGunItem> {

    public HarpoonGunRenderer() {
        super(new HarpoonGunModel());
    }
}