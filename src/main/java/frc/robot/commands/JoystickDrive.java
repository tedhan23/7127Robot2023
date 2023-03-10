// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;


public class JoystickDrive extends CommandBase {/*
                                                  The JoystickDrive class extends the CommandBase class
                                                  which allows it to inherit the CommandBase methods
                                                */

  private final DriveTrain m_drive; //Create a new DriveTrain object to hold the given DriveTrain subsystem

  public JoystickDrive(DriveTrain drive) {
    m_drive = drive; //Set the given DiveTrain equal to the Drivetrain in the command

    addRequirements(drive);//tell the computer that this command is using the drivetrain subsystem

    // Use addRequirements() here to declare subsystem dependencies.
  }

  @Override /*
              JoystickDrive already inherits an initialize method from CommandBase
              @Override tells the computer to refer to this initialize method rather than the inherited method
            */
  public void initialize() { // Called once when the command is initially scheduled/run. 

  }  


  /*
    Called every time the scheduler runs while the command is scheduled.
    execute() will run over and over again until isFinished() returns true
  */
  @Override
  public void execute() {   
    m_drive.drive(-RobotContainer.joystick.getY(), RobotContainer.joystick.getX(), RobotContainer.joystick.getZ()) 
  }


  @Override
  public void end(boolean interrupted) { // Called once the command ends or is interrupted.


  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false; /*
                    Since this command is the default command for the DriveTrain, it should run 
                    infinitely until another command requiring the DriveTrain interrupts it.
                  */
  }
}
