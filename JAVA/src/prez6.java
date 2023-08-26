import java.util.Scanner;

public class prez6 {

    //primer 1 - izjednacavanje Stringova
    /*
    public static void main(String[] args){
        String string1="Ovo je ";
        String string2="primer";
        String string3="Ovo je primer";

        string1 = string1 + string2;

        System.out.println("Test 1");
        System.out.println("String3 je sada " + string3);
        System.out.println("String1 je sada " + string1);

        if(string1==string3) {
            System.out.println("Ovo je true pa su string1 i string3 isti stringovi");
        }
            else{
                System.out.println("Ovo je false pa string1 i string3 nisu isti stringovi");
        }

        string1 = string3;

        System.out.println("Test 2");
        System.out.println("String3 je sada " + string3);
        System.out.println("String1 je sada " + string1);

        if(string1==string3) {
            System.out.println("Ovo je true pa su string1 i string3 isti stringovi");
        }
            else{
                System.out.println("Ovo je false pa string1 i string3 nisu isti stringovi");
            }
    }
     */

    //primer 2 - biranje random slova iz stringa
    /*
    public static void main(String[] args){
        String slova = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int slznak = (int)(Math.random()*26);

        String s = slova.substring(slznak, slznak+1);
        System.out.println("Slucajno izabrano slovo je " + s);
     */

    //primer 3
    /*
    public static void main(String[] args){
        Scanner unos = new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String ime = unos.nextLine();

        System.out.print("Unesite vase godine: ");
        int godine = unos.nextInt();

        System.out.println("Vase ime je " + ime + ", a prosle godine ste imali " + (godine-1));
}
     */

    //primer 4 - sa binkoef
    /*
    public static void main(String[] args){
        Scanner formula = new Scanner(System.in);

        System.out.print("Unesi vrednost n: ");
        int n = formula.nextInt();

        System.out.print("Unesi vrednost k: ");
        int k = formula.nextInt();

        int binkoef=1;
        for(int i=1; i<=k; i++){
            binkoef=binkoef*(n-i+1)/i;
        }

        System.out.println("Resenje je " + binkoef);
    }
     */

    //primer 5 - moduo 10 za x i y
    /*
    public static void main(String[] args){
        Scanner unos = new Scanner(System.in);

        System.out.print("X je: ");
        float x = unos.nextFloat();

        System.out.print("Y je: ");
        float y = unos.nextFloat();

        System.out.printf("%.0f", x%10);
        System.out.println(" ");
        System.out.printf("%.0f", y%10);
    }
     */

    //primer 6
}
