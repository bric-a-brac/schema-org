package io.github.fabricetheytaz.schema.org;

// TODO: Thing > Intangible > StructuredValue > ContactPoint 

/**
 * @version 0.1.0
 * @since 0.1.0
 * 
 * @see {@link Thing}
 * @see {@link Intangible}
 * @see {@link StructuredValue}
 */
public class ContactPoint extends Thing
	{
	protected String email;
	protected String telephone;

	/**
	 * @since 0.1.0
	 */
	public ContactPoint()
		{
		this("ContactPoint");
		}

	/**
	 * @since 0.1.0
	 */
	protected ContactPoint(final String type)
		{
		super(type);
		}

	/**
	 * @since 0.1.0
	 */
	public final String getEmail()
		{
		return email;
		}

	/**
	 * @since 0.1.0
	 */
	public final void setEmail(final String email)
		{
		this.email = email;
		}

	/**
	 * @since 0.1.0
	 */
	public final String getTelephone()
		{
		return telephone;
		}

	/**
	 * @since 0.1.0
	 */
	public final void setTelephone(final String telephone)
		{
		this.telephone = telephone;
		}
	}
