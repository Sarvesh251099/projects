package com.miniProject.service;

import com.miniProject.entity.CitizenPlan;
import com.miniProject.request.SearchRequest;

import java.util.List;

public interface ReportService {

    public List<String> getPlanNames();

    public List<String> getPlanStatuses();

    public List<CitizenPlan> search(SearchRequest request);

    public boolean exportExcel();

    public boolean exportPdf();

}
