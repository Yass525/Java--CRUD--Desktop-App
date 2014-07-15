
package com.Getters_and_Setters;


public class personel {
    private int id;
    private String fname;
    private String mname;
    private String lname;
    private String gender;

   public personel(String fname,String mname,String lname,String gender,int id){
       this.fname = fname;
       this.mname = mname;
       this.lname = lname;
       this.gender = gender;
       this.id = id;
   }
   
   public personel(int ID,String fname,String mname,String lname,String gender){
       this.id = ID;
       this.fname = fname;
       this.mname = mname;
       this.lname = lname;
       this.gender = gender;
               
   }
   
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
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
}
