package org.usfirst.frc.team2583.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// Drivetrain motor IDs
	public static final int fLeft  = 0,
							fRight = 1,
							bLeft  = 2,
							bRight = 3;
	
	// Encoder ports
	public static final int leftEnc1  = 0,
							leftEnc2  = 1,
							rightEnc1 = 2,
							rightEnc2 = 3;
	
	// Potentiometer values
	public static final int    potChannel = 0;
	public static final double potRange   = 360,
							   potOffset  = 0;
	
	// Port for the XBox controller
	public static final int XBoxPort = 0;
	
	// XBox Controller axis channels
	public static final int leftX  		 = 0,
							leftY  		 = 1,
							leftTrigger  = 2,
							rightTrigger = 3,
							rightX 		 = 4,
							rightY 		 = 5;
}
