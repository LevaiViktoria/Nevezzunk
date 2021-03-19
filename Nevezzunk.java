package nevezzunk;

import java.util.Scanner;

public class Nevezzunk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bemenet =new Scanner(System.in);
        System.out.print("Írd be a teljes neved: ");
        String tNev = bemenet.nextLine();
        System.out.print("Írd be a keresztneved: ");
        String keNev=bemenet.nextLine();
      /*System.out.println("Írd be a vezetékneved: ");
        String vNev=bemenet.nextLine();*/
        
        
        System.out.println("Nagybetűs: " + tNev.toUpperCase());
        System.out.println("Szókezdők nagybetűsek: "+metodusok.firstUpper(tNev));
        System.out.println("Kisbetűs: " + tNev.toLowerCase());
        System.out.println("Ennyi karakterből áll a neved:" + tNev.length());
        int szokozindex1 = tNev.indexOf(' ');
        System.out.println("A névben az 1.  szóköz helye: " + szokozindex1);
        String szokozindex2 = metodusok.masodikSzokoz(tNev);
        System.out.println("A névben a 2. szóköz helye:" + szokozindex2);
        String[] reszek = tNev.split(" ");
        String vNev = reszek[0];
        String kNev = reszek[1];
        System.out.println("1. keresztnév kezdő pozíciója:"+ tNev.indexOf(kNev));
        System.out.println("2. keresztnév kezdő pozíciója:"+metodusok.vaneMasodikNev(tNev));
        System.out.println("Vezetéknév: " + vNev);
        System.out.println("Keresztnév: " + kNev);
        System.out.println("Vezetéknév hossza: " + vNev.length());
        System.out.println("Keresztnév hossza: " + kNev.length()); 
        System.out.println("Névegyesítés: "+vNev+" "+kNev);
        System.out.println("Új név: "+vNev+" "+keNev);
    }
    
}