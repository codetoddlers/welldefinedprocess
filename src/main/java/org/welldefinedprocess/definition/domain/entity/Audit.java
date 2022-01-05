package org.welldefinedprocess.definition.domain.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;


@MappedSuperclass
@Data
public abstract class Audit {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Integer sequenceNumber;
	
	private String name;
	
	Boolean active;
	
	Date createdDate;
	
	Date deactivatedDate;
	
}
