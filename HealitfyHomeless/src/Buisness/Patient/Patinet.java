/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Patient;

import Buisness.Hospitals.Doctors;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;

/**
 *
 * @author maneesh
 */
public class Patinet {
    private String fullname;
    private String lastname;
    private int id;
    private int age;
    private int height;
    private int weight;
    private String gender;
    private String image;
    private String bloodgrp;
    private String bloodpres;
    private float gulcoselvl;
    private float bodytemp;
    private String symptoms;
    private String disease;
    private String diagnosis;
    private String priority;
    public boolean isHosAssigned = false;
    public Organization hospitalAssigned;
    public Doctors docAssigned;
    public boolean doctorAssigned = false;
    public String docComments = "";
    public double billAmmount = 0;
    public boolean billStatus = false;
    
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBloodgrp() {
        return bloodgrp;
    }

    public void setBloodgrp(String bloodgrp) {
        this.bloodgrp = bloodgrp;
    }

    public String getBloodpres() {
        return bloodpres;
    }

    public void setBloodpres(String bloodpres) {
        this.bloodpres = bloodpres;
    }

    public float getGulcoselvl() {
        return gulcoselvl;
    }

    public void setGulcoselvl(float gulcoselvl) {
        this.gulcoselvl = gulcoselvl;
    }

    public float getBodytemp() {
        return bodytemp;
    }

    public void setBodytemp(float bodytemp) {
        this.bodytemp = bodytemp;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    
    @Override
    public String toString() {
        return fullname;
    }
    
    
    
}
