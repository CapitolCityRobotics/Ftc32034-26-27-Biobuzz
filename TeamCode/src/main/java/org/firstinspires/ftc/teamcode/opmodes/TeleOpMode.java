package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.mechanisms.MecanumDrive;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TeleOpMode extends LinearOpMode {
    //create instance of Mecanum Drive object
    MecanumDrive drive = new MecanumDrive();

    @Override
    public void runOpMode() {
        drive.init(hardwareMap);

        telemetry.addLine("Robot Ready, Press Start");
        telemetry.update();

        waitForStart();

        while(opModeIsActive()) {
            drive.driveRobotCentric(-gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x);
        }
    }
}
