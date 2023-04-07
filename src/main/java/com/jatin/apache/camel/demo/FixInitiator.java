package com.jatin.apache.camel.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("FixInitiator")
@Component
public class FixInitiator extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("quickfix:initiator/fix-initiator-config.cfg") //
				.to("stub:nowhere");
	}

}
