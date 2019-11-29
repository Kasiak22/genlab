package com.my.project.genlab.repositories;

import com.my.project.genlab.entities.Sample;
import org.springframework.data.repository.CrudRepository;

public interface SampleRepository extends CrudRepository<Sample, Long> {
}
