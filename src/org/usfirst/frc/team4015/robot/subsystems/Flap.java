package org.usfirst.frc.team4015.robot.subsystems;

import org.usfirst.frc.team4015.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;

/* ===================================================
 * This class contains methods for controlling the shooter
 * flap.  The flap is controlled by a geared-down motor 
 * using a Victor 888.
 * =================================================*/

public class Flap extends Subsystem
{
	public Victor flapMotor;
	
	// CONSTRUCTOR //
	
	public Flap()
	{
		flapMotor = new Victor(RobotMap.flapMotor);
	}
	
	// MOVE FLAP UP //
	
	public void up()
	{
		flapMotor.set(0.5);
	}
	
	// MOVE FLAP DOWN //
	
	public void down()
	{
		flapMotor.set(-0.5);
	}

	// STOP FLAP FROM MOVING //
	
	public void stop()
	{
		flapMotor.set(0);	
	}

	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
