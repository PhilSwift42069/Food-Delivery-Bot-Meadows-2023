// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */
  
  Talon leftTalon = null;
  Talon rightTalon = null;


  public Drivetrain() {
    
    //Talons
    leftTalon = new Talon(Constants.DRIVETRAIN_LEFT_TALON);
    rightTalon = new Talon(Constants.DRIVETRAIN_RIGHT_TALON);
  }

  SpeedControllerGroup leftMotors = null;
  SpeedControllerGroup rightMotors = null;

  DifferentialDrive differentialDrive = null; 
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
