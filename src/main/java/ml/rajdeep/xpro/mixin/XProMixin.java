package ml.rajdeep.xpro.mixin;

import ml.rajdeep.xpro.XProMod;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class XProMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		XProMod.LOGGER.info("Thanks for using XPro Mod");
	}
}
