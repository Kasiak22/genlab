package com.my.project.genlab.converters;

import com.my.project.genlab.dto.AnalysisDto;
import com.my.project.genlab.dto.SampleDto;
import com.my.project.genlab.entities.Analysis;
import com.my.project.genlab.entities.Sample;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class SampleConverter implements Function<Sample, SampleDto> {

    @Override
    public SampleDto apply(Sample sample) {
        if (sample != null) {
            return new SampleDto(sample.getId(), sample.getType().name(), sample.getStatus().name(), sample.getDate2(), sample.getScore());
        } else {
            return null;
        }
    }


}
