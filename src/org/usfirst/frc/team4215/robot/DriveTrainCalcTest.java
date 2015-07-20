package org.usfirst.frc.team4215.robot;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
public class DriveTrainCalcTest {
	@Test
	public void checkDriveTrainAlgorithm(){
		// delta chosen based on the precision of ti-83 calculator
		double delta = .000000001;
		double[] testOne = { 1, -.4142135624, .4142135624, .171572875};
		double[] testTwo = { 1, -1, -.1715728753, .1715728753};
		
		double[] testableOne = DriveTrainCalc.mecanumAlgorithm(1, 1, 1);
		double[] testableTwo = DriveTrainCalc.mecanumAlgorithm(0, 1, .5);
		
		assertArrayEquals(testOne, testableOne, delta);
		assertArrayEquals(testTwo, testableTwo, delta);
	}
}
