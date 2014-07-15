/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Interface_Implementation;

import com.Interface.PersonelInterface;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Neil
 */
public class PersonelImplementation implements PersonelInterface{
    
   private  java.sql.Connection con ;
   private  PreparedStatement ps;
   private ResultSet rs;
    
   @Override
     public void addPersonel(String fname,String mname,String lname, String gender){
         try{
        String sql = "Insert into personel(fname,mname,lname,gender) values(?,?,?,?)";
        con =  (java.sql.Connection) com.Connection.Connection.getMySqlConnection();
        ps= (PreparedStatement) con.prepareCall(sql);
        
        ps.setString(1, fname);
        ps.setString(2, mname);
        ps.setString(3, lname);
        ps.setString(4, gender);
       
        ps.executeUpdate();
        con.close();
       
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
     }
     
     @Override
    public void updatePersonel(int id,String fname,String mname,String lname,String gender){
        try{
        String sql = "UPDATE personel set fname = '"+fname+"',"
                + "mname = '"+mname+"',lname = '"+lname+"',gender = '"+gender+"' where id = '"+id+"'";
        con =  (java.sql.Connection) com.Connection.Connection.getMySqlConnection();
        ps= (PreparedStatement) con.prepareCall(sql);
        
        ps.executeUpdate();
        con.close();
       
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
   
    }
    
    @Override
    public void deletePersonel(String id){
        try{
        String sql = "Delete from personel where id = '"+id+"'";
        con =  (java.sql.Connection) com.Connection.Connection.getMySqlConnection();
        ps= (PreparedStatement) con.prepareCall(sql);
        
        ps.executeUpdate();
        con.close();
       
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
   
    }
}
