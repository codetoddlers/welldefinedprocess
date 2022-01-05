package org.welldefinedprocess.definition.domain.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("5")
public class ApproachItem extends Item {

}
