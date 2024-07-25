// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class RedLine extends SubsystemBase {

    private Spark motor = new Spark(0);

    /** Creates a new ExampleSubsystem. */
    public RedLine() {
        motor.set(0);
    }

    /**
     * @param speed in which direction and how fast the motor moves, must be withing 1.0 and -1.0
     */

    public void movePercentPower(double speed) {
        motor.set(speed);
    }

    public void stopMotor(){
        motor.set(0.0);
    }


    @Override
    public void periodic() {
    // This method will be called once per scheduler run
    }

    @Override
    public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
    }
}
