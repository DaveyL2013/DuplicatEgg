package net.DaveyL2013.duplicategg;

import java.util.ArrayList;
import java.util.Random;

import net.fabricmc.api.ModInitializer;

public class DuplicatEgg implements ModInitializer {
	@Override
	public void onInitialize() {
		ArrayList<String> consoleSplashes = new ArrayList<String>();
		consoleSplashes.add("Have fun with your DuplicatEgg'd Dragon Eggs!");
		consoleSplashes.add("I've done it! I've DuplicatEgg'd Dragon Eggs!");
		consoleSplashes.add("All new DuplicatEgg technology has allowed us to refill the Dragons!");
		consoleSplashes.add("Welcome to DuplicatEgg. Enjoy your modified gameplay!");
		consoleSplashes.add("This message was brought to you by DuplicatEgg! Refill your dragons today!");
		consoleSplashes.add("Oh! I see what you did there! It's DuplicatEgg, like Duplicate Egg!");
		consoleSplashes.add("Sorry, it's my break. No DuplicatEgg for you. What? Nevermind, my break's over.");
		consoleSplashes.add("Thank's for using Eggliduc- dang it! It's DuplicatEgg! I suck at this!");
		consoleSplashes.add("Today's console message was sponsored by DuplicatEgg! Get more Dragon Egg's today!");
		consoleSplashes.add("Collect all 10 of DuplicatEgg's \"funny\" messages to win a gold egg-shaped nothing!");
		Random r = new Random();

		String consoleSplash = consoleSplashes.get(r.ints(0, (consoleSplashes.size())).findFirst().getAsInt());
		System.out.println(consoleSplash);
	}
}