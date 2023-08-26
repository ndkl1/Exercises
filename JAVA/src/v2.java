public class v2 {
    public static void main(String[] args){
        //zad 1
        /*
        int a;
        float b=0;
        a=1+(int)(Math.random()*70);
        System.out.println("Random broj je " + a);

        for(int i=1; i<=a; i++){
            b=b+(float)1/i;
        }
        System.out.println("Za a " + a + " zbir je " +b);

         */

        //zad 2 WHILE PETLJA
        /*
        int a;
        a = 21 + (int)(Math.random()*80);
        System.out.println("Random broj je " + a);

        while (a>=1){
            System.out.println(a);
            a--;
        }
         */

        //zad 3
        /*
        for(int i=0; i<100; i++) {
            if(i%2!=0){
            System.out.println("Broj je " + i + ", koreni " + Math.sqrt(i) + ", zaokruzeni koreni su " + (Math.round(Math.sqrt(i))));
        }}
         */

        //zad 4
        /*
        int s=0;
        for(int i=2; i<=20; i+=2){
            s=s+(i*i);
            System.out.println("Broj je " + i + " a, zbir kvadrata je " + s);
        }
         */

        //zad 5
        /*
        int a=50+(int)(Math.random()*51);
        System.out.println("Random broj je " + a);

        for(int i=a; i>=1; i--){
            if(i%5!=0){
                //moglo je da se napise i if(i%5==0) continue;
                System.out.println("broj je " + i);
            }}
         */

        //zad 6 faktorijel n!
        /*
        int s=1;
        int a = 1 + (int)(Math.random()*10);
        System.out.println("Random broj je " + a);

        if(a%2==0){
            System.out.println("Kub je " + (a*a*a));
        }
        else{
            for (int i=1; i<=a; i++){
                s =s*i;
            }
            System.out.println("Faktorijel je " + s);
        }

         */

}}
