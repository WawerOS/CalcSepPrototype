package org.usfirst.frc.team4215.robot;
import edu.wpi.first.wpilibj.Joystick;
/**
  and abstraction of the User interface
 */
public class UI {
	Joystick driveStick;
	Joystick thirdStick;
	
	public UI(Joystick driveStick, Joystick thirdStick) {
		this.driveStick = driveStick;
		this.thirdStick = thirdStick;
	}
	
	public double[] getDriveStick(){
		double xMove = driveStick.getX();
		double yMove = driveStick.getY();
		double zMove = driveStick.getZ();
		
		return UICalc.conditionDriveStick(xMove, yMove, zMove);
	}
	
	public double getThirdStick(){
		
		return thirdStick.getY();
	}
}
