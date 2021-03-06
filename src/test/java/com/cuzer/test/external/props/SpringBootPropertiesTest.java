package com.cuzer.test.external.props;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cuzer.SpringCoreDevOpsApplication;
import com.cuzer.test.jms.FakeJmsBroker;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SpringCoreDevOpsApplication.class)
@WebIntegrationTest
@TestPropertySource("/application.properties")
public class SpringBootPropertiesTest {

	@Autowired
	FakeJmsBroker fakeJmsBroker;

	@Test
	public void testPropsSet() throws Exception {
		assertEquals("10.10.10.123", fakeJmsBroker.getUrl());
		assertEquals(3330, fakeJmsBroker.getPort().intValue());
		assertEquals("Ron", fakeJmsBroker.getUser());
		assertEquals("Burgundy", fakeJmsBroker.getPassword());
	}

}
