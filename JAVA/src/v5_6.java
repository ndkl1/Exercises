import java.util.Scanner;

import static java.lang.Character.isLetter;
import static java.lang.Character.isLowerCase;

public class v5_6 {
    public static void main(String[] args) {
        //VEZBE 5
        //zad 1!!! formatiranje na kraju!!
        /*
        int z=0;
        int i;
        int[] niz=new int[10];

        Scanner unos = new Scanner(System.in);

        for (i=0; i<10; i++) {
            System.out.print("Unesi broj: ");
            niz[i] = unos.nextInt();

            z=z+niz[i];
        }
        System.out.println("Prosek je %.2f\n"+ (z/10));
        */
        //zad 2 !!!!!!
        /*
        int i;
        int maxd=0, maxi=0;
        String[] niz=new String[5];
        Scanner in=new Scanner(System.in);

        System.out.print("String: ");
        for (i=0; i<5; i++) {
            niz[i] = in.nextLine();

            if (i==0) maxd=niz[i].length();
            else if (niz[i].length()>maxd){
                maxi=i;
                maxd=niz[i].length();
            }
        }
        System.out.println("Najduzi: " + niz[maxi]);

         */
        //zad 3 !!!
        /*
        String niz[]= new String[5];
        Scanner in= new Scanner(System.in);
        System.out.println("Unesi stringove: ");
        int i;
        int max=0;

        for (i=0;i<5;i++){
            niz[i]=in.next();

            if(niz[i].length()>niz[max].length()){
                max=i;
            }
        }
        System.out.println("Najduzi: "+niz[max]);

         */
        //zad 4
        /*
        Scanner in=new Scanner(System.in);
        System.out.println("Text: ");
        String t = in.next();
        int bc, bvs, bms;
        bc = bvs = bms = 0;

        for (int i=0; i<t.length(); i++){
            if (isDigit(t.charAt(i))) bc++;
            else if (isLowerCase(t.charAt(i))) bvs++;
            else if (isUpperCase(t.charAt(i))) bms++;
        }

        System.out.println(bc+" "+bvs+" "+bms);

         */
        //zad 5
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Unesi: ");

        int z=0;
        while (true) {
            int n = in.nextInt();
            if (n == 0) break;
            z+=n;
        }
        System.out.println(z);

         */
        //zad 6
        /*
        Scanner unos = new Scanner(System.in);

        int z=0;
        System.out.println("Unesi broj: ");
        do{
            int n = unos.nextInt();
            z+=n;
            if (n==0) break;
        }
        while (true); //moglo je i da se stavi n!=0

        System.out.println("Zbir je " +z);

         */

        //VEZBE 6
        //zad 1
        /*
        Scanner in = new Scanner(System.in);
        int niz[]=new int[10];

        System.out.println("Brojevi: ");

        int z=0;
        for (int x: niz){
            x=in.nextInt();

            if (x%2==0) z+=x;
            else continue;
        }
        System.out.println("Zbir je "+z);

         */
        //zad 2
        /*
        Scanner in=new Scanner(System.in);
        System.out.println("Brojevi: ");
        double[] niz=new double[10];

        int s=0;
        for (double x: niz){
            x=in.nextDouble();
            s+=x;
        }
        System.out.println("Prosek je "+(s/10));

         */
        //zad 3
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Broj: ");

        int x, s = 0, p = 1, k=0;
        do {
            x = in.nextInt();

            switch (x % 3) {
                case 0:
                    s += x;
                    break;
                case 1:
                    p *= x;
                    break;
                case 2:
                    k+=(x*x);
                    break;
            }
        } while (x!=0);
        System.out.println("Zbir je "+s+", proizvod "+p+", a kvadrat "+ k);

         */
        //zad 4
        /*
        int[][] m=new int[5][5];

        for (int i=0;i<5;i++){
            for (int j=0; j<5;j++){
                m[i][j]=i*j;
            }
        }

        for(int x[]: m){
            for (int y: x){
                System.out.print(y+"\t");
            }
            System.out.println();
        }

         */
        //5 zad! nova metoda!
        /*
        Scanner unos = new Scanner(System.in);
        System.out.println("String: ");
        String s=unos.next();

        System.out.println("Ima slova: "+metoda(s));
    }
    public static int metoda(String s){
        int z=0;
        int n=s.length();
        for (int i=0; i<n; i++){
            if (isLetter(s.charAt(i)))
                z++;
        }
        return z;
    }

         */
}}
