

package com.SelectList;

import com.Connection.Connection;
import com.Getters_and_Setters.accounts;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class Login_Class {
    private java.sql.Connection con = null;
    private ResultSet rs = null;
    
    public List<accounts>getAccType(String username,String password)throws Exception{
        List CollList = new ArrayList();
        con =  (java.sql.Connection) Connection.getMySqlConnection();
        java.sql.Statement stmt = con.createStatement();
        
        rs = stmt.executeQuery("Select id,type,Status from account where uname = '"+username+"' and pass = '"+password+"'");
        
        while(rs.next()){
            int ID = rs.getInt("id");
            String type = rs.getString("type");
            String stat = rs.getString("Status");
            accounts ac = new accounts(type,ID,stat);
            CollList.add(ac);
            
        }
        con.close();
        return CollList;
       
    }
}
