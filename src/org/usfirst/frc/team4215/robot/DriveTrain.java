package org.usfirst.frc.team4215.robot;

import edu.wpi.first.wpilibj.Talon;

public class DriveTrain {
	Talon frontRight;
	Talon frontLeft;
	Talon backRight;
	Talon backLeft;
	
	public DriveTrain(Talon frontRight, Talon frontLeft, Talon backRight, Talon backLeft) {
		
		this.frontRight = frontRight;
		this.frontLeft = frontLeft; 
		this.backRight = backRight;
		this.backLeft = backLeft;
		
	}

	public void driveByUI(double xMove, double yMove){
		
		
		
	}
}
