package com.glaStreamApi.StreamApiProblemStatement.forEach;
import java.util.*;
import java.time.*;
public class LoggingTransactin {
    public static void main(String[] args) {

        List<String> transactionIds = Arrays.asList("TX101", "TX102", "TX103");

        transactionIds.forEach(id ->
                System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );
    }
}
