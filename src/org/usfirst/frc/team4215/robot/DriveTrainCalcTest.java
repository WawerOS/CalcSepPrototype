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
}
