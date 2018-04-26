package com.cuzer.bootstrap.profilessysout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevProfileSysOut {

	@Autowired
	public DevProfileSysOut(@Value("${com.cengiz.profile.message}") String msg) {
		System.out.println("###############################################");
		System.out.println("###############################################");
		System.out.println("###################   DEV    ##################");
		System.out.println(msg);
		System.out.println("###############################################");
		System.out.println("###############################################");
	}

}
