public class prez5 {

    //primer 1
    /*
    public static void main(String[] args){
       char znak = 'A';
       znak = (char)(Math.random()*128);

       if(znak>='A') {
           if (znak <= 'Z') {
               System.out.println("Dobijeno je veliko slovo " + znak);
           } else {
               if (znak >= 'a') {
                   if (znak <= 'z') {
                       System.out.println("Dobijeno je malo slovo " + znak);
                   } else {
                       System.out.println("Kod je veci, i ne predstavlja slovo " + znak);
                   }
               } else {
                   System.out.println("Kod je manji, ali ne predstavlja slovo " + znak);
               }
           }
       }
       else{
           System.out.println("Kod je manji od A, tako da to nije slovo " + znak);
       }
    }
     */

    //primer 2 STRINGOVI
    /*
    public static void main(String[] arg) {
        String str_datum = "13/11/2022";
        String dan = str_datum.substring(0, 2);
        String mesec = str_datum.substring(3, 5);
        String godina = str_datum.substring(6,10);

        System.out.println("Datum je " + str_datum);
        System.out.println("Dan je " + dan);
        System.out.println("Mesec je " + mesec);
        System.out.println("Godina je " + godina);
    }
     */

    //primer 3 NIZOVI
    /*
    public static void main(String args[]){
        double brojevi[] = {10.8, 11.2, 12.7, 13.5, 14.4};
        double rezultat = 0;
        int i;

        for(i=0; i<5; i++) {
            rezultat = rezultat + brojevi[i];
        }
        System.out.println("srednja vrednost je " + (rezultat/5));
    }
    */

    //primer 4
    /*
    public static void main(String[] args){
        double broj []= new double[50];

        for(int i=0; i<broj.length; i++){
            broj [i]= (100* Math.random());
            System.out.println(broj[i]);
        }
    }
     */

    //primer 5
    /*
    public static void main(String[] args) {
        int dvodimenniz[][] = new int[4][5];
        int i, j, k = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                dvodimenniz[i][j] = k;
                k++;
                System.out.print(dvodimenniz[i][j] + " ");
            }
            System.out.println();
        }
    }
    */

    //primer 6
    /*
    public static void main(String[] args){
        int k=0;

        int niz[][]=new int[4][4];
        for(int i=0; i< niz.length; i++){
            for(int j=0; j< niz.length; j++){
                niz[i][j] = k++;

                System.out.print(niz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Parni clanovi matrice su: ");
        for(int i=0; i<niz.length; i++){
            for(int j=0; j<niz.length; j++){
                if(niz[i][j]%2==0){
                    System.out.println(niz[i][j]+ " ");
                }
            }
        }
        }
     */

    //primer 7
    /*
    public static void main(String[] args){
        int novn[][][]= new int[3][4][5];

        for(int i=0; i<novn.length; i++){
            for (int j=0; j< novn.length; j++){
                for(int k=0; k< novn.length; k++) {
                    novn[i][j][k] = i * j * k;

                    System.out.print(novn[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
     */

    //primer 8 STRING
    /*
    public static void main(String[] args){
        String prvistring = "Ovo ";
        String drugistring = "je zadatak ";
        String trecistring = "sa stringovima";

        System.out.print(prvistring+drugistring+trecistring);
    }
     */

    //primer 9
    /*
    public static void main(String[] args){
        String tekst = "Casovi programiranja";

        for(int i=19; i>-1; i--) {
            System.out.print(tekst.charAt(i));
        }
    }
     */
    }
