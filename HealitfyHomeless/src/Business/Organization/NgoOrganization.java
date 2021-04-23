/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author maneesh
 */
public class NgoOrganization extends Organization {
    
    String address;
    
    public NgoOrganization(String address) {
        super(Organization.Type.NGO.getValue());
        this.address = address;
        super.setAddress(address);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
