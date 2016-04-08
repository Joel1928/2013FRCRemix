/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.AutoRunThrough;
import edu.wpi.first.wpilibj.templates.commands.TeleOpRunThrough;

/*
* Created by Gavin Dunn (Team 1806)
*/
public class RobotMain extends IterativeRobot {
    //Implement commands that will later be used.
    Command autoCommand;
    Command teleOpCommand;
    /*
    *Runs at the robot startup.
    */
    public void robotInit() {
        // instantiate the command used for the autonomous period
        autoCommand = new AutoRunThrough();
        teleOpCommand = new TeleOpRunThrough();
        
        // Initialize all subsystems
        CommandBase.init();
    }
    /*
    * Runs before auto starts, this kicks off the command for auto.
    */
    public void autonomousInit() {
        //Runs the actual command.
        autoCommand.start();
    }

    /*
    * Runs during auto to put the robot into motion.
    */
    public void autonomousPeriodic() {
        //Check to see if the command is still running and auto is still going.
        Scheduler.getInstance().run();
    }
    
    /*
    * Runs before teleop starts.
    */
    public void teleopInit() {
	//Make sure the auto command is not still running.
        autoCommand.cancel();
        
        //Start the teleop command
        teleOpCommand.start();
    }

    /**
     * This function is called periodically during teleop.
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        System.out.println("No Test Code, Robot Should not Run.");
    }
}
