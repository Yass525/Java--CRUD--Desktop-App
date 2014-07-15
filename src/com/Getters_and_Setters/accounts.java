
package com.Getters_and_Setters;


public class accounts {
    private int id;
    private String uname;
    private String pass;
    private static String type;
    private String TYPEs;
    private String status;
    private String fname;
    private String mname;
    private String lname;
    private String gender;
   
    public accounts(String type,int ID,String stat){
        this.type = type;
        this.id = ID;
        this.status = stat;
    }
    
    public accounts(int aid, String auname,String apass, String afname, String amname,String alname,String agender){
        this.id = aid;
        this.uname = auname;
        this.pass = apass;
        this.fname = afname;
        this.mname = amname;
        this.lname = alname;
        this.gender = agender;
        
    }
    
    public accounts(int ID,String uname,String fullname,String type,String gender){
        this.id = ID;
        this.uname = uname;
        this.fname = fullname;
        this.TYPEs = type;
        this.gender = gender;
    }
    
    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }

    
    public String getUname() {
        return uname;
    }

   
    public void setUname(String uname) {
        this.uname = uname;
    }

    
    public String getPass() {
        return pass;
    }

    
    public void setPass(String pass) {
        this.pass = pass;
    }

    
    public String getType() {
        return type;
    }

    
    public void setType(String type) {
        this.type = type;
    }

    
    public String getStatus() {
        return status;
    }

    
    public void setStatus(String status) {
        this.status = status;
    }

   
    public String getFname() {
        return fname;
    }

    
    public void setFname(String fname) {
        this.fname = fname;
    }

    
    public String getMname() {
        return mname;
    }

    
    public void setMname(String mname) {
        this.mname = mname;
    }

    
    public String getLname() {
        return lname;
    }

    
    public void setLname(String lname) {
        this.lname = lname;
    }

    
    public String getGender() {
        return gender;
    }

    
    public void setGender(String gender) {
        this.gender = gender;
    }

    
    public String getTYPEs() {
        return TYPEs;
    }

    
    public void setTYPEs(String TYPEs) {
        this.TYPEs = TYPEs;
    }
}
