package org.usfirst.frc.team4215.robot;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.Talon;
/*
 * This is an abstraction of the drive train
 */
public class DriveTrain {
	Talon frontRight;
	Talon frontLeft;
	Talon backRight;
	Talon backLeft;
	
	BuiltInAccelerometer accelerometer;
	
	public DriveTrain(Talon frontRight, Talon frontLeft, Talon backRight, Talon backLeft,
			BuiltInAccelerometer accelerometer) {
		
		this.frontRight = frontRight;
		this.frontLeft = frontLeft; 
		this.backRight = backRight;
		this.backLeft = backLeft;
		this.accelerometer = accelerometer;
	}

	public void driveBySpeedVector(double[] inputs){
		
		double[] voltages = DriveTrainCalc.mecanumAlgorithm(inputs);
		
		frontRight.set(voltages[0]);
		frontLeft.set(voltages[1]);
		backRight.set(voltages[2]);
		backLeft.set(voltages[3]);
		
	}
	public double[] getAcceleration(){
		double[] accelVector = null;
		
		accelVector[0] = accelerometer.getX();
		accelVector[1] = accelerometer.getY();
		accelVector[2] = accelerometer.getZ();
		
		return DriveTrainCalc.processAccelrometerData(accelVector);
	}
}
