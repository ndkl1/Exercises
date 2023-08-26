import java.util.Optional;
import java.util.Scanner;

public class prez7 {
    public static void main(String[] args) {

        //primer 1 if-else-if
        /*
        Scanner ulaz = new Scanner(System.in);

        System.out.println("Vrednost prodaje: ");
        double prodaja = ulaz.nextDouble();
        System.out.println("Vrednost ciljne prodaje: ");
        double ciljna_prodaja = ulaz.nextDouble();


        if(prodaja>ciljna_prodaja*2) {
            System.out.println("Odlican posao i bonus je 1000.");}
        else if (prodaja*1.5>ciljna_prodaja){
            System.out.println("Dobar posao i bonus je 500.");}
        else if(prodaja>ciljna_prodaja){
            System.out.println("Zadovoljavajuci posao i bonus je 100.");}
        else{
            System.out.println("Vi ste otpusteni!");
        }
         */

        //primer 2 if-else-if
        /*
        Scanner unos = new Scanner(System.in);

        System.out.println("Broj zaposlenih: ");
        int broj_zaposlenih = unos.nextInt();
        System.out.println("Vrednost sladista robe: ");
        int skladista_robe = unos.nextInt();

        if(broj_zaposlenih<=20 && skladista_robe==0){
            System.out.println("Malo preduzece.");
        }
        else if(broj_zaposlenih>=21 && skladista_robe<=20){
            System.out.println("Srednje preduzece.");
        }
        else if(broj_zaposlenih>=200 && skladista_robe>20){
            System.out.println("Veliko preduzece.");
        }
        else{
            System.out.println("Nema takve opcije.");
        }
         */

        //primer 3 SWITCH
        /*
        for (int i=0; i<6; i++){
            switch (i){
                case 0:
                    System.out.println("i je 0");
                    break;
                case 1:
                    System.out.println("i je 1");
                    break;
                case 2:
                    System.out.println("i je 2");
                    break;
                default:
                    System.out.println("i je vece od 2");
            }
        }
         */

        //primer 4
        /*
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesi mesec: ");
        int mesec = unos.nextInt();

        switch (mesec){
            case 12:
            case 1:
            case 2:
                System.out.println("Zima");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Prolece");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Leto");
                break;
            default:
                System.out.println("Jesen");
        }
         */

        //primer 5
        /*
       Scanner unos = new Scanner(System.in);

       System.out.print("Unesi broj: ");
       int broj = unos.nextInt();

       switch (broj){
           case 1:
               System.out.println("Broj je 1");
               break;
           case 2:
               System.out.println("Broj je 2");
               break;
           case 3:
               System.out.println("Broj je 3");
               break;
           default:
               System.out.println("Neki drugi broj je dobijen");
       }
         */

        //primer 6 WHILE
        /*
        int zbir=0;
        int i = 1;
        while (i <= 20){
            zbir = zbir + i;
            i++;
        }
        System.out.println("Zbir je " + zbir);
         */

        //primer 7
        /*
        int i = 1;
        double zbir = 0;

        while(i <= 20) {
            if (i % 2 == 0) {
                continue;
            }
                zbir = zbir + i;
                i++;
        }
            System.out.println("Zbir je " + zbir);
         */

        //primer 8
        /*
        int i = -1;
        while (i <= 100) {
            if (i == 12) {
            break;
            }

            System.out.println("Prikaz: " + i);
            i++;
    }
         */

        //primer 9
        /*
        for(int i = 0; i<=11; i++){
            if(i%2==0) continue;
            System.out.println("i je " + i + ", a kvadrat je " + i*i);
        }
         */

        //primer 10 FOR-EACH
        /*
        int[] niz = {1,2,3,4,5,6,7,8,9,10};
        int zbir =0;
        for(int x: niz) {
            if (zbir > 50) break;
            zbir = zbir + x;
        }
            System.out.println("Zbir je " + zbir);
         */

        //primer 11
        /*
        int[] niz={1,2,3,4,5,6,7,8,9,10};
        int zbir=0;

        zbir = niz[0]+niz[1]+niz[2];
        System.out.println("Zbir je " + zbir);
         */
        //primer 11.1 FOR-EACH
        /*
        int[] niz={1,2,3,4,5,6,7,8,9,10};
        int zbir=0;

        for(int x: niz) {
            if (x == niz[3]) break;
            zbir += x;
        }
            System.out.println("Zbir je " + zbir);
         */

        //primer 12 FOR-EACH kod visedim nizova
        /*
        int niz[][] = new int[3][5];
        int zbir = 0;

        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                niz[i][j]=(i+1)*(j+1);
            }
        }

        for (int x[]:niz){
            for(int y:x){
                System.out.println("Broj je: " + y);
                zbir = zbir + y;
            }
        }
        System.out.println("Zbir je: " + zbir);
         */
}}
