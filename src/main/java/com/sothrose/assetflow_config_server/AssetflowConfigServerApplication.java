package com.sothrose.assetflow_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AssetflowConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssetflowConfigServerApplication.class, args);
	}

}
