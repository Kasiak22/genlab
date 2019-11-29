package com.my.project.genlab.Services;

import com.my.project.genlab.dto.AnalysisDto;
import com.my.project.genlab.dto.SampleDto;
import com.my.project.genlab.entities.Analysis;
import com.my.project.genlab.entities.Sample;
import com.my.project.genlab.repositories.AnalysisRepository;
import com.my.project.genlab.repositories.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {

    private SampleRepository sampleRepository;
    private Function<Sample, SampleDto> sampleConverter;

    @Autowired
    public SampleServiceImpl(SampleRepository sampleRepository,Function<Sample, SampleDto> sampleConverter) {
        this.sampleRepository = sampleRepository;
        this.sampleConverter = sampleConverter;
    }


    @Override
    public List<SampleDto> findAll() {
        Iterable<Sample> samples = sampleRepository.findAll();
        return StreamSupport.stream(samples.spliterator(), true).map(sampleConverter)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<SampleDto> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(SampleDto sampleDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
