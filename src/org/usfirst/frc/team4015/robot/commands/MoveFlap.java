package org.usfirst.frc.team4015.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4015.robot.OI;
import org.usfirst.frc.team4015.robot.Robot;

/* ===================================================
 * This command moves the flap up and down using
 * joystick buttons
 * =================================================*/

public class MoveFlap extends Command
{
	public MoveFlap()
	{
		requires(Robot.flap);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize()
	{
		Robot.flap.stop();
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute()
	{
		if (OI.leftStick.getRawButton(5))
		{
			Robot.flap.up();
		}
		else if (OI.leftStick.getRawButton(3))
		{
			Robot.flap.down();
		}
		else
		{
			Robot.flap.stop();
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished()
	{
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end()
	{
		Robot.flap.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted()
	{
		Robot.flap.stop();
	}
}
