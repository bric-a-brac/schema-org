package io.github.fabricetheytaz.schema.org.types;

import io.github.fabricetheytaz.schema.org.annotations.Class;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Class(type = "Place")
public class Place extends Thing
	{
	protected Float latitude;
	protected Float longitude;

	/**
	 * @since 0.1.0
	 */
	public Place()
		{
		this("Place");
		}

	/**
	 * @since 0.1.0
	 */
	protected Place(final String type)
		{
		super(type);
		}

	/**
	 * @since 0.1.0
	 */
	public final Float getLatitude()
		{
		return latitude;
		}

	/**
	 * @since 0.1.0
	 */
	public final void setLatitude(final Float latitude)
		{
		this.latitude = latitude;
		}

	/**
	 * @since 0.1.0
	 */
	public final Float getLongitude()
		{
		return longitude;
		}

	/**
	 * @since 0.1.0
	 */
	public final void setLongitude(final Float longitude)
		{
		this.longitude = longitude;
		}
	}
