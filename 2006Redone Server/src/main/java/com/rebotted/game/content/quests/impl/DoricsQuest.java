package com.rebotted.game.content.quests.impl;

import com.rebotted.game.players.Player;

/**
 * Doric's Quest
 * @author Andrew (Mr Extremez)
 */

public class DoricsQuest {

	public static void showInformation(Player client) {
		for (int i = 8144; i < 8195; i++) {
			client.getPacketSender().sendFrame126("", i);
		}
		client.getPacketSender().sendFrame126("@dre@Dorics Quest", 8144);
		client.getPacketSender().sendFrame126("", 8145);
		if (client.doricQuest == 0) {
			client.getPacketSender().sendFrame126("Dorics Quest", 8144);
			client.getPacketSender().sendFrame126(
					"I can start this quest by speaking to doric", 8147);
			client.getPacketSender().sendFrame126("Northwest of falador.",
					8148);
			client.getPacketSender().sendFrame126("", 8149);
			client.getPacketSender().sendFrame126(
					"Recommended Levels: 15 Mining", 8150);
		} else if (client.doricQuest == 1) {
			client.getPacketSender().sendFrame126("Dorics Quest", 8144);
			client.getPacketSender().sendFrame126(
					"@str@I've talked to the doric.", 8147);
			client.getPacketSender().sendFrame126(
					"He wants me to gather the following materials:", 8148);
			if (client.getItemAssistant().playerHasItem(434, 6)) {
				client.getPacketSender().sendFrame126("@str@6 Clay", 8149);
			} else {
				client.getPacketSender().sendFrame126("@red@6 Clay", 8149);
			}
			if (client.getItemAssistant().playerHasItem(436, 4)) {
				client.getPacketSender().sendFrame126("@str@4 Copper", 8150);
			} else {
				client.getPacketSender().sendFrame126("@red@4 Copper", 8150);
			}
			if (client.getItemAssistant().playerHasItem(440, 2)) {
				client.getPacketSender().sendFrame126("@str@2 Iron ore", 8151);
			} else {
				client.getPacketSender().sendFrame126("@red@2 Iron ore", 8151);
			}
		} else if (client.doricQuest == 2) {
			client.getPacketSender().sendFrame126("Dorics Quest", 8144);
			client.getPacketSender().sendFrame126(
					"@str@I talked to the doric.", 8147);
			client.getPacketSender().sendFrame126(
					"@str@I gave the doric his items.", 8148);
			client.getPacketSender().sendFrame126(
					"I should go speak to the doric.", 8149);
		} else if (client.doricQuest == 3) {
			client.getPacketSender().sendFrame126("Dorics Quest", 8144);
			client.getPacketSender().sendFrame126(
					"@str@I talked to the doric.", 8147);
			client.getPacketSender().sendFrame126(
					"@str@I gave him his items.", 8148);
			client.getPacketSender().sendFrame126("@red@     QUEST COMPLETE",
					8150);
			client.getPacketSender().sendFrame126(
					"As a reward, I gained 26000 Mining Exp", 8151);
			client.getPacketSender().sendFrame126("180 Coins", 8152);
			client.getPacketSender().sendFrame126("And 1 Quest Point.", 8152);
		}
		client.getPacketSender().showInterface(8134);
	}

}
