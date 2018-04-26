package com.cuzer.test.ds;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdDataSource implements FakeDataSource {

	@Override
	public String getConnectionInfo() {
		return "I'm in Production DataSource";
	}

}
