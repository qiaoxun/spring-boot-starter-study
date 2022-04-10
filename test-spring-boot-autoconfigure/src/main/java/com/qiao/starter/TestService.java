package com.qiao.starter;

public class TestService {

    private TestProperties testProperties;

    public String test() {
        return "Test: " + testProperties.getSuffix();
    }

    public TestProperties getTestProperties() {
        return testProperties;
    }

    public void setTestProperties(TestProperties testProperties) {
        this.testProperties = testProperties;
    }
}
