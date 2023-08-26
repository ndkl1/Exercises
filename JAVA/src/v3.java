import java.util.Locale;

public class v3 {
    public static void main(String[] args){
        //zad 1
        /*
        String pr="Ovo je primer stringa za Objektno orijentisano programiranje";

        System.out.println("Duzina stringa je " + pr.length());
        System.out.println(pr.toUpperCase());
        System.out.println(pr.toLowerCase());
        System.out.println(pr);

         */

        //zad 2
        /*
        String pr="Ovo je primer stringa za Objektno orijentisano programiranje";

        int i, n;
        n=pr.length();

        for(i=1; i<=n; i+=2){
            System.out.print(pr.charAt(i));
        }
         */

        //zad 3
        /*
        String pr="Ovo je primer stringa za Objektno orijentisano programiranje";

        System.out.println(pr.indexOf('o'));
        System.out.println(pr.lastIndexOf('o'));
        System.out.println(pr.indexOf('O'));
        System.out.println(pr.lastIndexOf('O'));
        System.out.println(pr.indexOf('s'));
        System.out.println(pr.lastIndexOf('s'));
        System.out.println(pr.indexOf('p'));
        System.out.println(pr.lastIndexOf('p'));
         */

        //zad 4
        /*
        String pr="Ovo je primer stringa za Objektno orijentisano programiranje";

        System.out.println(pr.substring(7, 18));

        int i1=pr.indexOf('p');
        int i2=pr.lastIndexOf('p');
        System.out.println(pr.substring(i1, i2+1));
         */

        //zad 5
        /*
        String pr="Ovo je primer stringa za Objektno orijentisano programiranje";

        System.out.println("Pozicija reci string " + pr.indexOf("string"));
        System.out.println("Pozicija reci program " + pr.lastIndexOf("program"));

         */

        //zad 6
        /*
        String pr ="Ovo je primer stringa za Objektno orijentisano programiranje";

        System.out.println(pr.replace("O", "A"));
        System.out.println(pr.replace("o", "a"));

        //sve ujedno
        pr = pr.replace('O', 'A');
        pr = pr.replace('o', 'a');
        System.out.println("Novi string je: " + pr);

         */

        //zad 7 !!
        /*
        String[] niz = {"Stata", "Matematika", "Sociologija", "Racunovodstvo",
        "Makroekonomija", "Osnovi ekonomije"};

        int i, a;
        int n=niz.length;

        for(i=1; i<=20; i++) {
            a = (int) (Math.random() * n);
            System.out.println("Omiljeni predmet je " + niz[a]);

            if (niz[a].equals("Matematika")) break;
        }

         */
    }}
