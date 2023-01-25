package frc.robot;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;

public class decel extends TimedRobot {
  private XboxController xbox;
  private PWMVictorSPX leftMotor;
  private PWMVictorSPX rightMotor;
  

  public void robotInit() {
    xbox = new XboxController(0);
    leftMotor = new PWMVictorSPX(0);
    rightMotor = new PWMVictorSPX(1);
  }

  public void teleopPeriodic() {
    double leftY = xbox.getPOV((int) Hand.kLeft);
    double rightY = xbox.getPOV((int) Hand.kRight);
    
    // Check if the joystick is at its original position
    if (Math.abs(leftY) < 0.1 && Math.abs(rightY) < 0.1) {
      // Deaccelerate the robot
      leftMotor.set(0.5);
      leftMotor.set(0);
      rightMotor.set(0.5);
      rightMotor.set(0);
    } else {
      // Set motor speeds based on joystick input
      leftMotor.set(leftY);
      rightMotor.set(rightY);
    }
  }
}
