/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Interface;

/**
 *
 * @author Neil
 */
public interface AccountsInterface {
    
    public void addAccounts(String uname,String pass,String fname,String mname,String lname,String gender);
    public void updateAccoutns(int id,String uname,String pass,String fname,String mname,String lname,String gender);
    public void deleteAccounts(String id);
}
