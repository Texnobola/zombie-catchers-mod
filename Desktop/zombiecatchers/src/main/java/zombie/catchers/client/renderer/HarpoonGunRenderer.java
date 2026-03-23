package zombie.catchers.client.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;
import zombie.catchers.client.model.HarpoonGunModel;
import zombie.catchers.item.HarpoonGunItem;

public class HarpoonGunRenderer extends GeoItemRenderer<HarpoonGunItem> {

    public HarpoonGunRenderer() {
        super(new HarpoonGunModel());
    }
}