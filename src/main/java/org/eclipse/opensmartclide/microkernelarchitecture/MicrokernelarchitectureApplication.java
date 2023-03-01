package org.eclipse.opensmartclide.microkernelarchitecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import plugin.Plugin;

@SpringBootApplication
@Plugin
public class MicrokernelarchitectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrokernelarchitectureApplication.class, args);
	}

}
