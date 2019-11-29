package com.my.project.genlab.controllers;

import com.my.project.genlab.Services.AnalysisService;
import com.my.project.genlab.Services.SampleService;
import com.my.project.genlab.dto.AnalysisDto;
import com.my.project.genlab.dto.SampleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class SampleController {
    @Autowired
    @Qualifier("sampleService")
    private SampleService sampleService;

    @GetMapping("/samples")
    public String findAll(Model model) {
        List<SampleDto> samples=sampleService.findAll();
        model.addAttribute("sampleList", samples);
        return "sampleListView";
    }
}
