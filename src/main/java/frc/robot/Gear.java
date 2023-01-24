package frc.robot;

public class Gear {

    Constants cons = new Constants();

    private double speedMultiplier = cons.maxSpeed;

    public double getSpeedMultipier() {
        return speedMultiplier;
    }

    public void setSpeedMultiplier(double speed) {
        speedMultiplier = validateSpeed(speed);
    }

    private double validateSpeed(double speed) {
        if (speed > cons.maxSpeed) {
            speed = cons.maxSpeed;
        } else if (speed < cons.minSpeed) {
            speed = cons.minSpeed;
        }
        return speed;
    }

}
