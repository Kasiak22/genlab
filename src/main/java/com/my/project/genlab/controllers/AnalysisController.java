package com.my.project.genlab.controllers;

import com.my.project.genlab.Services.AnalysisService;
import com.my.project.genlab.dto.AnalysisDto;
import com.my.project.genlab.entities.Sample;
import com.my.project.genlab.entities.enums.AnalysisType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class AnalysisController {

    @Autowired
    @Qualifier("analysisService")
    private AnalysisService analysisService;

    @GetMapping("/analysis")
    public String findAll(Model model) {
        List<AnalysisDto> analyses=analysisService.findAll();
        model.addAttribute("analysisList", analyses);
        return "analysisListView";
    }

    @GetMapping("/detail")
    public String findById(@RequestParam Long id, Model model) {
        model.addAttribute("analysisTypes", AnalysisType.values());
        Optional<AnalysisDto> analysisDto = analysisService.findById(id);
        if (analysisDto.isPresent()) {
              model.addAttribute("analysisModel", analysisDto.get());
        }
        return "analysisView";
    }


}
