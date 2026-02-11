package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "Spin OpMode", group = "Linear OpMode") // Don't forgetti
public class SpinOpMode extends LinearOpMode {
    @Override
    public void runOpMode() {
        waitForStart();
        while (opModeIsActive()) {
            Servo myServo = hardwareMap.servo.get("myServo");
            DcMotor myMotor = hardwareMap.dcMotor.get("myMotor");

            while (gamepad1.a) {
                myServo.setPosition(gamepad1.left_stick_y);
                myMotor.setPower(gamepad1.right_stick_y);
            }
            while (gamepad1.b) {
                myServo.setPosition(gamepad1.left_stick_y);
                myMotor.setPower(gamepad1.left_stick_y);
            }
            while (gamepad1.c)) {
        }
    }
}
