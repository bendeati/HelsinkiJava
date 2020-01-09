
package gyhelsinki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class GyHelsinki {

    
    public static void main(String[] args) {
        
        ArrayList<Helsinki> lista = new ArrayList<>();
        
        try 
        {
            FileReader fajl = new FileReader("helsinki.txt");
            BufferedReader br = new BufferedReader(fajl);
            String sor = null;
            while ((sor = br.readLine()) != null) 
            {                
                Helsinki t = new Helsinki(sor);
                lista.add(t);
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Hiba a beolvasáskor!" + e);
        }
        
        System.out.println("3. feladat");
        System.out.println("Pontszerző helyezések száma: " + lista.size());
        
        
        System.out.println("4. feladat");
        int arany = 0;
        int ezust = 0;
        int bronz = 0;
        for (Helsinki h : lista) {
            if (h.getHelyezes() == 1) {
                arany++;
            }
            if (h.getHelyezes() == 2) {
                ezust++;
            }
            if (h.getHelyezes() == 3) {
                bronz++;
            }
        }
        System.out.println("Arany: " + arany);
        System.out.println("Ezüst: " + ezust);
        System.out.println("Bronz: " + bronz);
        System.out.println("Összesen: " + (arany+ezust+bronz));
        
        System.out.println("5. feladat");
        int osszPont = arany;
        for (Helsinki h : lista) {
            osszPont += (7 - h.getHelyezes());
        }
        System.out.println("Olimpiai pontok száma: " + osszPont);
        
        System.out.println("6. feladat");
        int uszas = 0;
        int torna = 0;
        for (Helsinki h : lista) {
            if (h.getSportag().equals("torna") && h.getHelyezes() < 4) {
                torna++;
            }
            if (h.getSportag().equals("uszas") && h.getHelyezes() < 4) {
                uszas++;
            }
        }
        if (uszas > torna) {
            System.out.println("Úszásban volt több");
        }
        if (uszas < torna) {
            System.out.println("Tornában volt több");
        }
        if (uszas == torna) {
            System.out.println("Egyfoma az úszás és a torna");
        }
        
        System.out.println("7. feladat");
        try 
        {
            System.setProperty("file.encoding", "UTF8");
            PrintWriter pw = new PrintWriter("helsinki2.txt");
            for (Helsinki h : lista) {
                pw.print(h.getHelyezes() + " ");
                pw.print(h.getSportoloSzam()+ " ");
                if(h.getSportag().equals("kajakkenu"))
                    pw.print("kajak-kenu ");
                pw.println(h.getVersenySzam());
            }
            pw.close();
        }
        catch (Exception e) 
        {
            System.out.println("Hiba a fájlba íráskor!" + e);
        }
    }
    
}
