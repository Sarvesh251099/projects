package com.miniProject.repo;

import com.miniProject.entity.CitizenPlan;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface CitizenPlanReporisatory
        extends JpaRepository<CitizenPlan,Integer> {
//in jpa reposiratory we have already defined save,and some other methods
    @Query ("select distinct (planName) from CitizenPlan")
//  query will automatically create a query to fetch all the plan names(it will contain duplicate values also)
// we have written custom query to fetch unique plan names

    public List<String> getPlanNames();

    @Query("select distinct (planStatusName) from CitizenPlan")
    public List<String> getPlanStatus();

}
