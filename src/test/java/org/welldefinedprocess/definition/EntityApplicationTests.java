package org.welldefinedprocess.definition;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.welldefinedprocess.definition.controller.WellDefinedProcessController;

/**
 * https://spring.io/guides/gs/testing-web/
 */
@SpringBootTest
class EntityApplicationTests {

	@Autowired
	private WellDefinedProcessController processDefinitionController;
	
	@Test
	void contextLoads() {
		Assertions.assertThat(processDefinitionController).isNotNull();
	}

}
