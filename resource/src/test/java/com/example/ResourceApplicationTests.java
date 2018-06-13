package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ResourceApplicationTests {

    private static Logger LOG = LoggerFactory.getLogger(ResourceApplicationTests.class);

    @Value("${spring.application.name}")
    String applicationName;

	@Test
	public void contextLoads() {
        LOG.info("token store for : {}", applicationName);

    }

}
