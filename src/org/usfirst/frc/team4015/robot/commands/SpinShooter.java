package org.usfirst.frc.team4015.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4015.robot.OI;
import org.usfirst.frc.team4015.robot.Robot;


/* ===================================================
 * This command spins the shooter wheels forward using a 
 * joystick button.
 * =================================================*/

public class SpinShooter extends Command
{
	public SpinShooter()
	{
		requires(Robot.shooter);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize()
	{
		Robot.shooter.stop();
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute()
	{
		if (OI.leftStick.getRawButton(4))
		{
			Robot.shooter.spin();
		}
		else
		{
			Robot.shooter.stop();
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
		Robot.shooter.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted()
	{
		Robot.shooter.stop();
	}
}
