package org.welldefinedprocess.definition.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.welldefinedprocess.definition.domain.entity.WellDefinedProcess;
import org.welldefinedprocess.definition.domain.repository.WellDefinedProcessRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/welldefinedprocess")
public class WellDefinedProcessController {
	
	@Autowired
	private WellDefinedProcessRepository processRepository;
	
	@RequestMapping(path="/list",method=RequestMethod.GET)
	public @ResponseBody List<WellDefinedProcess> getProcessList(@RequestParam Long id) {
		if(id>0) {
			return processRepository.findById(id).stream().collect(Collectors.toUnmodifiableList());
		}
		return processRepository.findAll();
	}

	@GetMapping("/{id}")
	private Mono<WellDefinedProcess> getWellDefinedProcessById(@PathVariable Long id) {
		if(id>0) {
			return Mono.just(processRepository.findById(id).stream().collect(Collectors.toUnmodifiableList()).get(0));
		}
		return null;
	}

	@GetMapping
	private Flux<WellDefinedProcess> getAllWellDefinedProcess() {
		return Flux.fromIterable(processRepository.findAll());
	}
}
