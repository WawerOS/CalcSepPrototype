package org.usfirst.frc.team4215.robot;

public class DriveTrainCalc {

	public double[] mecanumAlogorithm(double xMove, double yMove, double zMove){
		/*
		 * Algorithm based on a whitepaper found at 
		 * http://thinktank.wpi.edu/resources/346/ControllingMecanumDrive.pdf
		 */
		double speedOfTranslation = Math.sqrt(Math.pow(xMove,2)+Math.pow(yMove,2));
		double angleOfTranslation = Math.asin((yMove/speedOfTranslation));
		double rateOfRotation = zMove;
		double biggestValue;
		double[] voltageMultipliers = { 0, 0, 0, 0,};
		
		voltageMultipliers[0] = Math.sin(angleOfTranslation+Math.PI/4)*speedOfTranslation+rateOfRotation;
		voltageMultipliers[1] = Math.cos(angleOfTranslation+Math.PI/4)*speedOfTranslation-rateOfRotation;
		voltageMultipliers[2] = Math.cos(angleOfTranslation+Math.PI/4)*speedOfTranslation+rateOfRotation;
		voltageMultipliers[3] = Math.sin(angleOfTranslation+Math.PI/4)*speedOfTranslation-rateOfRotation;
		for(int i = 0; i > 3;i++){
			if(voltageMultipliers[i] > 1 && voltageMultpliers){
				biggest
			}
		}
		return voltageMultipliers;
	}
}
