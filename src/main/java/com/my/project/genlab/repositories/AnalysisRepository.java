package com.my.project.genlab.repositories;

import com.my.project.genlab.entities.Analysis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalysisRepository extends CrudRepository<Analysis,Long>{


}
