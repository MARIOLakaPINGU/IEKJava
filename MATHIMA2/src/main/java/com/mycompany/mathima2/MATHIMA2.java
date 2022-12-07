
package com.mycompany.mathima2;


public class MATHIMA2 {

    public static void main(String[] args) {
        
        Team t1 = new Team();
        t1.setTeamColor("blue");
        t1.setTeamName("FAS");
        t1.printStats();
        
        Player p1 = new Player("mariol");
        Player p2 = new Player("kotsiai");
        p1.printInfo();
        p2.printInfo();
    }
}
