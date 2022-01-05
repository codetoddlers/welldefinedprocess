package org.welldefinedprocess.definition.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.welldefinedprocess.definition.domain.entity.WellDefinedProcess;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void processListTest() throws Exception {
		WellDefinedProcess wellDefinedProcess = this.restTemplate.getForObject("http://localhost:" + port + "/welldefinedprocess/list?id=0",
				WellDefinedProcess.class);
		System.out.println(wellDefinedProcess);
		Assertions.assertThat(wellDefinedProcess).isNotNull();
	}
}