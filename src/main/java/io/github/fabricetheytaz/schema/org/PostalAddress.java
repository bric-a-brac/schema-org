package io.github.fabricetheytaz.schema.org;

// TODO: Thing > Intangible > StructuredValue > ContactPoint > PostalAddress

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class PostalAddress extends ContactPoint
	{
	protected String addressLocality;
	protected String postalCode;
	protected String streetAddress;

	/**
	 * @since 0.1.0
	 */
	public PostalAddress()
		{
		this("PostalAddress");
		}

	/**
	 * @since 0.1.0
	 */
	protected PostalAddress(final String type)
		{
		super(type);
		}

	/**
	 * @since 0.1.0
	 */
	public final String getAddressLocality()
		{
		return addressLocality;
		}

	/**
	 * @since 0.1.0
	 */
	public final void setAddressLocality(final String addressLocality)
		{
		this.addressLocality = addressLocality;
		}

	/**
	 * @since 0.1.0
	 */
	public final String getPostalCode()
		{
		return postalCode;
		}

	/**
	 * @since 0.1.0
	 */
	public final void setPostalCode(final String postalCode)
		{
		this.postalCode = postalCode;
		}

	/**
	 * @since 0.1.0
	 */
	public final String getStreetAddress()
		{
		return streetAddress;
		}

	/**
	 * @since 0.1.0
	 */
	public final void setStreetAddress(final String streetAddress)
		{
		this.streetAddress = streetAddress;
		}
	}
