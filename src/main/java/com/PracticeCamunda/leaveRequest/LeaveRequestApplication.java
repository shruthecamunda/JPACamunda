package com.PracticeCamunda.leaveRequest;

import io.camunda.zeebe.client.ZeebeClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class LeaveRequestApplication /*implements CommandLineRunner */{

	private static final Logger LOG = LoggerFactory.getLogger(LeaveRequestApplication.class);

	@Autowired
	private ZeebeClient zeebeClient;

	public static void main(String[] args) {
		SpringApplication.run(LeaveRequestApplication.class, args);
	}


//	public void run(final String... args) {
//		var bpmnProcessId = "LeaveRequestProcess";  //or whatever the key is
//		var event = zeebeClient.newCreateInstanceCommand()
//				.bpmnProcessId(bpmnProcessId)
//				.latestVersion()
//				.variables(Map.of("total", 100))
//				.send()
//				.join();
//		LOG.info(String.format("started a process: %d", event.getProcessInstanceKey()));
//	}

}
