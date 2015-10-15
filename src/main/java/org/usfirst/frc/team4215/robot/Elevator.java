package org.usfirst.frc.team4215.robot;

import edu.wpi.first.wpilibj.Talon;

public class Elevator {
	Talon elevatorMotor;

	public Elevator(Talon elevatorMotor) {
		this.elevatorMotor = elevatorMotor;
	}
	
	public void moveElevator(double speed){
		double adjustedSpeed = ElevatorCalc.elevatorCode(speed);
		elevatorMotor.set(adjustedSpeed);
	}
}
