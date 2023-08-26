import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class v5 {
    public static void main(String[] args) {

        //1. zad
        /*
        int s=0;
        int niz[] = new int[10];

        Scanner in = new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.print("Unesi broj: ");
            int broj = in.nextInt();
            niz[i]=broj;   //moglo je i niz[i]=in.nextInt();

            s=s+i;
        }
        System.out.println("Prosek je " + s/10.00);
         */

        //2. zad
        /*
        int maxi=0;
        String[] niz= new String[5];

        Scanner in = new Scanner(System.in);
        System.out.println("Unesi string: ");
        for (int i=0; i<5; i++){
            niz[i]=in.next();

            if(niz[i].length()>niz[maxi].length()){
                maxi=i;
            }
            System.out.print("Najduzi string je " + niz[maxi]);
        }
         */

        //3. zad.
        /*
        Scanner in= new Scanner(System.in);

        System.out.print("Unesi tekst: ");
        String ulaz = in.nextLine();
        int n=ulaz.length();

        for(int i=0; i<n; i++){
            if(isDigit(ulaz.charAt(i))){

            }
        }
         */

        //5. zad. while(true)
        /*
        int zbir=0;
        Scanner ulaz = new Scanner(System.in);

        System.out.println("Broj je ");

        while(true){
        int broj = ulaz.nextInt();
            if (broj == 0) break;
            zbir = zbir + broj;
        }
        System.out.println("Zbir je " + zbir);
         */

        //6. zad
        int sum = 0;
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesi broj: ");
        int broj;
        do {
            broj = unos.nextInt();
            sum += broj;
        } while (broj != 0);

        System.out.println("Zbir je " + sum);

    }}
