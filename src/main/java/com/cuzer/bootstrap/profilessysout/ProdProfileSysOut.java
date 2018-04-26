package com.cuzer.bootstrap.profilessysout;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Prod")
public class ProdProfileSysOut {

	public ProdProfileSysOut() {
		System.out.println("###############################################");
		System.out.println("###############################################");
		System.out.println("###################   Prod   ##################");
		System.out.println("###############################################");
		System.out.println("###############################################");
	}

}
