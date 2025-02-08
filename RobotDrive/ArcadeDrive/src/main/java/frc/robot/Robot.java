// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.util.sendable.SendableRegistry;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;


public class Robot extends TimedRobot {

   private CANSparkMax leftMotor1 = new CANSparkMax(0, MotorType.kBrushed);  
   private CANSparkMax leftMotor2 = new CANSparkMax(1, MotorType.kBrushed);  
   private CANSparkMax rightMotor1 = new CANSparkMax(2, MotorType.kBrushed);  
   private CANSparkMax rightMotor2 = new CANSparkMax(3, MotorType.kBrushed);
  
   private MotorControllerGroup left_side = new MotorControllerGroup(leftMotor1 , leftMotor2);
   private MotorControllerGroup right_side = new MotorControllerGroup(rightMotor1 , rightMotor2);
   
   DifferentialDrive robot_drive = new DifferentialDrive(left_side , right_side);
   private Joystick joy1 = new Joystick(0);

  @Override
  public void robotInit() {
    
    SendableRegistry.addChild(robot_drive , leftMotor1);
    SendableRegistry.addChild(robot_drive , rightMotor1);
    //kodu daha düzgün hale getirmek ve görselleştirmek için kullanılmıştır , hiyerarşik bir sistemdir

    left_side.setInverted(false);
    right_side.setInverted(true);
  }

  
  @Override
  public void autonomousInit() {
   
  }

  
  @Override
  public void autonomousPeriodic() {
    
  }

  
  @Override
  public void teleopInit() {}

  
  @Override
  public void teleopPeriodic() {
   
    double speed = -joy1.getRawAxis(1) * 0.6;
    double turn = joy1.getRawAxis(4) * 0.3;
     
    double left = speed + turn;
    double right = speed - turn;

    robot_drive.arcadeDrive(speed, turn);//hem hız hem dönüş kontrolü yapar

    SmartDashboard.putNumber("Left Motor 1 Speed", leftMotor1.get());
    SmartDashboard.putNumber("Left Motor 2 Speed", leftMotor2.get());
    SmartDashboard.putNumber("Right Motor 1 Speed", rightMotor1.get());
    SmartDashboard.putNumber("Right Motor 2 Speed", rightMotor2.get());
    
    //Motor hızlarını gerçek zamanlı olarak görmek için SmartDashboard kullanımı eklenmiştir.
    //sorun giderme konusunda oldukça işe yarar .
  }

   @Override
  public void testInit() {}

   @Override
  public void testPeriodic() {}
}