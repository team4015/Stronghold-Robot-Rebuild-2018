package org.usfirst.frc.team4015.robot.subsystems;

import org.usfirst.frc.team4015.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;

/* ===================================================
 * This class contains methods for controlling the shooter
 * wheels.  The shooter wheels are each controlled by a 
 * CIM motor using Victor 888s on a Y-cable.
 * =================================================*/

public class Shooter extends Subsystem
{
	public Victor shooterMotors;
	
	// CONSTRUCTOR //
	
	public Shooter()
	{
		shooterMotors = new Victor(RobotMap.shooterMotors);
	}
	
	// SPIN SHOOTER WHEELS //
	
	public void spin()
	{
		shooterMotors.set(1);
	}
	
	// STOP SHOOTER MOTORS FROM SPINNING //
	
	public void stop()
	{
		shooterMotors.set(0);
	}

	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
