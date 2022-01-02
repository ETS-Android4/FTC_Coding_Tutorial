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

        telemetry.addData(">", "start servo in half second");
        telemetry.update();
        sleep(500);

        robot.Servo1.setPower(1);

        telemetry.addData(">", "run for 2 seconds");
        telemetry.update();
        sleep(2000);

        robot.Servo1.setPower(0);
        telemetry.addData(">", "stop servo");
        telemetry.update();
    }
}
