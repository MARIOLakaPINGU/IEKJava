
package com.mycompany.mathima2;


public class Team {
    
    private String teamName;
    private String teamColour;
    
    
    
    
    
    public String getTeamName(){
       return teamName; 
    }
    
    public String getTeamColor(){
       return teamColour; 
    }
    
    public void setTeamName(String z){
        teamName = z;
    }
    
    public void setTeamColor(String v){
        teamColour = v;
    }
    
    public void printStats(){
        System.out.println("TO ONOMA TIS OMADAS EINAI "+this.getTeamName());
        System.out.println("TO XRWMA TIS OMADAS EINAI "+this.getTeamColor());
        System.out.println("sty for caps :3");
        
        
    }
}