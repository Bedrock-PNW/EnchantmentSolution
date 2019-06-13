package org.ctp.enchantmentsolution.api.trigger;

import com.google.gson.JsonObject;
import org.bukkit.craftbukkit.libs.jline.internal.Nullable;
import org.ctp.enchantmentsolution.api.shared.DistanceObject;
import org.ctp.enchantmentsolution.api.shared.RangeObject;
import org.ctp.enchantmentsolution.api.util.JsonBuilder;

/**
 * Fires whenever the player is under the levitation status effect.
 */

public class LevitationTrigger extends Trigger {
	private @Nullable RangeObject duration = null;
	private @Nullable DistanceObject distance = null;
	
	public LevitationTrigger() {
		super(Type.LEVITATION);
	}
	
	
	
	/**
	 * @return the duration or null, if none was specified
	 */
	public @Nullable RangeObject getDuration() {
		return duration;
	}
	
	/**
	 * @return information about the distance of the entity or null, if none was specified
	 */
	public @Nullable DistanceObject getDistance() {
		return distance;
	}
	
	
	
	/**
	 * @param duration the duration or null, if it should be cleared
	 * @return the current trigger for chaining
	 */
	public LevitationTrigger setDuration(@Nullable RangeObject duration) {
		this.duration = duration;
		return this;
	}
	
	/**
	 * @param distance information about the distance of the entity or null, if it should be cleared
	 * @return the current trigger for chaining
	 */
	public LevitationTrigger setDistance(@Nullable DistanceObject distance) {
		this.distance = distance;
		return this;
	}
	
	
	
	@Override
	protected JsonObject getConditions() {
		return duration == null && distance == null ? null : new JsonBuilder()
				.add("duration", duration)
				.add("distance", distance)
				.build();
	}
}
