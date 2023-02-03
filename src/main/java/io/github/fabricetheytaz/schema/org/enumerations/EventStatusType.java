package io.github.fabricetheytaz.schema.org.enumerations;

import com.google.gson.annotations.SerializedName;
import io.github.fabricetheytaz.schema.org.annotations.Enumeration;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Enumeration
public enum EventStatusType
	{
	@SerializedName("https://schema.org/EventCancelled")
	EventCancelled,

	@SerializedName("https://schema.org/EventMovedOnline")
	EventMovedOnline,

	@SerializedName("https://schema.org/EventPostponed")
	EventPostponed,

	@SerializedName("https://schema.org/EventRescheduled")
	EventRescheduled,

	@SerializedName("https://schema.org/EventScheduled")
	EventScheduled
	}
