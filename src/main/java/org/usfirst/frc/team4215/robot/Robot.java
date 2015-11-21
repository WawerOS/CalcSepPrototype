
package org.usfirst.frc.team4215.robot;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
   Talon frontRight = new Talon(0);
   Talon frontLeft = new Talon(1);
   Talon backRight = new Talon(2);
   Talon backLeft = new Talon(3);
   
   BuiltInAccelerometer accelerometer = new BuiltInAccelerometer();
   
   Joystick driveStick = new Joystick(0);
   Joystick thirdStick = new Joystick(2);
   
   DriveTrain chassis = new DriveTrain(frontRight, frontLeft, backRight, backLeft, accelerometer);
   
   UI driverStation = new UI(driveStick, thirdStick);
   
	
	/**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {

    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        double[] inputs = driverStation.getDriveStick();
        
        chassis.driveBySpeedVector(inputs);
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
