package com.jatin.apache.camel.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("FixAcceptor")
@Component
public class FixAcceptor extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("quickfix:acceptor/fix-acceptor-config.cfg") //
				.to("stub:nowhere");
	}

}
