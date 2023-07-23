package org.welldefinedprocess.definition.domain.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
//Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. 
//If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
@EqualsAndHashCode(callSuper=false)
public class WellDefinedProcess extends Audit {

	@OneToMany(cascade = CascadeType.ALL, mappedBy="welldefinedprocess")
	List<Phase> phase;

}
