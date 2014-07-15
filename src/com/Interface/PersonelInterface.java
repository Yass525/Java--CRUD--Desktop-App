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
public interface PersonelInterface {
    
    public void addPersonel(String fname,String mname,String lname, String gender);
    public void updatePersonel(int id,String fname,String mname,String lname, String gender);
    public void deletePersonel(String id);
}
