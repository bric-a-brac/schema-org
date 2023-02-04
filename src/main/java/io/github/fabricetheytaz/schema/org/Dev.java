package io.github.fabricetheytaz.schema.org;

import io.github.fabricetheytaz.schema.org.types.BusTrip;
import io.github.fabricetheytaz.schema.org.types.Thing;

public class Dev
	{
	public static void type() throws Exception
		{
		final Thing thing = new BusTrip();

		System.out.println(SchemaOrg.getClass(thing));
		System.out.println(SchemaOrg.getClass(BusTrip.class));
		}

	public static void properties()
		{
		SchemaOrg.getMethods(BusTrip.class).forEach(method ->
			{
			SchemaOrg.getProperty(method).ifPresent(property ->
				{
				System.out.println(property.label() + ": " + method.getName());
				});
			});
		}

	public static void setters()
		{
		final BusTrip trip = new BusTrip();

		SchemaOrg.setters(trip, (method, property) ->
			{
			//System.out.println(property.label() + " -> " + method.getName());
			final Class<?> type = method.getParameters()[0].getType();
			System.out.println(type.getCanonicalName());

			try
				{
				method.invoke(trip, property.label());
				}
			catch (Exception e)
				{
				e.printStackTrace();
				}
			});

		System.out.println(SchemaOrg.toJSON(trip));
		}

	public static void main(String[] args) throws Exception
		{
		setters();
		}
	}
