// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.util.sendable.SendableRegistry;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import edu.wpi.first.wpilibj.Encoder;

/**
 * The methods in this class are called automatically corresponding to each mode, as described in
 * the TimedRobot documentation. If you change the name of this class or the package after creating
 * this project, you must also update the manifest file in the resource directory.
 */
public class Robot extends TimedRobot {
  private SparkMax leftMotor1 = new SparkMax(0, MotorType.kBrushed);  
  private SparkMax leftMotor2 = new SparkMax(1, MotorType.kBrushed);  
  private SparkMax rightMotor1 = new SparkMax(2, MotorType.kBrushed);  
  private SparkMax rightMotor2 = new SparkMax(3, MotorType.kBrushed);

  private MotorControllerGroup left_side = new MotorControllerGroup(leftMotor1 , leftMotor2);
  private MotorControllerGroup right_side = new MotorControllerGroup(rightMotor1 , rightMotor2);

  DifferentialDrive m_robotDrive = new DifferentialDrive(left_side , right_side);

  //Encoder tanımlaması yapıldı (A ve B kanalları)
  private final Encoder leftEncoder = new Encoder(0, 1);
  private final Encoder rightEncoder = new Encoder(2, 3);

  // Gitmek istediğimiz mesafe (metre cinsinden)
  private static final double TARGET_DISTANCE = 2.0; // ileri gitme mesafesi 2 m
  private static final double TURN_DISTANCE = 0.5; // dönüş mesafesi 50 cm
  private boolean turning = false; // dönüş yapılıp yapılmadığını kontrol eder.

  private final XboxController m_controller = new XboxController(0);
  private final Timer m_timer = new Timer();

  /** Called once at the beginning of the robot program. */
  public Robot() {
    SendableRegistry.addChild(m_robotDrive, left_side);
    SendableRegistry.addChild(m_robotDrive, right_side);

    left_side.setInverted(false);
    right_side.setInverted(true);

    SmartDashboard.putNumber("Left Motor 1 Speed", leftMotor1.get());
    SmartDashboard.putNumber("Left Motor 2 Speed", leftMotor2.get());
    SmartDashboard.putNumber("Right Motor 1 Speed", rightMotor1.get());
    SmartDashboard.putNumber("Right Motor 2 Speed", rightMotor2.get());

    leftEncoder.setDistancePerPulse(0.000117); // 6 inç tekerlek ve 4096 PPR encoder 1 pulse = 0.000117 metre
    rightEncoder.setDistancePerPulse(0.000117); // 6 inç tekerlek ve 4096 PPR encoder    1 pulse = 0.000117 metre

    leftEncoder.reset();
    rightEncoder.reset();
  }


  @Override
  public void autonomousInit() {
    leftEncoder.reset();
    rightEncoder.reset();
    turning = false;
    // m_timer.get()
  }


  @Override
  public void autonomousPeriodic() {
    double leftDistance = leftEncoder.getDistance();
    double rightDistance = rightEncoder.getDistance();

    double avgDistance = (leftDistance + rightDistance) / 2.0;

    SmartDashboard.putNumber("Left Distance", leftDistance);
    SmartDashboard.putNumber("Right Distance", rightDistance);
    SmartDashboard.putNumber("Average Distance", avgDistance);

    if (!turning) {
      if (avgDistance < TARGET_DISTANCE)  {
      //forward
      m_robotDrive.arcadeDrive(0.5, 0.0, false);// %50 hizla ileri git
      } else {
        turning = true;
        leftEncoder.reset();
        rightEncoder.reset();
      }
    } else {
      double turnDistance = (Math.abs(leftEncoder.getDistance()) + Math.abs(rightEncoder.getDistance())) / 0.2;
      if (turnDistance < TURNT_DISTANCE) {
        m_robotDrive.arcadeDrive(0.0, 0.5, false); // %50 hızla sağ dön
      } else {
        m_robotDrive.stopMotor();
      }
   
    }
 }


  @Override
  public void teleopInit() {}


  @Override
  public void teleopPeriodic() {
    double speed = -m_controller.getLeftY() * 0.6; // Sol joystick Y ekseni
    double turn = m_controller.getRightX() * 0.3;  // Sağ joystick X ekseni

    double leftPower = speed + turn;
    double rightPower = speed - turn;

    m_robotDrive.arcadeDrive(speed, turn);
  }

  
  @Override
  public void testInit() {}


  @Override
  public void testPeriodic() {}
}
