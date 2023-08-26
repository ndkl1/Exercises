import java.util.Optional;

public class v1 {
    public static void main(String[] args){
        //1. zad.
        /*
        int s=0;
        float prosek;
        for(int i=1; i<=30; i++){
            System.out.println("Broj " + i);
            System.out.println("Kvadrat je " + (i*i));
            s=s+i;
            System.out.println("Zbir je " + s);
        }
        prosek=s/30;
        System.out.println("Prosek je " + prosek);
    }
         */

        //2. zad.
        /*
        int i, slbr;

        System.out.print("broj: ");
        for(i=1;i<=7; i++) {
            slbr = 1 + (int) (Math.random() * 39);
            System.out.print(slbr+", ");
        }
         */

        //3. zad.
        /*
        int slbr=1+(int)(Math.random()*100);

        if(slbr%2==0){
            System.out.println("Broj je " + slbr);
            System.out.println("Poslednja cifra broja je: " + slbr%10);
        }
        else{
            for(int i=slbr; i>=1; i--){
                System.out.print(i+", ");
            }
        }
         */

        //4. zad.
        /*
        int a= 101 + (int)(Math.random()*50);
        int b= 101 + (int)(Math.random()*50);
        System.out.println("A je " + a + ", a B je " + b);

        if(a>b){
            System.out.println("A je veci od B");
        }
        else if(a<b){
            System.out.println("B je veci od A");
        }
        else{
            System.out.println("A i B su jednaki");
        }
         */

        //5. zad.
        /*
        int br=1+(int)(Math.random()*100);

        if(br%3==0){
            System.out.println("Ovaj broj je deljiv sa 3 i koren je " + Math.sqrt(br));
        }
        else{
            System.out.println("Nije deljiv sa 3 i iznosi " + br);
        }
         */

        //6. zad.
        /*
        int suma=0, pr=1;
        for(int i=1; i<=20; i++){
                if (i%2==0) {
                    suma+=i;

                } else {
                    pr*=i;
                }}
        System.out.println("Zbir parnih brojeva je " + suma + " a, proizvod neparnih je " + pr);
         */

        //zad2 opet
        /*
        for(int i=0; i<7; i++){
            int broj = 1 + (int) (Math.random()*39);
            System.out.println("brojevi su:" + broj);
        }

         */

        //zad3 opet
        /*
        int broj = 1+(int)(Math.random()*100);
        System.out.println("Broj je " + broj);

        if(broj%2==0){
            System.out.printf("Brojj " + broj%10);
        }
        else{
            for(int i=broj; i>0; i--){
                System.out.println("Unazad " + i);
            }
        }
         */
    }}
