package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class Hardware  {

    public CRServo Servo1;                  //  Hub port 0     Servo1

    HardwareMap hwMap;
    private ElapsedTime period  = new ElapsedTime();

    public void init(HardwareMap ahwMap) {
        hwMap = ahwMap;
        Servo1         = hwMap.get(CRServo.class, "Servo1");

    }
}




