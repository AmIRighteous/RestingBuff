package com.restingbuff;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Units;

@ConfigGroup("Gielinor Kart")
public interface RestingBuffConfig extends Config
{
	enum Emote {
		DANCE,
		RASPBERRY,
		JOG,
		BOW,
	}

	@ConfigItem(
			keyName = "emoteStart",
			name = "Emote Starter",
			description = "Determines the emote that you use on the start tile to begin a race."
	)
	default Emote emote() {
		return Emote.DANCE;
	}

	@ConfigItem(
			keyName = "showLines",
			name = "Show Start/Finish lines",
			description = "Determines if you show the start/finish tiles"
	)
	default boolean showLines() {
		return true;
	}

}
