// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ProxSensorTest extends SubsystemBase {

    private AnalogInput proximityInput = new AnalogInput(1);

    public ProxSensorTest() {

    }

    public double getExtensionVoltage() {
        //returns distance in mm
        return proximityInput.getVoltage();
    }


    @Override
    public void periodic() {
    // This method will be called once per scheduler run
        SmartDashboard.putNumber("prox sensor reading: ", this.getExtensionVoltage());
    }

    @Override
    public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
    }
}
