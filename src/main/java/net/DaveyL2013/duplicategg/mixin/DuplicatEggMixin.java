package net.DaveyL2013.duplicategg.mixin;

import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.boss.dragon.EnderDragonFight;
import net.minecraft.server.world.ServerWorld;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EnderDragonFight.class)
public class DuplicatEggMixin {
	@Shadow
	@Final
	@Mutable
	boolean previouslyKilled;
	ServerWorld world;

	@Inject(at = @At("HEAD"), method = "dragonKilled")
	private void mixinDragonKilled(EnderDragonEntity enderDragon, CallbackInfo ci) {
		System.out.println(previouslyKilled);
		this.previouslyKilled = false;
		System.out.println(previouslyKilled);
	}
}