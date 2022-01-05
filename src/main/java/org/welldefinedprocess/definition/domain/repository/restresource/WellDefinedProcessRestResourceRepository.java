package org.welldefinedprocess.definition.domain.repository.restresource;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.welldefinedprocess.definition.domain.entity.WellDefinedProcess;

//@RepositoryRestResource(collectionResourceRel = "welldefinedprocessDefinition", path = "welldefinedprocessDefinition")
//@Repository
public interface WellDefinedProcessRestResourceRepository extends PagingAndSortingRepository<WellDefinedProcess, Long> {

	List<Process> findByName(@Param("name") String name);
	
	Process findById(@Param("name") String name);

}
