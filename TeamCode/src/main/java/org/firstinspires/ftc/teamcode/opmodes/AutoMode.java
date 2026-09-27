package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.mechanisms.MecanumDrive;

@Autonomous
public class AutoMode extends LinearOpMode {

    MecanumDrive drive = new MecanumDrive();  // create an instance of our MecanumDrive class
    ElapsedTime timer = new ElapsedTime();


    @Override
    public void runOpMode() throws InterruptedException {
        drive.init(hardwareMap);

        // Send telemetry message to signify robot is ready.
        telemetry.addLine("Robot is ready. Press PLAY to start.");
        telemetry.update();

        waitForStart();

        // Step 1: launch 4 pollen

        while (opModeIsActive() && timer.seconds() < 2.0) {

        }
        // Step 2: Drive Forward
            drive.driveRobotCentric(0.5,0,0);
            timer.reset();
        // Step 3: Turn Left 90 Degrees
        // Step 4: Drive Forward
        // Step 5: Turn Left 90 Degrees
        // Step 6: Drive Forward
        // Step 7: Intake Pollen
        // Step 8: Drive Backwards
        // Step 9: Turn Left 90 Degrees
        // Step 10: Drive Backwards
        // Step 11: Turn Left 90 Degrees
        // Step 12: Drive Backwards
        // Step 13: Shoot Pollen
        // Last step: stop robot
        drive.stopRobot();
    }
}