package io.github.fabricetheytaz.schema.org.types;

import io.github.fabricetheytaz.schema.org.annotations.Class;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Class
public class LocalBusiness extends Organization
	{
	/**
	 * @since 0.1.0
	 */
	public LocalBusiness()
		{
		this("LocalBusiness");
		}

	/**
	 * @since 0.1.0
	 */
	protected LocalBusiness(final String type)
		{
		super(type);
		}
	}
