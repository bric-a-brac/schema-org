package io.github.fabricetheytaz.schema.org;

import java.lang.reflect.Method;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Stream;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.fabricetheytaz.schema.org.annotations.Property;
import io.github.fabricetheytaz.schema.org.types.Thing;
import io.github.fabricetheytaz.util.AnnotationHelper;
import io.github.fabricetheytaz.util.ReflectionHelper;

import static io.github.fabricetheytaz.util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class SchemaOrg
	{
	public static final String CONTEXT = "https://schema.org";

	private static final String PACKAGE = Thing.class.getPackageName();

	private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

	/**
	 * @since 0.1.0
	 */
	public static final String toJSON(final Thing thing)
		{
		return GSON.toJson(notNull(thing));
		}

	/*
	public static final String toJSONLD(final Thing thing)
		{
		notNull(thing);

		thing.context = SCHEMA_ORG_CONTEXT;

		return GSON.toJson(thing);
		}
	*/

	/**
	 * @since 0.1.0
	 */
	public static final <T extends Thing> io.github.fabricetheytaz.schema.org.annotations.Class getClass(final Class<T> classOfT)
		{
		notNull(classOfT);

		final Optional<io.github.fabricetheytaz.schema.org.annotations.Class> optional = AnnotationHelper.getAnnotation(classOfT, io.github.fabricetheytaz.schema.org.annotations.Class.class);

		return optional.orElse(null);
		}

	/**
	 * @since 0.1.0
	 */
	public static final <T extends Thing> io.github.fabricetheytaz.schema.org.annotations.Class getClass(final T thing)
		{
		return getClass(notNull(thing).getClass());
		}

	/**
	 * @since 0.1.0
	 */
	public static final Optional<Property> getProperty(final Method method)
		{
		return AnnotationHelper.getAnnotation(notNull(method), Property.class);
		}

	/**
	 * @since 0.1.0
	 */
	public static final <T extends Thing> Stream<Method> getMethods(final Class<T> classOfT)
		{
		return ReflectionHelper.getMethods(classOfT, PACKAGE);
		}

	/**
	 * @since 0.1.0
	 */
	public static final <T extends Thing> Stream<Method> getMethods(final T thing)
		{
		return getMethods(notNull(thing).getClass());
		}

	/**
	 * @since 0.1.0
	 */
	public static final <T extends Thing> void setters(final T thing, final Setter<T> setter)
		{
		notNull(setter);

		getMethods(thing).forEach(method ->
			{
			getProperty(method).ifPresent(property ->
				{
				setter.accept(method, property);
				});
			});
		}

	/**
	 * @version 0.1.0
	 * @since 0.1.0
	 */
	@FunctionalInterface
	public static interface Setter<T extends Thing> extends BiConsumer<Method, Property>
		{
		//public void set(final T thing, final Method method, final Property property);
		}
	}
