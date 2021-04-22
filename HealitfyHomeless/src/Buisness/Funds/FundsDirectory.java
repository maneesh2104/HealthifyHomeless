/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Funds;

import java.util.ArrayList;

/**
 *
 * @author maneesh
 */
public class FundsDirectory {
    ArrayList<FundsRaisingRequest> funds;
    
    public FundsDirectory(){
        funds = new ArrayList<>();
    }
    
    public FundsRaisingRequest createNewFundReq(String amount, String email, String ssn, String phone, String name){
        FundsRaisingRequest req = new FundsRaisingRequest();
        req.setAmmount(amount);
        req.setEmail(email);
        req.setName(name);
        req.setSsn(ssn);
        req.setPhone(phone);
        return req;
    }
    
    
}
