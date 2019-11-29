package com.my.project.genlab.entities;

import com.my.project.genlab.entities.enums.AnalysisType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Analysis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private AnalysisType type;

    private String date;

    private String labA;

    @OneToMany
    private List<Sample> samples;




}
