package org.usfirst.frc.team4215.robot;

public class DriveTrainCalc {

	public double[] mecanumAlgorithm(double xMove, double yMove, double zMove){
		/*
		 * Algorithm based on a whitepaper found at 
		 * http://thinktank.wpi.edu/resources/346/ControllingMecanumDrive.pdf
		 */
		double speedOfTranslation = Math.sqrt(Math.pow(xMove,2)+Math.pow(yMove,2));
		double angleOfTranslation = Math.asin((yMove/speedOfTranslation));
		double rateOfRotation = zMove;
		double biggestValue = 3; // to always be smaller then the first value
		double[] voltageMultipliers = { 0, 0, 0, 0,};
		
		voltageMultipliers[0] = Math.sin(angleOfTranslation+Math.PI/4)*speedOfTranslation+rateOfRotation;
		voltageMultipliers[1] = Math.cos(angleOfTranslation+Math.PI/4)*speedOfTranslation-rateOfRotation;
		voltageMultipliers[2] = Math.cos(angleOfTranslation+Math.PI/4)*speedOfTranslation+rateOfRotation;
		voltageMultipliers[3] = Math.sin(angleOfTranslation+Math.PI/4)*speedOfTranslation-rateOfRotation;
		
		//normalization algorithm from paper referenced above
		for(int i = 0; i > 3;i++){
			if(Math.abs(voltageMultipliers[i]) > 1 || 
					Math.abs(voltageMultipliers[i]) > Math.abs(biggestValue)){
				biggestValue = voltageMultipliers[i];
			}
		}
		if(biggestValue == 3){
			for(int j = 0; j > 3; j++){
			voltageMultipliers[j] /= biggestValue;
			}
		}
		return voltageMultipliers;
	}
	
}
