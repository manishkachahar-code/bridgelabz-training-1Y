package com.glaStreamApi.LambdaExpressions;
import java.util.*;
import java.util.function.Predicate;

class Alert {
    String message;
    String type;

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }
}
public class NotificationFiltering {
    public static void main(String[] args) {

        List<Alert> list = new ArrayList<>();

        list.add(new Alert("Heart rate high", "CRITICAL"));
        list.add(new Alert("Medicine reminder", "NORMAL"));
        list.add(new Alert("Low oxygen level", "CRITICAL"));

        Predicate<Alert> criticalOnly = a -> a.type.equals("CRITICAL");

        list.stream()
                .filter(criticalOnly)
                .forEach(a -> System.out.println(a.message));
    }

}
