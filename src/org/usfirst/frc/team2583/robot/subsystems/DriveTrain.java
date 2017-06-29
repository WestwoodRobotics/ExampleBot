package org.usfirst.frc.team2583.robot.subsystems;

import org.usfirst.frc.team2583.robot.RobotMap;
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

	
	public AnalogPotentiometer pot = new AnalogPotentiometer(RobotMap.potChannel, RobotMap.potRange, RobotMap.potOffset);
	
	// An enum holding the names of the motors, since numbers would be annoying
	public enum Motor {
		FrontLeft,
		FrontRight,
		BackLeft,
		BackRight;
	}
	
	// Initialize the motors
    Talon fl = new Talon(RobotMap.fLeft),
    	  fr = new Talon(RobotMap.fRight),
    	  bl = new Talon(RobotMap.bLeft),
    	  br = new Talon(RobotMap.bRight);
    
    // Combine the motors into one object
    RobotDrive drive = new RobotDrive(fl, bl, fr, br);
    
    // Initialize the encoders
    Encoder leftEncoder = new Encoder(RobotMap.leftEnc1, RobotMap.leftEnc2),
    		rightEncoder = new Encoder(RobotMap.rightEnc1, RobotMap.rightEnc2);
    
    /**
     * The constructor method
     */
    public DriveTrain(){
//    	fl.setInverted(true);	// Uncomment either of these lines to reverse the polarity on a motor
//    	bl.setInverted(true);
    }
    
    /**
     * Runs the motor at a specified percentage speed; mostly for testing.
     * 
     * @param motor the motor to run
     * @param speed a value between -1 and 1 (inclusive)
     */
    public void runMotor(Motor motor, double speed){
    	switch(motor){
    	case FrontLeft:
    		fl.set(speed);
    		break;
    	case FrontRight:
    		fr.set(speed);
    		break;
    	case BackLeft:
    		bl.set(speed);
    		break;
    	case BackRight:
    		br.set(speed);
    	}
    }
    
    /**
     * Sets the default command to run this subsystem as {@link Drive}
     */
    public void initDefaultCommand() {
    	setDefaultCommand(new Drive());
    }
    
    /**
     * Drives the robot in tank mode (each side controlled separately)
     * 
     * @param left The speed for the left wheels
     * @param right The speed for the right wheels
     */
	public void tankDrive(double left, double right) {
		drive.tankDrive(left, right);
	}	
    
    
}

