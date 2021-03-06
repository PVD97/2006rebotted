package com.rebotted.game.content.skills.farming;

import com.rebotted.game.players.Player;

/**
 * Farming
 * @author Andrew (Mr Extremez)
 */

public class Farming {
	
	public static void openGuide(Player player, int objectType) {
		if (Flowers.isFlower(player, objectType)) {
			player.getSkillInterfaces().farmingComplex(6);
			player.getSkillInterfaces().selected = 20;
		} else if (Herbs.isHerb(player, objectType)) {
			player.getSkillInterfaces().farmingComplex(7);
			player.getSkillInterfaces().selected = 20;
		} else if (Allotments.isAllotment(player, objectType)) {
			player.getSkillInterfaces().farmingComplex(1);
			player.getSkillInterfaces().selected = 20;
		}
	}

}
