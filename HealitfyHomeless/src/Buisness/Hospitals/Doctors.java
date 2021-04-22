/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Hospitals;

import Buisness.Patient.Patinet;
import java.util.ArrayList;

/**
 *
 * @author maneesh
 */
public class Doctors {
    private String name;
    private String quali;
    private String department;
    private String specality;
    String username;
    String password;
    ArrayList<Patinet> patientList;
    
    public Doctors(){
        patientList = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuali() {
        return quali;
    }

    public void setQuali(String quali) {
        this.quali = quali;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecality() {
        return specality;
    }

    public void setSpecality(String specality) {
        this.specality = specality;
    }
    
    @Override
    public String toString(){
        return name;
    }
   
    
    
}
