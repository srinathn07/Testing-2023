package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;

public class Constants {

  // Motors 
  public final PWMSparkMax leftMotor = new PWMSparkMax(0);
  public final PWMSparkMax rightMotor = new PWMSparkMax(1);

  // Speed Variables
  public final double minSpeed = 0.2;
  public final double maxSpeed = 0.85;

  // Drivetrain
  public final DifferentialDrive robotDrive = new DifferentialDrive(leftMotor, rightMotor);

  // Controller Constants
  public final XboxController xbox = new XboxController(0);
    
}
