package io.github.fabricetheytaz.schema.org.types;

import io.github.fabricetheytaz.schema.org.annotations.Class;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Class
public class Organization extends Thing
	{
	protected PostalAddress address;
	protected ContactPoint contactPoint;

	/**
	 * @since 0.1.0
	 */
	public Organization()
		{
		super("Organization");
		}

	/**
	 * @since 0.1.0
	 */
	protected Organization(final String type)
		{
		super(type);
		}

	/**
	 * @since 0.1.0
	 */
	public final PostalAddress getAddress()
		{
		return address;
		}

	/**
	 * @since 0.1.0
	 */
	public final void setAddress(final PostalAddress address)
		{
		this.address = address;
		}

	/**
	 * @since 0.1.0
	 */
	public final ContactPoint getContactPoint()
		{
		return contactPoint;
		}

	/**
	 * @since 0.1.0
	 */
	public final void setContactPoint(final ContactPoint contactPoint)
		{
		this.contactPoint = contactPoint;
		}
	}
