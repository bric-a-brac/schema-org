package io.github.fabricetheytaz.schema.org.types;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class UpdateAction extends Action
	{
	protected Thing targetCollection;

	/**
	 * @since 0.1.0
	 */
	public UpdateAction()
		{
		this("UpdateAction");
		}

	/**
	 * @since 0.1.0
	 */
	protected UpdateAction(final String type)
		{
		super(type);
		}

	/**
	 * @since 0.1.0
	 */
	public final Thing getTargetCollection()
		{
		return targetCollection;
		}

	/**
	 * @since 0.1.0
	 */
	public final void setTargetCollection(final Thing targetCollection)
		{
		this.targetCollection = targetCollection;
		}
	}
