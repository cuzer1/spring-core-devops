package com.cuzer.test.external.props;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cuzer.test.jms.FakeJmsBroker;
import com.test.config.external.props.ExternalPropsMultiFile;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExternalPropsMultiFile.class)
public class PropertySourceMultiFileTest {

	@Autowired
	FakeJmsBroker fakeJmsBroker;

	@Test
	public void testPropsSet() throws Exception {
		assertEquals("10.10.10.123", fakeJmsBroker.getUrl());
		assertEquals(3330, fakeJmsBroker.getPort().intValue());
		assertEquals("Ron", fakeJmsBroker.getUser());
		assertEquals("Cokgizli", fakeJmsBroker.getPassword());
	}

}
