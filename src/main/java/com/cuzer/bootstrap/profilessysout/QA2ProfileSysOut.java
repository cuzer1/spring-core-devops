package com.cuzer.bootstrap.profilessysout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa2")
public class QA2ProfileSysOut {

	@Autowired
	public QA2ProfileSysOut(@Value("${com.cengiz.profile.message}") String msg) {
		System.out.println("###############################################");
		System.out.println("###############################################");
		System.out.println("###################   QA2    ##################");
		System.out.println(msg);
		System.out.println("###############################################");
		System.out.println("###############################################");
	}

}
