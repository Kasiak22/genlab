package com.my.project.genlab.entities;

import com.my.project.genlab.entities.enums.SampleStatus;
import com.my.project.genlab.entities.enums.SampleType;
import com.my.project.genlab.entities.users.Patient;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sample {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private SampleType type;

    @Enumerated(EnumType.STRING)
    private SampleStatus status;

    private String date2;

    @ManyToOne
    @JoinColumn(name ="analysis_id")
    Analysis analysis;


    @OneToOne(mappedBy = "mys", optional = false)
    private Score score;


}
