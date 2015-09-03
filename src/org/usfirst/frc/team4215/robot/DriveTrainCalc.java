package org.usfirst.frc.team4215.robot;
/*
 * this is an abstraction of all the calculation the drive train needs to do
 */
public class DriveTrainCalc {
	final static double g = 386.09;

	static public double[] mecanumAlgorithm(double[] inputs){
		/*
		 * Algorithm based on a whitepaper found at 
		 * http://thinktank.wpi.edu/resources/346/ControllingMecanumDrive.pdf
		 */
		double speedOfTranslation = Math.sqrt(Math.pow(inputs[0],2)+Math.pow(inputs[1],2));
		double angleOfTranslation = Math.asin((inputs[1]/speedOfTranslation));
		double rateOfRotation = inputs[2];
		double biggestValue = 0; // to always be smaller then the first value
		double[] voltageMultipliers = { 0, 0, 0, 0,};
		
		voltageMultipliers[0] = Math.sin(angleOfTranslation+Math.PI/4)*speedOfTranslation+rateOfRotation;
		voltageMultipliers[1] = Math.cos(angleOfTranslation+Math.PI/4)*speedOfTranslation-rateOfRotation;
		voltageMultipliers[2] = Math.cos(angleOfTranslation+Math.PI/4)*speedOfTranslation+rateOfRotation;
		voltageMultipliers[3] = Math.sin(angleOfTranslation+Math.PI/4)*speedOfTranslation-rateOfRotation;
		
		//normalization algorithm from paper referenced above
		for(int i = 0; i < 4;i++){
			if( Math.abs(voltageMultipliers[i]) > Math.abs(biggestValue)){
				biggestValue = voltageMultipliers[i];
			}
		}
		if(Math.abs(biggestValue) > 1){
			for(int j = 0; j < 4; j++){
			voltageMultipliers[j] /= biggestValue;
			 }
		}
		
		return voltageMultipliers;
	}
	
	static double[] processAccelrometerData(double[] data){
		//converting g's to f/s^2
		for(int i = 0; i < 3; i++){
			data[i] *= 386.088;
		}
		return data;
	}
}
