package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class HelloRobot extends OpMode {
    @Override
    public void init () {
        telemetry.addLine("Hello Robot");
        telemetry.update();
    }

    @Override
    public void loop() {

    }
}
