package com.glaStreamApi.LambdaExpressions;
interface LightAction {
    void execute();
}
public class SmartHomeLighting {
    public static void main(String[] args) {

        LightAction motionTrigger = () -> System.out.println("Lights ON with motion brightness");
        LightAction nightMode = () -> System.out.println("Dim warm lights for night");
        LightAction voiceCommand = () -> System.out.println("Custom light pattern activated");

        motionTrigger.execute();
        nightMode.execute();
        voiceCommand.execute();
    }
}
