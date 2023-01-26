package io.github.fabricetheytaz.schema.org;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Organization extends Thing
	{
	protected PostalAddress address;
	protected ContactPoint contactPoint;

	/**
	 * @since 0.1.0
	 */
	public Organization()
		{
		super();

		this.type = "Organization";
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
