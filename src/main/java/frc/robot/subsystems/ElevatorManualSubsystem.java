// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ElevatorConstants;

public class ElevatorManualSubsystem extends SubsystemBase {
  private final TalonFX m_LeftElevatorMotor = new TalonFX(ElevatorConstants.kLeftElevatorDriveID);
  /** Creates a new ElevatorManualSub. */
  public ElevatorManualSubsystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setElevatorSpeed (double eSpeed) {
    m_LeftElevatorMotor.set(TalonFXControlMode.PercentOutput, eSpeed);
  }
}
