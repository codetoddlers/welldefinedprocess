package org.welldefinedprocess.definition.domain.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(exclude = { "process" })
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class Phase extends Audit {

	@JsonIgnore
	@ManyToOne
	WellDefinedProcess welldefinedprocess;
	String name;
	String description;
	@OneToMany(cascade = CascadeType.ALL)
	List<Item> objectives;
	@OneToMany(cascade = CascadeType.ALL)
	List<Item> inputs;
	@OneToMany(cascade = CascadeType.ALL)
	List<Item> steps;
	@OneToMany(cascade = CascadeType.ALL)
	List<Item> outputs;
//	@Getter(lazy=true) 
	@OneToMany(cascade = CascadeType.ALL)
	/* final */ List<Item> approach;
	/*
	 * = getApproaches(); private List<String> getApproaches() { List<String> cache
	 * = new ArrayList<String>(); cache.add("test"); return cache; }
	 */
}
