/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Buisness.Patient.PatientDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import Buisness.Hospitals.DoctorDirectoy;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PatientDirectory patientDirectory;
    private PatientDirectory assignedPatientDirectort;
    private DoctorDirectoy doctorDirectory;
    private int organizationID;
    private static int counter=0;
    String address= "";
    
    public enum Type{
        Admin("Admin Organization"),
        Doctor("Doctor Organization"), 
        NGO("NGO"),
        HealthCamp("Health Camp"),
        Shelter("Over night shelter"),
        Hospital("Hospital"),
        Lab("Lab Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        patientDirectory = new PatientDirectory();
        doctorDirectory = new DoctorDirectoy();
        assignedPatientDirectort = new PatientDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public DoctorDirectoy getDoctorDirectory() {
        if (doctorDirectory == null){
            doctorDirectory = new DoctorDirectoy();
        }
        return doctorDirectory;
    }

    public PatientDirectory getAssignedPatientDirectort() {
        if(assignedPatientDirectort == null){
            assignedPatientDirectort = new PatientDirectory();
        }
        return assignedPatientDirectort;
    }

    public void setAssignedPatientDirectort(PatientDirectory assignedPatientDirectort) {
        this.assignedPatientDirectort = assignedPatientDirectort;
    }
    
    

    public void setDoctorDirectory(DoctorDirectoy doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    
    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
