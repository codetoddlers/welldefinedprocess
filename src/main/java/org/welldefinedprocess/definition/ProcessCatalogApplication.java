package org.welldefinedprocess.definition;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.welldefinedprocess.definition.domain.entity.Item;
import org.welldefinedprocess.definition.domain.entity.Phase;
import org.welldefinedprocess.definition.domain.entity.WellDefinedProcess;
import org.welldefinedprocess.definition.domain.entity.Item.ItemType;
import org.welldefinedprocess.definition.domain.repository.WellDefinedProcessRepository;

@SpringBootApplication
// scanBasePackages ComponentScan EnableJpaRepositories are required only if they are in different packages
//(scanBasePackages = {"org.welldefinedprocess.definition.controller.domain.entity","org.welldefinedprocess.definition.controller.domain.repository","org.welldefinedprocess.definition.controller.controller"} )
//@ComponentScan(basePackages = "org.welldefinedprocess.definition.controller.domain, org.welldefinedprocess.definition.controller.domain.repository.restresource,org.welldefinedprocess.definition.controller.controller")
//@EnableJpaRepositories(basePackageClasses = {WellDefinedProcessRestResourceRepository.class})
public class ProcessCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessCatalogApplication.class, args);
	}

	//@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

	
	@Bean 
	public CommandLineRunner demoData(WellDefinedProcessRepository
	  repository) { 
		return args -> { 
			//Process [ Phase [Objectives, Inputs, Steps, Outputs]]
			//Process
			WellDefinedProcess welldefinedprocess1 = new WellDefinedProcess();
			//welldefinedprocess1.setId(1L);
			welldefinedprocess1.setName("welldefinedprocess1");
			welldefinedprocess1.setActive(Boolean.TRUE);
			welldefinedprocess1.setCreatedDate(new Date());
			welldefinedprocess1.setSequenceNumber(1);
			//Phase
			Phase phase1 = new Phase();
			//phase1.setId(1L);
			phase1.setName("phase1");
			//Objectives, Inputs, Steps, Outputs
//			phase1.setObjectives(generateItemTypeList(ItemType.OBJECTIVES, repository));
//			phase1.setInputs(generateItemTypeList(ItemType.INPUTS, repository));
//			phase1.setSteps(generateItemTypeList(ItemType.STEPS, repository));
//			phase1.setOutputs(generateItemTypeList(ItemType.OUTPUTS, repository));
			phase1.setApproach(generateItemTypeList(ItemType.APPROACH, repository));
			phase1.getApproach().addAll((generateItemTypeList(ItemType.APPROACH, repository)));

			phase1.setWelldefinedprocess(welldefinedprocess1);
			List<Phase> phaseList = new ArrayList<>();
			phaseList.add(phase1);
			welldefinedprocess1.setPhase(phaseList);

			repository.save(welldefinedprocess1);
			};
	  }

	private List<Item> generateItemTypeList(final Item.ItemType typeOfChoice, WellDefinedProcessRepository
			  repository ) {
		Item item1 = new Item();
		//item1.setSequenceNumber(1);
		item1.setActive(Boolean.TRUE);
		String name = null;
		ItemType type = null;
		switch(typeOfChoice) {
			case OBJECTIVES:
				type = ItemType.OBJECTIVES;
				name = type.name().toLowerCase();
				break;
			case INPUTS:
				type = ItemType.INPUTS;
				name = type.name().toLowerCase();
				break;
			case STEPS:
				type = ItemType.STEPS;
				name = type.name().toLowerCase();
				break;
			case OUTPUTS:
				type = ItemType.OUTPUTS;
				name = type.name().toLowerCase();
				break;
			case APPROACH:
				type = ItemType.APPROACH;
				name = type.name().toLowerCase();
				break;
			default:
				break;
		}
		item1.setName(name+ZonedDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));
		//item1.setType(type.getId());// Unable  to insert expected String into DiscriminatorColumn of type ItemType or String
		item1.setCreatedDate(new Date());

		List<Item> nonEmptyList = new ArrayList<>();
		nonEmptyList.add(item1);
		return nonEmptyList;
	}

}
