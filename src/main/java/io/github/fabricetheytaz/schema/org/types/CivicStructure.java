package io.github.fabricetheytaz.schema.org.types;

import io.github.fabricetheytaz.schema.org.annotations.Class;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Class(type = "CivicStructure")
public class CivicStructure extends Place
	{
	/**
	 * @since 0.1.0
	 */
	public CivicStructure()
		{
		this("CivicStructure");
		}

	/**
	 * @since 0.1.0
	 */
	protected CivicStructure(final String type)
		{
		super(type);
		}
	}
