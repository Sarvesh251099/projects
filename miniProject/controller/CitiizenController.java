package com.miniProject.controller;


import com.miniProject.entity.CitizenPlan;
import com.miniProject.request.SearchRequest;
import com.miniProject.service.ReportService;
import com.miniProject.service.ReportServiceImpl;

import org.springframework.ui.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CitiizenController {

    @Autowired
    private ReportService service;
    
    @PostMapping("/search")
    public String handleSearch(@ModelAttribute ("search") SearchRequest request, Model model) {
//    	System.out.println(request);
    	
    	 List<CitizenPlan> plans = service.search(request);
    	 model.addAttribute("plans",plans);
    	
    	init(model);
    	return "index";
    }

    @GetMapping("/")
    public String indexPage(Model model){
//        SearchRequest searchObj = new SearchRequest();
//        model is used to send data from controller class to front end
    	model.addAttribute("search", new SearchRequest());
        init(model);
        return "index";
    }

	private void init(Model model) {
//		model.addAttribute("search", new SearchRequest());
		model.addAttribute("names",service.getPlanNames());
        model.addAttribute("status",service.getPlanStatuses());
	}

}
