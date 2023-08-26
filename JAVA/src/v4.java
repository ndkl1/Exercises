public class v4 {
    public static void main(String[] args){
        //zad 1
        /*
        int a[] = new int[10];
        int s=0;

        for (int i=0; i<10; i++){
            a[i]=1+(int)(Math.random()*100);
            System.out.println("Broj: " + a[i]);
            s+=a[i];
        }
        System.out.println("Zbir svih brojeva je " + s);
         */

        //zad 2 ???!!!!
        /*
        int niz[] = new int[10];
        int i, max, min;

        for (i=0; i<10; i++){
            niz[i]=1+(int)(Math.random()*100);
            System.out.println("Broj: " + niz[i]);
        }

        min=niz[0];
        max=niz[0];

        for(i=0; i<10; i++){
            if (niz[i]<min){
                min=niz[i];
            }
            if(niz[i]>max){
                max=niz[i];
            }
        }
        System.out.println("Maksimum niza je " + max + ", a minimum je " + min);

         */

        //zad 3
        /*
        int[][] m = new int[5][5];
        int i, j;

        for(i=0; i<5; i++){
            for(j=0; j<5; j++){
                m[i][j]=i*j;
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
         */

        //zad 4
        /*
        char[][] kvadrat= new char[10][10];
        int i, j;

        for (i=0; i<10; i++) {
            for (j = 0; j < 10; j++) {
                if (i == j) {
                    System.out.print('*');
                } else {
                    System.out.print('_');
                }
            }
            System.out.println();
        }

         */

        //zad 5

        int[][] m = new int[5][5];
        int i, j;

        double[] pomocni = {0,0,0,0,0};

        for (i=0; i<5; i++) {
            for (j = 0; j < 5; j++) {
                m[i][j] = 1 + (int) (Math.random() * 15);
            }
        }
        for (i=0; i<5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(m[i][j] + " ");
                pomocni[i] += m[i][j];
            }
            System.out.println();
            pomocni[i]=pomocni[i]/5;
            System.out.println("prosek " + i + " je " + pomocni[i]);
        }

        //zad 6
        /*
        String[] niz = {"Stata", "Matematika", "Sociologija", "Racunovodstvo",
                "Makroekonomija", "Osnovi ekonomije"};

        int i, a, br=0;
        int n=niz.length;

        for(i=1; i<=20; i++) {
            a = (int) (Math.random() * n);
            System.out.println("Omiljeni predmet je " + niz[a]);

            if (niz[a].equals("Matematika")) {
                br++;
            }
        }
        System.out.println("Matematika se pojavila " + br + " puta.");

         */

}}
