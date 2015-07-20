package org.usfirst.frc.team4215.robot;
import edu.wpi.first.wpilibj.Joystick;

public class UI {
	Joystick driveStick;
	
	public UI(Joystick driveStick) {
		this.driveStick = driveStick;
	}
	
	public double[] getDriveStick(){
		double xMove = driveStick.getX();
		double yMove = driveStick.getY();
		double zMove = driveStick.getZ();
		
		return UICalc.conditionDriveStick(xMove, yMove, zMove);
	}
}
