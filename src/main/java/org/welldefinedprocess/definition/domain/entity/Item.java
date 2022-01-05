package org.welldefinedprocess.definition.domain.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;

//@ToString(exclude = { "welldefinedprocess" }) warning: This field does not exist, or would have been excluded anyway.
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type", discriminatorType=DiscriminatorType.INTEGER)
@Data//warning: Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
public class Item extends Audit {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	//org.hibernate.MappingException: Repeated column in mapping for entity: org.welldefinedprocess.definition.domain.entity.ApproachItem column: type (should be mapped with insert="false" update="false")
//	@Column(name="type", insertable = false, updatable = false)
//	private String type;
	
	public static enum ItemType{
		
		OBJECTIVES(1),
		INPUTS(2),
		STEPS(3),
		OUTPUTS(4),
		APPROACH(5);
		
		private int id;

		ItemType(int idVal){
			this.id=idVal;
		}
		
		public int getId() {
			return this.id;
		}
	}
}
