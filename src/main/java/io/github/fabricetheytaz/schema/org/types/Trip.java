package io.github.fabricetheytaz.schema.org.types;

import io.github.fabricetheytaz.schema.org.annotations.Class;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Class(type = "Trip")
public class Trip<T extends Thing> extends Thing
	{
	protected ItemList<T> itinerary;
	protected Organization provider;

	/**
	 * @since 0.1.0
	 */
	public Trip()
		{
		this("Trip");
		}

	/**
	 * @since 0.1.0
	 */
	protected Trip(final String type)
		{
		super(type);
		}

	/**
	 * @since 0.1.0
	 */
	public final ItemList<T> getItinerary()
		{
		synchronized (Trip.class)
			{
			if (itinerary == null)
				{
				itinerary = new ItemList<>();
				}
	
			return itinerary;
			}
		}

	/**
	 * @since 0.1.0
	 */
	public final Organization getProvider()
		{
		return provider;
		}

	/**
	 * @since 0.1.0
	 */
	public final void setProvider(final Organization provider)
		{
		this.provider = provider;
		}
	}

/*
arrivalTime
departureTime
- itinerary
offers
partOfTrip
- provider
subTrip
*/
