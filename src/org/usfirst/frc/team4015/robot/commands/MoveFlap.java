package org.usfirst.frc.team4015.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Timer;

import org.usfirst.frc.team4015.robot.OI;
import org.usfirst.frc.team4015.robot.Robot;

/* ===================================================
 * This command moves the flap up and down using a
 * joystick button.
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
		if (OI.leftStick.getRawButton(1) && !Robot.flap.getUp()) // button = pressed & flap = DOWN ---> flap UP
		{
			Robot.flap.up();
			Timer.delay(0.5);
			Robot.flap.stop();
			Robot.flap.setUp(true);
		}
		else if (!OI.leftStick.getRawButton(1) && Robot.flap.getUp()) // button = NOT pressed & flap = UP ---> flap DOWN
		{
			Robot.flap.down();
			Timer.delay(0.5);
			Robot.flap.stop();
			Robot.flap.setUp(false);
		}
		else // button = NOT pressed & flap = DOWN  or  button = pressed & flap = up ---> STOP FLAP & DO NOTHING
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
