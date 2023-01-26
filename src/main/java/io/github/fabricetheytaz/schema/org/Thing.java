package io.github.fabricetheytaz.schema.org;

import com.google.gson.annotations.SerializedName;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Thing
	{
	@SerializedName("@context")
	protected String context;

	@SerializedName("@type")
	protected String type;

	@SerializedName("@id")
	protected String id;

	protected String description;
	protected String name;
	protected String url;

	/**
	 * @since 0.1.0
	 */
	public Thing()
		{
		super();

		this.type = "Thing";
		}

	/**
	 * @since 0.1.0
	 */
	public final String getContext()
		{
		return context;
		}

	/**
	 * @since 0.1.0
	 */
	public final String getType()
		{
		return type;
		}

	/**
	 * @since 0.1.0
	 */
	public final String getId()
		{
		return id;
		}

	/**
	 * @since 0.1.0
	 */
	public final String getDescription()
		{
		return description;
		}

	/**
	 * @since 0.1.0
	 */
	public final void setDescription(final String description)
		{
		this.description = description;
		}

	/**
	 * @since 0.1.0
	 */
	public final String getName()
		{
		return name;
		}

	/**
	 * @since 0.1.0
	 */
	public final void setName(final String name)
		{
		this.name = name;
		}

	/**
	 * @since 0.1.0
	 */
	public final String getUrl()
		{
		return url;
		}

	/**
	 * @since 0.1.0
	 */
	public final void setUrl(final String url)
		{
		this.url = url;
		}
	}
