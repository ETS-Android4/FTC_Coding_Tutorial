package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="ServoDemo", group="11697")

public class ServoDemo extends LinearOpMode {

    Hardware robot = new Hardware();

    @Override
    public void runOpMode() throws InterruptedException {

        robot.init(hardwareMap);
        telemetry.addData(">", "ready to start");
        telemetry.update();
        waitForStart();

        while (true) {
            robot.Servo1.setPower(1);
        }
    }
}
