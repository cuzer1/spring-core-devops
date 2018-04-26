package com.cuzer.test.ds;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({ "dev", "default"})
public class DevDataSource implements FakeDataSource {

	@Override
	public String getConnectionInfo() {
		return "I'm in Development DataSource";
	}

}
