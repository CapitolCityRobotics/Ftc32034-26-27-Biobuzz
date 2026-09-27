package org.firstinspires.ftc.teamcode.mechanisms;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
public class MecanumDrive {
    DcMotor frontLeftDrive, frontRightDrive, backRightDrive, backLeftDrive;
    public void init(HardwareMap hwMap) {
        //Class method to initialize our hardware maps

        //Initialize drive motors. Note device name must match name in the Driver Hub configuration file.
        frontLeftDrive = hwMap.get(DcMotor.class, "front_left_drive");
        frontRightDrive = hwMap.get(DcMotor.class, "front_right_drive");
        backLeftDrive = hwMap.get(DcMotor.class, "back_left_drive");
        backRightDrive = hwMap.get(DcMotor.class, "back_right_drive");
        //.get is a method

        //TODO: Make sure all motors are facing the correct direction.
        frontLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        backLeftDrive.setDirection(DcMotor.Direction.REVERSE);
    }

    public void driveRobotCentric(double forward, double strafe, double turn) {
        //Drive robot from the robot frame of reference (robot relative).
        //Positive values of y move forward, positive values of x strafe to the right, positive values of rx rotate clockwise

        double scaleFactor = Math.max(Math.abs(forward)+Math.abs(strafe)+Math.abs(turn), 1.0);
        double speedLimiter = 0.5;

        double frontLeftPower = ((forward + strafe + turn)/ scaleFactor)*speedLimiter;
        double backLeftPower = ((forward - strafe + turn)/ scaleFactor)*speedLimiter;
        double frontRightPower = ((forward - strafe - turn)/ scaleFactor)*speedLimiter;
        double backRightPower = ((forward + strafe - turn)/ scaleFactor)*speedLimiter;
        //Divide by scale factor and cut down

        frontLeftDrive.setPower(frontLeftPower);
        frontRightDrive.setPower(frontRightPower);
        backLeftDrive.setPower(backLeftPower);
        backRightDrive.setPower(backRightPower);

    }

    public void stopRobot() {
        frontLeftDrive.setPower(0);
        frontRightDrive.setPower(0);
        backLeftDrive.setPower(0);
        backRightDrive.setPower(0);
    }
}