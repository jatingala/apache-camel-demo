package com.jatin.camel.demo.fix.acceptor;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FixAcceptorApplication extends RouteBuilder {

    public static void main(String[] args) {
        SpringApplication.run(FixAcceptorApplication.class, args);
    }

    @Override
    public void configure() throws Exception {
        from("quickfix:fix-acceptor-config.cfg")
                .to("stub:nowhere");
    }
}
