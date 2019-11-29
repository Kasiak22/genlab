package com.my.project.genlab.dto;

import com.my.project.genlab.entities.Sample;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.List;

@AllArgsConstructor
@Data
public class AnalysisDto {

    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String type;

    @NotNull
    private String date;

    @NotNull
    private String labA;

    @NotNull
    private List<Sample> samples;
}
