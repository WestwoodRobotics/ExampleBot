package org.usfirst.frc.team2583.robot.subsystems;

import org.usfirst.frc.team2583.robot.commands.Drive;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

	public AnalogPotentiometer pot = new AnalogPotentiometer(0, 360, 0);
	
    Talon fl = new Talon(3);
    Talon fr = new Talon(0);
    Talon bl = new Talon(2);
    Talon br = new Talon(1);
    RobotDrive drive = new RobotDrive(fl, bl, fr, br);
    
    Encoder leftEncoder = new Encoder(0,1);
    Encoder rightEncoder = new Encoder(2,3);
    
    public void runMotor(double speed){
    	fl.set(speed);
    }
    
    public DriveTrain(){
//    	fl.setInverted(true);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new Drive());
    }
    
	public void tankDrive(double left, double right) {
		drive.tankDrive(left, right);
	}	
    
    
}

