package com.miniProject.service;

import com.miniProject.entity.CitizenPlan;
import com.miniProject.repo.CitizenPlanReporisatory;
import com.miniProject.request.SearchRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
@Service
public class ReportServiceImpl implements ReportService{

    @Autowired
    private CitizenPlanReporisatory planRepo;

    @Override
    public List<String> getPlanNames() {
    	List<String> planName = planRepo.getPlanNames();
        return planName;
    }

    @Override
    public List<String> getPlanStatuses() {
        return planRepo.getPlanStatus();
    }

    @Override
    public List<CitizenPlan> search(SearchRequest request) {
    	CitizenPlan entity = new CitizenPlan();
    	
    	if(request.getPlanName() != null && !"".equals(request.getPlanName())) {
    		entity.setPlanName(request.getPlanName());
    	}
    	
    	if(request.getPlanStatusName() != null && !"".equals(request.getPlanStatusName())) {
    		entity.setPlanStatusName(request.getPlanStatusName());
    	}
    	
    	if(request.getGender() != null && !"".equals(request.getGender())) {
    		entity.setGender(request.getGender());
    	}
    	
    	if(request.getPlanStartDate() !=null && !"".equals(request.getPlanStartDate())) {
    		String startdate =  request.getPlanStartDate();
    		
    		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    		
    		LocalDate localdate = LocalDate.parse(startdate,formatter);
    		entity.setPlanStartDate(localdate);
    	}
    	
    	if(request.getPlanEndDate() !=null && !"".equals(request.getPlanEndDate())) {
    		String enddate =  request.getPlanEndDate();
    		
    		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    		
    		LocalDate localdate = LocalDate.parse(enddate,formatter);
    		entity.setPlanEndDate(localdate);
    	}
    			
//    	BeanUtils.copyProperties(request, entity);
    	return planRepo.findAll(Example.of(entity));
    }

    @Override
    public boolean exportExcel() {
        return false;
    }

    @Override
    public boolean exportPdf() {
        return false;
    }
}
