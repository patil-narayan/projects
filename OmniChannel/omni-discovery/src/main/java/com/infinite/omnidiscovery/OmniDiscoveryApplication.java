/*
 * @OmniDiscoveryApplication.java@
 * Created on 15Dec2022
 *
 * Copyright (c) 2022 Infinite Computer Solutions
 *
 * All Right Reserved.
 * THIS IS UNPUBLISHED PROPRIETARY
 * SOURCE CODE OF Infinite Computer Solutions
 * The copyright notice above does not evidence any
 * actual or intended publication of such source code.
 */

package com.infinite.omnidiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OmniDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmniDiscoveryApplication.class, args);
	}

}
