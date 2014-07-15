/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.SelectList;

import com.Connection.Connection;
import com.Getters_and_Setters.accounts;
import com.Getters_and_Setters.personel;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Neil
 */
public class PersonelSelect {
    private java.sql.Connection con = null;
    private ResultSet rs = null;
    
    public List<personel>getPersonelInfo()throws Exception{
        List CollList = new ArrayList();
        con =  (java.sql.Connection) Connection.getMySqlConnection();
        java.sql.Statement stmt = con.createStatement();
        
        rs = stmt.executeQuery("Select * from personel");
        
        while(rs.next()){
            String fname = rs.getString("fname");
            String mname = rs.getString("mname");
            String lname = rs.getString("lname");
            String gender = rs.getString("gender");
            int ID = rs.getInt("id");
            personel ac = new personel(fname,mname,lname,gender,ID);
            CollList.add(ac);
            
        }
        con.close();
        return CollList;
       
    }
    public List<personel>getPersonelInfoSearch(String Key)throws Exception{
        List CollList = new ArrayList();
        con =  (java.sql.Connection) Connection.getMySqlConnection();
        java.sql.Statement stmt = con.createStatement();
        
        rs = stmt.executeQuery("Select * from personel where  fname LIKE '%"+Key+"%' OR lname LIKE '%"+Key+"%'");
        
        while(rs.next()){
            String fname = rs.getString("fname");
            String mname = rs.getString("mname");
            String lname = rs.getString("lname");
            String gender = rs.getString("gender");
            int ID = rs.getInt("id");
            personel ac = new personel(fname,mname,lname,gender,ID);
            CollList.add(ac);
            
        }
        con.close();
        return CollList;
       
    }
    
    public List<personel>getPersonelID(String Key)throws Exception{
        List CollList = new ArrayList();
        con =  (java.sql.Connection) Connection.getMySqlConnection();
        java.sql.Statement stmt = con.createStatement();
        
        rs = stmt.executeQuery("Select * from personel where id = '"+Key+"'");
        
        while(rs.next()){
            int ID = rs.getInt("id");
            String fname = rs.getString("fname");
            String mname = rs.getString("mname");
            String lname = rs.getString("lname");
            String gender = rs.getString("gender");
            personel ac = new personel(ID,fname,mname,lname,gender);
            CollList.add(ac);
            
        }
        con.close();
        return CollList;
       
    }
}
