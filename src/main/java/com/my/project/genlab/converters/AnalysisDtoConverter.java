package com.my.project.genlab.converters;

import com.my.project.genlab.dto.AnalysisDto;
import com.my.project.genlab.entities.Analysis;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class AnalysisDtoConverter implements Function<Analysis, AnalysisDto> {

    @Override
    public AnalysisDto apply(Analysis analysis) {
        if (analysis!=null) {
            return new AnalysisDto(analysis.getId(), analysis.getName(), analysis.getType().name(), analysis.getDate(), analysis.getLabA(),analysis.getSamples() );
        } else {
            return null;
        }
    }


}
