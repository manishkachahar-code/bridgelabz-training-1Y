package com.glaStreamApi.LambdaExpressions;
import java.util.*;
import java.util.stream.*;

class Invoice {
    String id;

    Invoice(String id) {
        this.id = id;
    }
}
public class InvoiceObject {
    public static void main(String[] args) {

        List<String> ids = Arrays.asList("T101", "T102", "T103");

        List<Invoice> invoices = ids.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());

        invoices.forEach(i -> System.out.println(i.id));
    }

}
