package com.test.config.external.props;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.cuzer.test.jms.FakeJmsBroker;

@Configuration
@PropertySource("classpath:testing.properties")
public class ExternalPropsEnv {

	@Autowired
	Environment env;

	@Bean
	public FakeJmsBroker fakeJmsBroker() {
		FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();

		fakeJmsBroker.setUrl(env.getProperty("guru.jms.server"));
		fakeJmsBroker.setPort(env.getRequiredProperty("guru.jms.port", Integer.class));
		fakeJmsBroker.setUser(env.getProperty("guru.jms.user"));
		fakeJmsBroker.setPassword(env.getProperty("guru.jms.password"));

		return fakeJmsBroker;

	}

}
