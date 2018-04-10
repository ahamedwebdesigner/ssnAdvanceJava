package com.felicityinfo.appOne.Bus;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.felicityinfo.appOne.Bus.beans.Driver;

@Configuration
@ComponentScan(basePackages="com.felicityinfo.appOne.Bus")
public class BusConfig {
	@Bean(name="drivers")
	public Driver getDrivers() {
		return new Driver("Scott John","454");
		
	}

}
