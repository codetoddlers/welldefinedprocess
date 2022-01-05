package org.welldefinedprocess.definition.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.welldefinedprocess.definition.domain.entity.WellDefinedProcess;

@RepositoryRestResource(collectionResourceRel = "welldefinedprocessDef", path = "welldefinedprocessDef")
@Repository
public interface WellDefinedProcessRepository extends JpaRepository<WellDefinedProcess, Long> {

}
