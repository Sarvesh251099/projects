package com.miniProject.entity;

//import lambok.Data;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data   //used for getter and setter
@Entity  //used to map with database
@Table(name ="CITIZEN_PLAN_INFO") // If we have diff name of table than class
// then we use @table anotation
public class CitizenPlan {

    @Id //it is use to consider its below variable as primary key for table
    @GeneratedValue(strategy = GenerationType.IDENTITY) //used to generate primary key
//    values in sequence
    private Integer citizenId;
    private String citizenName;
    private String gender;
    private String planName;
    private String planStatusName;
    private LocalDate planStartDate;
    private LocalDate planEndDate;
    private Double benifitAmt;
    private String denialReason;
    private LocalDate terminatedDate;
    private String terminationRsn;

    public Integer getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(Integer citizenId) {
        this.citizenId = citizenId;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public void setCitizenName(String citizenName) {
        this.citizenName = citizenName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanStatusName() {
        return planStatusName;
    }

    public void setPlanStatusName(String planStatusName) {
        this.planStatusName = planStatusName;
    }

    public LocalDate getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(LocalDate planStartDate) {
        this.planStartDate = planStartDate;
    }

    public LocalDate getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(LocalDate planEndDate) {
        this.planEndDate = planEndDate;
    }

    public Double getBenifitAmt() {
        return benifitAmt;
    }

    public void setBenifitAmt(Double benifitAmt) {
        this.benifitAmt = benifitAmt;
    }

    public String getDenialReason() {
        return denialReason;
    }

    public void setDenialReason(String denialReason) {
        this.denialReason = denialReason;
    }

    public LocalDate getTerminatedDate() {
        return terminatedDate;
    }

    public void setTerminatedDate(LocalDate terminatedDate) {
        this.terminatedDate = terminatedDate;
    }

    public String getTerminationRsn() {
        return terminationRsn;
    }

    public void setTerminationRsn(String terminationRsn) {
        this.terminationRsn = terminationRsn;
    }

    @Override//used to extend our logic for specific method
    public String toString() { //used to string method to print object in the o/p
        return "CitizenPlan{" +
                "citizenId=" + citizenId +
                ", citizenName='" + citizenName + '\'' +
                ", gender='" + gender + '\'' +
                ", planName='" + planName + '\'' +
                ", planStatusName='" + planStatusName + '\'' +
                ", planStartDate=" + planStartDate +
                ", planEndDate=" + planEndDate +
                ", benifitAmt=" + benifitAmt +
                ", denialReason='" + denialReason + '\'' +
                ", terminatedDate=" + terminatedDate +
                ", terminationRsn='" + terminationRsn + '\'' +
                '}';
    }
}
