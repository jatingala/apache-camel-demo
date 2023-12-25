package com.jatin.camel.demo.fix.initiator;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FixInitiatorApplication extends RouteBuilder {

    public static void main(String[] args) {
        SpringApplication.run(FixInitiatorApplication.class, args);
    }

    @Override
    public void configure() throws Exception {
        from("quickfix:fix-initiator-config.cfg")
                .to("stub:nowhere");
    }
}
