package com.qiao.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnWebApplication
@EnableConfigurationProperties(TestProperties.class)
@Configuration
public class TestServiceAutoConfiguration {

    @Autowired
    private TestProperties testProperties;

    @Bean
    public TestService testService() {
        TestService testService = new TestService();
        testService.setTestProperties(testProperties);
        return testService;
    }

}
