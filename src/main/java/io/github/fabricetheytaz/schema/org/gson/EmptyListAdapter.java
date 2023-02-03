package io.github.fabricetheytaz.schema.org.gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public abstract class EmptyListAdapter extends TypeAdapter<List<String>>
	{
	/**
	 * @since 0.1.0
	 */
	public abstract String getName();

	/**
	 * @since 0.1.0
	 */
	@Override
	public final List<String> read(final JsonReader reader) throws IOException
		{
		reader.nextName();

		if (reader.peek() == JsonToken.NULL)
			{
			reader.nextNull();

			return null;
			}

		final List<String> list = new ArrayList<>();

		reader.beginArray();

		while (reader.peek() == JsonToken.STRING)
			{
			list.add(reader.nextString());
			}

		reader.endArray();

		return list;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public void write(final JsonWriter writer, final List<String> list) throws IOException
		{
		if (list == null || list.isEmpty())
			{
			return;
			}

		writer.name(getName());

		writer.beginArray();

		final Iterator<String> iterator = list.listIterator();

		while (iterator.hasNext())
			{
			writer.value(iterator.next());
			}

		writer.endArray();
		}
	}
