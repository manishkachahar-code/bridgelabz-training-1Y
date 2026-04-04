package com.gla.WrapperClass.ScenarioBased;

public class SensorDataLogger {
    public static void logTemperature(Double temp){
        double value = temp;
        System.out.println("Temperture stored:" +value);
    }
   public static void main(String[] args){
        double sensorValue = 25.5;
       logTemperature(sensorValue);

       Double storedValue = 30.2;


       double readValue = storedValue;

       System.out.println("Read value: " + readValue);
   }
   }

