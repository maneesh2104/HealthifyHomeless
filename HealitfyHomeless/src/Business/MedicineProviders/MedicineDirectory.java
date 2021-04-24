/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicineProviders;

import java.util.ArrayList;

/**
 *
 * @author maneesh
 */
public class MedicineDirectory {
    public ArrayList<Medicine> medicineList;
    
    public MedicineDirectory(){
        medicineList = new ArrayList<>();
    }
    
    public Medicine createNewMedicine(String name, String price, String prescription, String quantity){
        Medicine med = new Medicine();
        med.setName(name);
        med.setPrice(price);
        med.setPrescription(prescription);
        med.setQuantity(quantity);
        medicineList.add(med);
        return med;
    }
    
}
