package com.my.project.genlab.entities.enums;

public enum AnalysisType {

    DNA, mRNA, WesternBlot, ELISA;

    public String getName() {
        return this.name();
    }
}
