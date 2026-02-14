package frc.robot;
import edu.wpi.first.math.geometry.Translation2d;

public class Constants {

public static final class Swerve {

    public static final double wheelBase = 0.6096;
    public static final double trackWidth = 0.6096;

    public static final Translation2d flModuleOffset = new Translation2d(wheelBase / 2.0, trackWidth / 2.0);
    public static final Translation2d frModuleOffset = new Translation2d(wheelBase / 2.0, -trackWidth / 2.0);
    public static final Translation2d blModuleOffset = new Translation2d(-wheelBase / 2.0, trackWidth / 2.0);
    public static final Translation2d brModuleOffset = new Translation2d(-wheelBase / 2.0, -trackWidth / 2.0);

    public static final double maxModuleSpeed = 4.5; // m/s

}
}