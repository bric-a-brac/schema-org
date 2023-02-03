package io.github.fabricetheytaz.schema.org;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.google.gson.Gson;
import io.github.fabricetheytaz.schema.org.types.Thing;

public class ThingTest extends Assertions
	{
	private static final Gson GSON = new Gson();

	@Test
	public void testSameAs()
		{
		final Thing thing = new Thing();

		assertEquals("{\"@type\":\"Thing\"}", GSON.toJson(thing));

		//thing.getSameAs().add("xxxxxxxxx");
		//thing.getSameAs().clear();

		assertTrue(thing.getSameAs().isEmpty());

		// Liste vide pas sérialisée
		//assertEquals("{\"@type\":\"Thing\"}", GSON.toJson(thing));

		thing.getSameAs().add("twitter");
		thing.getSameAs().add("facebook");
		thing.getSameAs().add("instagram");

		assertEquals("{\"@type\":\"Thing\",\"sameAs\":[\"twitter\",\"facebook\",\"instagram\"]}", GSON.toJson(thing));
		}
	}
