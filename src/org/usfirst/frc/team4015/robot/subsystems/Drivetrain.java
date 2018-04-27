package org.usfirst.frc.team4015.robot.subsystems;

import org.usfirst.frc.team4015.robot.RobotMap;
import org.usfirst.frc.team4015.robot.commands.Drive;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/* ===================================================
 * This class contains the methods required to drive 
 * the robot (tank drive).  The chassis uses 4 CIM 
 * motors, each controlled by a Spark.  The left and
 * right sparks are connected to the same PWM channel
 * via Y-cables.
 * =================================================*/

public class Drivetrain extends Subsystem
{	
	public Spark leftMotors;
	public Spark rightMotors;
	public DifferentialDrive chassis;
	
	// CONSTRUCTOR //
	
	public Drivetrain()
	{
		leftMotors = new Spark(RobotMap.leftMotors);
		rightMotors = new Spark(RobotMap.rightMotors);	
		chassis = new DifferentialDrive(leftMotors, rightMotors);
	}
	
	// TANK DRIVE //
	
	public void tankDrive(double throttle, double yaw)
	{
		chassis.arcadeDrive(throttle, yaw);
	}
	
	// STOP //
	
	public void stop()
	{
		tankDrive(0, 0);
	}
	
	// SET DEFAULT COMMAND //
	
	public void initDefaultCommand()
	{
		 setDefaultCommand(new Drive());
	}
}
