package com.cuzer.test.ds;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("qa")
public class QADataSource implements FakeDataSource {

	@Override
	public String getConnectionInfo() {
		return "I'm in QA DataSource";
	}

}
