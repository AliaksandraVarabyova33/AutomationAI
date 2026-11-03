package com.example.framework.sandbox;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<TestResult> testResults = List.of(
                new TestResult("LoginTest", "Chrome", "PASSED", 1200, "QA"),
                new TestResult("LoginTest", "Firefox", "FAILED", 2500, "QA"),
                new TestResult("PaymentTest", "Chrome", "PASSED", 3400, "QA"),
                new TestResult("PaymentTest", "Firefox", "PASSED", 3100, "QA"),
                new TestResult("SearchTest", "Chrome", "FAILED", 1800, "DEV"),
                new TestResult("SearchTest", "Edge", "PASSED", 900, "DEV"),
                new TestResult("CheckoutTest", "Chrome", "PASSED", 4500, "QA"),
                new TestResult("CheckoutTest", "Firefox", "FAILED", 5200, "QA"),
                new TestResult("ProfileTest", "Chrome", "PASSED", 800, "DEV"),
                new TestResult("ProfileTest", "Edge", "PASSED", 1100, "DEV")
        );
    }
}
