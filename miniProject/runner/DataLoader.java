package com.miniProject.runner;

import com.miniProject.entity.CitizenPlan;
import com.miniProject.repo.CitizenPlanReporisatory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private CitizenPlanReporisatory repo;
    @Override
    public void run(ApplicationArguments args) throws Exception {

        repo.deleteAll();
//        1st user cash plan data
        CitizenPlan c1 = new CitizenPlan();
        c1.setCitizenName("Sarvesh");
        c1.setGender("Male");
        c1.setPlanName("Cash");
        c1.setPlanStatusName("Approved");
        c1.setPlanStartDate(LocalDate.now());
        c1.setPlanEndDate(LocalDate.now().plusMonths(6));
        c1.setBenifitAmt(10000.00);

//        2nd user cash plan data denied
        CitizenPlan c2 = new CitizenPlan();
        c2.setCitizenName("Vaidehi");
        c2.setGender("Fe-Male");
        c2.setPlanName("Cash");
        c2.setPlanStatusName("Denied");
        c2.setDenialReason("Rental Income");

//        3rd user cash plan data terminated due to employment
        CitizenPlan c3 = new CitizenPlan();
        c3.setCitizenName("Atul");
        c3.setGender("Male");
        c3.setPlanName("Cash");
        c3.setPlanStatusName("Terminated");
        c3.setPlanStartDate(LocalDate.now().minusMonths(4));
        c3.setPlanEndDate(LocalDate.now().plusMonths(2));
        c3.setBenifitAmt(5000.00);
        c3.setTerminatedDate(LocalDate.now());
        c3.setTerminationRsn("Employed");

//      4th user food data Approved
        CitizenPlan c4 = new CitizenPlan();
        c4.setCitizenName("Rahul");
        c4.setGender("Male");
        c4.setPlanName("Food");
        c4.setPlanStatusName("Approved");
        c4.setPlanStartDate(LocalDate.now());
        c4.setPlanEndDate(LocalDate.now().plusMonths(6));
        c4.setBenifitAmt(5000.00);

//        5th user food data Denied
        CitizenPlan c5 = new CitizenPlan();
        c5.setCitizenName("Omkar");
        c5.setGender("Male");
        c5.setPlanName("Food");
        c5.setPlanStatusName("Denied");
        c5.setDenialReason("Property Income");

//      6th user fodd plan data terminated due to employment
        CitizenPlan c6 = new CitizenPlan();
        c6.setCitizenName("Chaitanya");
        c6.setGender("Male");
        c6.setPlanName("Food");
        c6.setPlanStatusName("Terminated");
        c6.setPlanStartDate(LocalDate.now().minusMonths(4));
        c6.setPlanEndDate(LocalDate.now().plusMonths(2));
        c6.setBenifitAmt(5000.00);
        c6.setTerminatedDate(LocalDate.now());
        c6.setTerminationRsn("Employed");

//      7th user Medical data Approved
        CitizenPlan c7 = new CitizenPlan();
        c7.setCitizenName("Amol");
        c7.setGender("Male");
        c7.setPlanName("Medical");
        c7.setPlanStatusName("Approved");
        c7.setPlanStartDate(LocalDate.now());
        c7.setPlanEndDate(LocalDate.now().plusMonths(6));
        c7.setBenifitAmt(15000.00);

//      8th user Medical data Denied
        CitizenPlan c8 = new CitizenPlan();
        c8.setCitizenName("Rushikesh");
        c8.setGender("Male");
        c8.setPlanName("Medical");
        c8.setPlanStatusName("Denied");
        c8.setDenialReason("Property Income");

//      9th user Medical plan data terminated due to employment
        CitizenPlan c9 = new CitizenPlan();
        c9.setCitizenName("Sayali");
        c9.setGender("Fe-Male");
        c9.setPlanName("Medical");
        c9.setPlanStatusName("Terminated");
        c9.setPlanStartDate(LocalDate.now().minusMonths(4));
        c9.setPlanEndDate(LocalDate.now().plusMonths(2));
        c9.setBenifitAmt(5000.00);
        c9.setTerminatedDate(LocalDate.now());
        c9.setTerminationRsn("Employed");

//      10th user Employment data Approved
        CitizenPlan c10 = new CitizenPlan();
        c10.setCitizenName("Nikhil");
        c10.setGender("Male");
        c10.setPlanName("Employment");
        c10.setPlanStatusName("Approved");
        c10.setPlanStartDate(LocalDate.now());
        c10.setPlanEndDate(LocalDate.now().plusMonths(6));
        c10.setBenifitAmt(15000.00);

//      11th user Medical data Denied
        CitizenPlan c11 = new CitizenPlan();
        c11.setCitizenName("Samidha");
        c11.setGender("Fe-Male");
        c11.setPlanName("Employment");
        c11.setPlanStatusName("Denied");
        c11.setDenialReason("Property Income");

//      12th user Medical plan data terminated due to employment
        CitizenPlan c12 = new CitizenPlan();
        c12.setCitizenName("Sameer");
        c12.setGender("Male");
        c12.setPlanName("Employment");
        c12.setPlanStatusName("Terminated");
        c12.setPlanStartDate(LocalDate.now().minusMonths(4));
        c12.setPlanEndDate(LocalDate.now().plusMonths(2));
        c12.setBenifitAmt(5000.00);
        c12.setTerminatedDate(LocalDate.now());
        c12.setTerminationRsn("Employed");

        List<CitizenPlan> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
        repo.saveAll(list);
    }
}
