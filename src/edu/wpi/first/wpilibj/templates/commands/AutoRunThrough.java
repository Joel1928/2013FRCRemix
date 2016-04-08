
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.subsystems.DriveTrain;

/**
 *
 * @author Gavin Dunn
 */
public class AutoRunThrough extends CommandBase {

    public AutoRunThrough() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        DriveTrain drive = new DriveTrain();
        requires(drive);
    }
    
    //Called before the program starts.
    protected void initialize() {
        
    }
    
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        System.out.println("TELEOP");
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
