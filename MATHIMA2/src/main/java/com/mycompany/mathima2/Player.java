
package com.mycompany.mathima2;

import java.util.Date;

import java.util.Date;


public class Player {
    
    private String firstName; // ιδιοτητα για το μικρο ονομα
    private String lastName; // ιδιοτηταα για το επιθετο
    private Date birthDate;      // ιδιοτητα για την ημερομηνια γεννησης

    public Player(String firstName) {
        this.firstName = firstName;
    }
    
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public Date getBirthDate(){
       return birthDate;
    }
    
    public void setFirstName(String x){
      firstName = x;  
    }
    
    public void setLastName(String y){
        lastName = y;
    }
    
    public void printInfo(){
        System.out.println("TO ONOMA TOU PAIKTH EINAI "+this.getFirstName());
        System.out.println("TO EPITHETO TOU PAIKTH EINAI "+this.getLastName());
        System.out.println("TO PAIKTHS GENITHIKE STIS "+this.getBirthDate());
        System.out.println("sty for caps :3");
        
    }
}
