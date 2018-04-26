package com.cuzer.test.dstest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cuzer.config.DataSourceConfig;
import com.cuzer.test.ds.FakeDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DataSourceConfig.class)
// @ActiveProfiles("qa")
public class DataSourceTest {

	private FakeDataSource fakeDataSource;

	@Autowired
	public void setFakeDataSource(FakeDataSource fakeDataSource) {
		this.fakeDataSource = fakeDataSource;
	}

	@Test
	public void dataSourceTest() throws Exception {

		System.out.println(fakeDataSource.getConnectionInfo());
	}

}
