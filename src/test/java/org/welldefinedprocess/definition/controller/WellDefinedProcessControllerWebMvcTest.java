package org.welldefinedprocess.definition.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.welldefinedprocess.definition.controller.WellDefinedProcessController;
import org.welldefinedprocess.definition.domain.entity.WellDefinedProcess;
import org.welldefinedprocess.definition.domain.repository.WellDefinedProcessRepository;

@WebMvcTest(WellDefinedProcessController.class)
public class WellDefinedProcessControllerWebMvcTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private WellDefinedProcessRepository repository;
	
	@MockBean
	private WellDefinedProcess processDefinition;

	@Test
	public void greetingShouldReturnMessageFromService() throws Exception {
		List<WellDefinedProcess> processDefinitionList = new ArrayList<>();
		processDefinitionList.add(processDefinition);
		when(repository.findAll()).thenReturn(processDefinitionList);
		this.mockMvc.perform(get("/welldefinedprocess/list?id=1")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON)/* .string(processDefinitionList.toString()) */);
	}
}