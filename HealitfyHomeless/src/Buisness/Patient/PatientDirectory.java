/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Patient;

import java.util.ArrayList;

/**
 *
 * @author maneesh
 */
public class PatientDirectory {
    ArrayList<Patinet> patientList;
    
    
    public PatientDirectory(){
        patientList = new ArrayList<>();
    }

    public ArrayList<Patinet> getPatientList() {
        if(patientList == null){
            return new ArrayList<Patinet>();
        }
        return patientList;
    }

    public void setPatientList(ArrayList<Patinet> patientList) {
        this.patientList = patientList;
    }
    
    public void addPatient(Patinet p){
        patientList.add(p);
    }
    
    public Patinet createPatient(String name, int age, int weight, int height, String bloodGroup, String Symtoms, String disease){
        Patinet newPatient = new Patinet();
        newPatient.setAge(age);
        newPatient.setFullname(name);
        newPatient.setWeight(weight);
        newPatient.setHeight(height);
        newPatient.setBloodgrp(bloodGroup);
        newPatient.setSymptoms(Symtoms);
        newPatient.setDisease(disease);
        if(patientList == null){
            patientList = new ArrayList<Patinet>();
        }
        patientList.add(newPatient);
        return newPatient;
    }
    
    public void deletePatient(Patinet p){
        patientList.remove(p);
    }
    
}
