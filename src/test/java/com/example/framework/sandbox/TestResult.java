package com.example.framework.sandbox;

public class TestResult {
    private String testName;
    private String browser;
    private String status;
    private long executionTime;
    private String environment;

    public TestResult(String testName, String browser, String status, long executionTime, String environment) {
        this.testName = testName;
        this.browser = browser;
        this.status = status;
        this.executionTime = executionTime;
        this.environment = environment;
    }

    public String getTestName() {
        return testName;
    }

    public String getBrowser() {
        return browser;
    }

    public String getStatus() {
        return status;
    }

    public long getExecutionTime() {
        return executionTime;
    }

    public String getEnvironment() {
        return environment;
    }
}
