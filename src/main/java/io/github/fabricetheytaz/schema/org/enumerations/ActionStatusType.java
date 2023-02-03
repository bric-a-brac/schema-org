package io.github.fabricetheytaz.schema.org.enumerations;

import com.google.gson.annotations.SerializedName;
import io.github.fabricetheytaz.schema.org.annotations.Enumeration;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Enumeration
public enum ActionStatusType
	{
	@SerializedName("https://schema.org/ActiveActionStatus")
	ActiveActionStatus,

	@SerializedName("https://schema.org/CompletedActionStatus")
	CompletedActionStatus,

	@SerializedName("https://schema.org/FailedActionStatus")
	FailedActionStatus,

	@SerializedName("https://schema.org/PotentialActionStatus")
	PotentialActionStatus
	}
