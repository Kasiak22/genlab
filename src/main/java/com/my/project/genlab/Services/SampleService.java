package com.my.project.genlab.Services;

import com.my.project.genlab.dto.SampleDto;

import java.util.List;
import java.util.Optional;

public interface SampleService {
    List<SampleDto> findAll();

    Optional<SampleDto> findById(Long id);

    void save(SampleDto sampleDto);

    void delete(Long id);
}
