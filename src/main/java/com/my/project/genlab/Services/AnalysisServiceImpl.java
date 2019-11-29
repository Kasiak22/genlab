package com.my.project.genlab.Services;

import com.my.project.genlab.dto.AnalysisDto;
import com.my.project.genlab.dto.SampleDto;
import com.my.project.genlab.entities.Analysis;
import com.my.project.genlab.repositories.AnalysisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service("analysisService")
public class AnalysisServiceImpl implements AnalysisService {

    private AnalysisRepository analysisRepository;
    private Function<Analysis, AnalysisDto> analysisDtoConverter;

    @Autowired
    public AnalysisServiceImpl(AnalysisRepository analysisRepository,Function<Analysis, AnalysisDto> analysisDtoConverter) {
        this.analysisRepository = analysisRepository;
        this.analysisDtoConverter = analysisDtoConverter;
         }

    @Override
    public List<AnalysisDto> findAll() {
        Iterable<Analysis> analyses = analysisRepository.findAll();
        return StreamSupport.stream(analyses.spliterator(), true).map(analysisDtoConverter)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<AnalysisDto> findById(Long id) {
        Optional<Analysis> analysisOptional = analysisRepository.findById(id);
        if (analysisOptional.isPresent()) {
            return Optional.ofNullable(analysisDtoConverter.apply(analysisOptional.get()));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void save(AnalysisDto analysisDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
