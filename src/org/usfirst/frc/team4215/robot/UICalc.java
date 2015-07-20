package org.usfirst.frc.team4215.robot;

public class UICalc {

	static double[] conditionDriveStick(double xMove, double yMove, double zMove){
		double[] conditionedValues = { 0, 0, 0,};
		
		conditionedValues[0] = xMove;
		conditionedValues[1] = yMove;
		conditionedValues[2] = zMove;
		
		return conditionedValues;
	}

}
