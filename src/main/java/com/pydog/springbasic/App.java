package com.pydog.springbasic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pydog.springbasic.config.AppConfig;
import com.pydog.springbasic.model.SampleModel;

/**
 * Sample application.
 *
 */
public class App {
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

		LOGGER.info("Creating application context");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		LOGGER.info("Getting beans from the context");
		SampleModel sampleModel = context.getBean(SampleModel.class);
		System.out.println(sampleModel.getTestString());

		String testString = context.getBean("testString", String.class);
		System.out.println(testString);

		LOGGER.info("Closing the context");
		((ConfigurableApplicationContext) context).close();
	}
}
