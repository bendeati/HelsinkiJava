/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyhelsinki;

/**
 *
 * @author bendeati
 */
public class Helsinki {
    
    private int helyezes;
    private int sportoloSzam;
    private String sportag;
    private String versenySzam;

    public int getHelyezes() {
        return helyezes;
    }

    public int getSportoloSzam() {
        return sportoloSzam;
    }

    public String getSportag() {
        return sportag;
    }

    public String getVersenySzam() {
        return versenySzam;
    }

    public Helsinki(String sor) {
        String[] d = sor.split(" ");
        this.helyezes = Integer.parseInt(d[0]);
        this.sportoloSzam = Integer.parseInt(d[1]);
        this.sportag = d[2];
        this.versenySzam = d[3];
    }
    
    
    
}
