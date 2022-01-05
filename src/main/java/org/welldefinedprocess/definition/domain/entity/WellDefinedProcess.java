package org.welldefinedprocess.definition.domain.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class WellDefinedProcess extends Audit {

	@OneToMany(cascade = CascadeType.ALL, mappedBy="welldefinedprocess")
	List<Phase> phase;

}
