package com.biggerenderchest.mixin;

import net.minecraft.world.inventory.PlayerEnderChestContainer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(PlayerEnderChestContainer.class)
public class PlayerEnderChestContainerMixin {
    @ModifyArg(
        method = "<init>",
        at = @At(value = "INVOKE", target = "Lnet/minecraft/world/SimpleContainer;<init>(I)V"),
        index = 0
    )
    private static int modifyEnderChestSize(int originalSize) {
        return 54;
    }
}
