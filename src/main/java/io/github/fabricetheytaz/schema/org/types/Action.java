package io.github.fabricetheytaz.schema.org.types;

import io.github.fabricetheytaz.schema.org.annotations.Enumeration;
import io.github.fabricetheytaz.schema.org.enumerations.ActionStatusType;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public abstract class Action extends Thing
	{
	@Enumeration
	protected ActionStatusType actionStatus;

	/**
	 * @since 0.1.0
	 */
	protected Action(final String type)
		{
		super(type);
		}

	/**
	 * @since 0.1.0
	 */
	public final ActionStatusType getActionStatus()
		{
		return actionStatus;
		}

	/**
	 * @since 0.1.0
	 */
	public final void setActionStatus(final ActionStatusType actionStatus)
		{
		this.actionStatus = actionStatus;
		}

	/**
	 * @since 0.1.0
	 */
	public final void setActionStatusActive()
		{
		setActionStatus(ActionStatusType.ActiveActionStatus);
		}

	/**
	 * @since 0.1.0
	 */
	public final void setActionStatusCompleted()
		{
		setActionStatus(ActionStatusType.CompletedActionStatus);
		}

	/**
	 * @since 0.1.0
	 */
	public final void setActionStatusFailed()
		{
		setActionStatus(ActionStatusType.FailedActionStatus);
		}

	/**
	 * @since 0.1.0
	 */
	public final void setActionStatusPotential()
		{
		setActionStatus(ActionStatusType.PotentialActionStatus);
		}
	}
