// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.ProxSensorTest;
import frc.robot.subsystems.RedLine;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {


  // The robot's subsystems and commands are defined here...
  private final XboxController driverController = new XboxController(0);

  private final RedLine redLine = new RedLine();
  private final ProxSensorTest proxSensorTest = new ProxSensorTest();
  
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    final JoystickButton trigger = new JoystickButton(driverController, 1);
    final JoystickButton sideButton = new JoystickButton(driverController, 2);
    final JoystickButton stickBottomLeft = new JoystickButton(driverController, 3);
    final JoystickButton stickBottomRight = new JoystickButton(driverController, 4);
    final JoystickButton stickTopLeft = new JoystickButton(driverController, 5);
    final JoystickButton stickTopRight = new JoystickButton(driverController, 6);
    final JoystickButton base7 = new JoystickButton(driverController, 7);
    final JoystickButton base8 = new JoystickButton(driverController, 8);

    stickBottomLeft.onTrue(
      new RunCommand(
        () -> redLine.movePercentPower(0.5), 
        redLine)
    );

    stickBottomRight.onTrue(
      new RunCommand(
        () -> redLine.movePercentPower(-0.5), 
        redLine)
    );

    sideButton.onTrue(
      new RunCommand(
        () -> redLine.stopMotor(),
        redLine)
    );

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
}
