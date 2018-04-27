package org.usfirst.frc.team4015.robot.robotModes;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team4015.robot.commands.Drive;
import org.usfirst.frc.team4015.robot.commands.SpinShooter;
import org.usfirst.frc.team4015.robot.commands.MoveFlap;

/* ===================================================
 * This CommandGroup enables control of the drivetrain
 * and the shooter (wheels and flap).
 * =================================================*/

public class Teleop extends CommandGroup
{
	// CONSTRUCTOR //
	
	public  Teleop()
	{	
    	addParallel(new Drive());
    	addParallel(new SpinShooter());
    	addParallel(new MoveFlap());
    }
	
}
