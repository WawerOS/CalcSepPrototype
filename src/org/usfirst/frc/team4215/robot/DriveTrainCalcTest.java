package org.usfirst.frc.team4215.robot;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
/*
 * a unit test for DriveTrainCalc
 */
public class DriveTrainCalcTest {
	@Test
	public void checkDriveTrainAlgorithm(){
		// delta chosen based on the precision of ti-83 calculator
		double delta = .000000001;
		
		//inputs chosen to test normalization algorithm
		double[] inputOne = {1, 1, 1};
		double[] inputTwo = {0, 1, .5};
		
		//Precalculated answers calculated using ti-83 calculator
		double[] testOne = { 1, -.4142135624, .4142135624, .171572875};
		double[] testTwo = { 1, -1, -.1715728753, .1715728753};
		
		//generating tests
		double[] testableOne = DriveTrainCalc.mecanumAlgorithm(inputOne);
		double[] testableTwo = DriveTrainCalc.mecanumAlgorithm(inputTwo);;
		
		//testing
		assertArrayEquals(testOne, testableOne, delta);
		assertArrayEquals(testTwo, testableTwo, delta);
	}
	
	@Test
	public void checkProcessAccelerometerData(){
		double delta = .000000001;
		
		double[] inputOne = { 2, -8, 3};
		double[] inputTwo = { -5, 4.53, -6};
		//Output's calculated on ti-83
		double[] outputOne = { 772.176, -3088.704, 1158.264};
		double[] outputTwo = { -1930.44, 1748.97864, -2316.528};
		
		double[] testableOne = DriveTrainCalc.processAccelrometerData(inputOne);
		double[] testableTwo = DriveTrainCalc.processAccelrometerData(inputTwo);
		
		//testing
		assertArrayEquals(outputOne, testableOne, delta);
		assertArrayEquals(outputTwo, testableTwo, delta);
	}
}
