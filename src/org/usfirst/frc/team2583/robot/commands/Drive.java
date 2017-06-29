package org.usfirst.frc.team2583.robot.commands;

import org.usfirst.frc.team2583.robot.Robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Drive extends Command {

    public Drive() {
        requires(Robot.dt);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double leftSpeed  = Robot.oi.x.getY(Hand.kLeft),
    		   rightSpeed = Robot.oi.x.getY(Hand.kRight);
    	
    	Robot.dt.tankDrive(leftSpeed, rightSpeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;	// This command should run for as long as the robot is powered on
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
