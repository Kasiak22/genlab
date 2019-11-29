package com.my.project.genlab.dto;

import com.my.project.genlab.entities.Score;
import com.my.project.genlab.entities.enums.SampleStatus;
import com.my.project.genlab.entities.enums.SampleType;
import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.Date;

@AllArgsConstructor
@Data
public class SampleDto {

    private Long id;

    private String type;

    private String status;

    private String date2;

    Score score;
}
