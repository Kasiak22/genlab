package com.my.project.genlab.entities.users;

import javax.persistence.*;
import java.util.List;

@Entity
public class LabAssistant extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String post;

    private String analysisName;




}
