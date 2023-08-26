import java.security.SecureRandom;
import java.util.Scanner;

public class prez4 {
    //primer 1
    /*
    public static void main(String[] args){
        int x = 10;
        int y = 5;

        if(x>y) {
            System.out.println((x * 2) + " i " + (y / 3));
        }
        else{
            System.out.println((x/3) + " i " + (y*2));
        }
     */

    //primer 2
    /*
     public static void main(String[] args) {
         int x = 10;
         int y = 20;
         int z = 5;

         if (x == y) {
             z = z + 5;
             System.out.println("Z iznosi " + z);
         }
         if (x != y) {
             z = z - 5;
             System.out.println("Z iznosi " + z);
         }
     }
    */

    //primer 3
    /*
    public static void main(String[] args){
        int x;
        x = (int)(Math.random() * 51 + 40);
        System.out.println("Broj je " + x);

        x++;
        System.out.println("Ovaj broj uvecan za 1 je " + x);
    }
*/

    //primer 4
    /*
    public static void main(String[] args){

       double x = (Math.random());
       long y = (Math.round(Math.random()*10));
       long z = (Math.round(Math.random()*100));
       long b = (Math.round(Math.random()*1000));

       System.out.println("Broj x je " + x);
       System.out.println("Broj y je " + y);
       System.out.println("Broj z je " + z);
       System.out.println("Broj r je " + b);
    }
     */

    //primer 5
    /*
    public static void main(String[] args){
        int slbroj = 0;
        slbroj = 1 + (int)(Math.random()*100);

        if(slbroj%2==0) {
            if (slbroj < 50) {
                System.out.println("Broj koji je paran i manji od 50 je " + slbroj);
            }
        }
        else{
            System.out.println("Broj koji je neparan " + slbroj);
        }
    }
     */

    //primer 6
    /*
    public static void main(String[] args){
        float ukupno = 15000;

        ukupno = ukupno + (ukupno * 0.4f);
        System.out.println("Posle prve godine iznos je " + ukupno);

        ukupno = ukupno - 1500;
        System.out.println("Posle druge godine je " + ukupno);

        ukupno = ukupno + (ukupno * 0.12f);
        System.out.println("Posle trece godine je " + ukupno);
    }
     */

    //primer 7
    /*
    public static void main(String[] args){
        char znak = 'A';
        znak = (char) (128.0*Math.random());

        if(znak>='A' && znak<='Z')
        //moglo je i if(isUpperCase(znak))
        {
            System.out.println("Dobili smo veliko slovo " + znak);
        }
        else if(znak>='a' && znak<='z')
        //moglo je i if(isLowerCase(znak))
        {
            System.out.println("Dobili smo malo slovo " + znak);
        }
        else{
            System.out.println("Dobijeni znak uopste nije slovo " + znak);
        }
    }
     */

    //primer 8 scanner i niz za 1 !!!!!!
    /*
    public static void main(String[] args){
        Scanner niz = new Scanner(System.in);

        System.out.println("Unesite broj elemenata niza: ");
        int n=niz.nextInt();
        int[] broj = new int[n]; //def niz

        System.out.print("Unesite elemente niza: ");
        for(int i=0; i< broj.length; i++){
        broj[i]= niz.nextInt();
        }

        for(int i=0; i<broj.length;i++){
        if(i%2!=0){
            System.out.println("Niz ["+i+"]="+broj[i]);
        }}
    }
     */

    //primer 9 scanner i niz za vise od 1 !!!!!!
    public static void main(String[] args){
        Scanner ulaz = new Scanner(System.in);

        System.out.println("Def dimenzije i: ");
        int red = ulaz.nextInt();
        System.out.println("Def dimenzije j: ");
        int kolona = ulaz.nextInt();
        int[][] niz = new int[red][kolona];

        System.out.println("Ucitati elemente matrice: ");
        for(int i=0; i<red; i++){
            for(int j=0; j<kolona; j++){
                niz[i][j]=ulaz.nextInt();
                System.out.print(niz[i][j]+" ");
            }
            System.out.println();
        }
    }
}

