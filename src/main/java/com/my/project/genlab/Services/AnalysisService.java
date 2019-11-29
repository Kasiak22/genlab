package com.my.project.genlab.Services;

import com.my.project.genlab.dto.AnalysisDto;
import com.my.project.genlab.dto.SampleDto;

import java.util.List;
import java.util.Optional;

public interface AnalysisService {
    List<AnalysisDto> findAll();

    Optional<AnalysisDto> findById(Long id);

    void save(AnalysisDto analysisDto);

    void delete(Long id);
}
