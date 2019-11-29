package com.my.project.genlab.entities.enums;

public enum SampleStatus {

    NEW, ASSIGNED, PENDING, WIP, DONE;

    public String getName() {
        return this.name();

    }
}
