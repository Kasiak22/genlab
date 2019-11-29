package com.my.project.genlab.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Score {

    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "id")
    Sample mys;

    private float value;
}
