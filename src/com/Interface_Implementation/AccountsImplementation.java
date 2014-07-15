/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Interface_Implementation;

import com.Interface.AccountsInterface;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Neil
 */
public class AccountsImplementation implements AccountsInterface{
    
   private  java.sql.Connection con ;
   private  PreparedStatement ps;
   private ResultSet rs;
    
    @Override
    public void addAccounts(String uname,String pass,String fname,String mname,String lname,String gender){
        try{
        String sql = "Insert into account(uname,pass,type,status,fname,lname,mname,gender) values(?,?,?,?,?,?,?,?)";
        con =  (java.sql.Connection) com.Connection.Connection.getMySqlConnection();
        ps= (PreparedStatement) con.prepareCall(sql);
        
        ps.setString(1, uname);
        ps.setString(2, pass);
        ps.setString(3, "Administrator");
        ps.setString(4,"Active");
        ps.setString(5, fname);
        ps.setString(6, lname);
        ps.setString(7, mname);
        ps.setString(8, gender);
       
        ps.executeUpdate();
        con.close();
       
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
   
    }
    
   @Override
    public void updateAccoutns(int id,String uname,String pass,String fname,String mname,String lname,String gender){
        try{
        String sql = "UPDATE account set uname = '"+uname+"',pass = '"+pass+"',fname = '"+fname+"',"
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
    public void deleteAccounts(String id){
        try{
        String sql = "Delete from account where id = '"+id+"'";
        con =  (java.sql.Connection) com.Connection.Connection.getMySqlConnection();
        ps= (PreparedStatement) con.prepareCall(sql);
        
        ps.executeUpdate();
        con.close();
       
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
   
    }
}
