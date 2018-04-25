package com.cuzer.test.external.props;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cuzer.test.jms.FakeJmsBroker;
import com.test.config.external.props.ExternalPropsPropertySourceTestConfig;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExternalPropsPropertySourceTestConfig.class)
public class PropertySourceTest {

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