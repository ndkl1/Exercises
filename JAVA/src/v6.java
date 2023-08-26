import java.util.Scanner;

public class v6 {
    public static void main(String[] args){

        //zad 1 for-each
        /*
        int sum=0;
        int niz[] = new int[10];
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesi br ");

        for(int x:niz) {
            x=unos.nextInt();
            if(x%2!=0) continue;
            sum += x;
        }
        System.out.println("Zbir je " +sum);
         */

        //zad 2
        /*
        int sum=0;
        int[] niz= new int[10];
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesi broj: ");
        for(int x:niz){
            x=unos.nextInt();
            sum += x;
        }
        System.out.println("Prosek svih brojeva je " + (sum/10));
         */

        //zad 3 do-while i switch
        /*
        Scanner unos = new Scanner(System.in);
        int sum=0;
        double pom =1;
        double rez =0;
        int x;
        do {
            x = unos.nextInt();
                    switch (x % 3) {
                        case 0:
                            sum += x;
                            System.out.println("Sum je " + sum);
                            break;
                        case 1:
                            pom *= x;
                            System.out.println("Rez je " +pom);
                            break;
                        case 2:
                            rez = rez + (x*x);
                            System.out.println("Resenje je " + rez);
                            break;
                    }
        }
        while (x!=0);

         */

        //zad 4
        /*
        int[][] niz = new int[5][5];

        for (int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                niz[i][j]=i*j;
            }
        }

        for(int x[]:niz){
            for (int y:x){
                System.out.print(y);
            }
            System.out.println();
        }
         */

        //zad 5
        /*
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesi tekst ");
        String str = unos.nextLine();

        System.out.println("Duzina ovog stringa je " );

         */

        //KOLOKVIJUM
        /*
        int c=50;
        if(c>60)
            System.out.println("Broj je veci");
        System.out.println("Broj");
         */

        /*
        int a=200;
        double b=200.5;
        boolean c=(a==b);
        System.out.println(c);
         */

        /*
        double a=10%9;
        System.out.println(a);
         */
}}
