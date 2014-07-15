/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.SelectList;

import com.Connection.Connection;
import com.Getters_and_Setters.accounts;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Neil
 */
public class AccountsSelect {
    private java.sql.Connection con = null;
    private ResultSet rs = null;
    
    public List<accounts>getAccountsInfo()throws Exception{
        List CollList = new ArrayList();
        con =  (java.sql.Connection) Connection.getMySqlConnection();
        java.sql.Statement stmt = con.createStatement();
        
        rs = stmt.executeQuery("Select uname,CONCAT(lname,',',fname,' ',mname)as fullname,gender,type,id from account");
        
        while(rs.next()){
            int ID = rs.getInt("id");
            String uname = rs.getString("uname");
            String fullname = rs.getString("fullname");
            String type = rs.getString("type");
            String gender = rs.getString("gender");
            accounts ac = new accounts(ID,uname,fullname,type,gender);
            CollList.add(ac);
            
        }
        con.close();
        return CollList;
       
    }
    public List<accounts>getAccountsInfoSearch(String Key)throws Exception{
        List CollList = new ArrayList();
        con =  (java.sql.Connection) Connection.getMySqlConnection();
        java.sql.Statement stmt = con.createStatement();
        
        rs = stmt.executeQuery("Select uname,CONCAT(lname,',',fname,' ',mname)as fullname,gender,type,id from account "
                + "where lname LIKE '%"+Key+"%' OR fname LIKE '%"+Key+"%'");
        
        while(rs.next()){
            int ID = rs.getInt("id");
            String uname = rs.getString("uname");
            String fullname = rs.getString("fullname");
            String type = rs.getString("type");
            String gender = rs.getString("gender");
            accounts ac = new accounts(ID,uname,fullname,type,gender);
            CollList.add(ac);
            
        }
        con.close();
        return CollList;
       
    }
    
    public List<accounts>getAccountID(String Key)throws Exception{
        List CollList = new ArrayList();
        con =  (java.sql.Connection) Connection.getMySqlConnection();
        java.sql.Statement stmt = con.createStatement();
        
        rs = stmt.executeQuery("Select * from account where id = '"+Key+"'");
        
        while(rs.next()){
            int ID = rs.getInt("id");
            String uname = rs.getString("uname");
            String pass = rs.getString("pass");
            String fname = rs.getString("fname");
            String mname = rs.getString("mname");
            String lname = rs.getString("lname");
            String gender = rs.getString("gender");
            accounts ac = new accounts(ID,uname,pass,fname,mname,lname,gender);
            CollList.add(ac);
            
        }
        con.close();
        return CollList;
       
    }
}
