package io.github.fabricetheytaz.schema.org.types;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class BusTrip extends Trip<BusStop>
	{
	/**
	 * @since 0.1.0
	 */
	public BusTrip()
		{
		this("BusTrip");
		}

	/**
	 * @since 0.1.0
	 */
	protected BusTrip(final String type)
		{
		super(type);
		}
	}

	/*
	arrivalBusStop
	busName
	busNumber
	departureBusStop
	*/