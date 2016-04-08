
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //Create variables for the controllers
    public int LSX = 1, LSY = 2, RSX = 4, RSY = 5, GAMEPAD1_PORT = 1, GAMEPAD2_PORT = 2;
    
    //Create two Joystick objects
    Joystick gamePad1 = new Joystick(1);
    Joystick gamePad2 = new Joystick(2);
    
    /*
    *Get the axis from the joysticks
    */
    public double getGamePad1LsX(){
        double value = gamePad1.getRawAxis(LSX);
        return value;
    }
    
    public double getGamePad1LsY(){
        double value = gamePad1.getRawAxis(LSY);
        return value;
    }
    
    public double getGamePad1RsX(){
        double value = gamePad1.getRawAxis(RSX);
        return value;
    }
    
    public double getGamePad1RsY(){
        double value = gamePad1.getRawAxis(RSY);
        return value;
    }
    
    public double getGamePad2LsX(){
        double value = gamePad2.getRawAxis(LSX);
        return value;
    }
    
    public double getGamePad2LsY(){
        double value = gamePad2.getRawAxis(LSY);
        return value;
    }
    
    public double getGamePad2RsX(){
        double value = gamePad2.getRawAxis(RSX);
        return value;
    }
    
    public double getGamePad2RsY(){
        double value = gamePad2.getRawAxis(RSY);
        return value;
    }
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

