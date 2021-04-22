/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Hospitals;

import java.util.ArrayList;

/**
 *
 * @author maneesh
 */
public class DoctorDirectoy {
    ArrayList<Doctors> doctorList; 
    
    public DoctorDirectoy(){
        doctorList = new ArrayList<>();
    }

    public ArrayList<Doctors> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctors> doctorList) {
        this.doctorList = doctorList;
    }
    
    public Doctors createDoctors(String name, String qalification, String department, String specality, String userName, String password){
        Doctors doc = new Doctors();
        doc.setName(name);
        doc.setDepartment(department);
        doc.setQuali(qalification);
        doc.setSpecality(specality);
        doc.setUsername(userName);
        doc.setPassword(password);
        doctorList.add(doc);
        return doc;
    }
    
    
}
