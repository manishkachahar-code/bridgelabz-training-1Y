package com.glaStreamApi.StreamApiProblemStatement.StreamApi;
import java.util.*;
import java.time.*;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
}

public class FilteringExpiring {
    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member("Amit", LocalDate.now().plusDays(10)),
                new Member("Neha", LocalDate.now().plusDays(40)),
                new Member("Ravi", LocalDate.now().plusDays(25))
        );

        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        members.stream()
                .filter(m -> !m.expiryDate.isBefore(today) && !m.expiryDate.isAfter(limit))
                .forEach(m -> System.out.println(m.name + " " + m.expiryDate));
    }
}
