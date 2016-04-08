
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *Created by Gavin Dunn
 */
public class DriveTrain extends Subsystem {
   //Create the motor objects with port values from robot map.
   Talon leftMotorFront = new Talon(RobotMap.leftMotorFront_Port);
   Talon rightMotorFront = new Talon(RobotMap.rightMotorFront_Port);
   
   Talon leftMotorBack = new Talon(RobotMap.leftMotorBack_Port);
   Talon rightMotorBack = new Talon(RobotMap.rightMotorBack_Port);

    public void initDefaultCommand() {
        // This doesn't have a default action.
    }
    
    public void driveLeftSide(double power){
        leftMotorFront.set(power);
        leftMotorBack.set(power);
    }
    
    public void driveRightSide(double power){
        rightMotorFront.set(power);
        rightMotorBack.set(power);
    }
    
    public void drive(double power){
        driveLeftSide(power);
        driveRightSide(power);
    }
    
    public void strafe(double power){
        rightMotorFront.set(power);
        rightMotorBack.set(-power);
        
        leftMotorFront.set(power);
        leftMotorBack.set(-power);
    }
}

