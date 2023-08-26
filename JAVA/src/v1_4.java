public class v1_4 {
    public static void main(String[] args) {
        //VEZBE 1
        //zad 1
        /*
        int z = 0;
        for (int i = 1; i < 31; i++) {
            z += i;
            System.out.println("Broj je " + i + ", njegov kvadrat je " + (i * i));
        }
        System.out.println("Zbir je " + z + ", a prosek " + (float)(z / 30));
    */
        //zad 2
        /*
        for(int i=0; i<7; i++) {
            int br = 1 + (int) (Math.random() * 39);
            System.out.println("Broj " + br);
        }
        */
        //zad 3
        /*
        int br=1+(int)(Math.random()*100);

        if(br%2==0){
            System.out.println("Broj " + br + " je paran : " + br%10);
        }
        else{
            System.out.println("Broj " + br + " je neparan.");
            for(int j=br; j>0; j--){
                System.out.println("Unazad brojevi " + j);
            }
        }

         */
        //zad 4
        /*
        int br1= 101+(int)(Math.random()*50);
        int br2= 101+(int)(Math.random()*50);

        if (br1>br2){
            System.out.println(br1 +" je vece od " + br2);
        }
        else if(br1<br2){
            System.out.println(br1 +" je manje od " + br2);
        }
        else{
            System.out.println("JEDNAKI SU");
        }
         */
        //zad 5
        /*
        int br = 1+(int)(Math.random()*100);

        if(br%3==0){
            System.out.println("Koren od "+br+" je "+Math.sqrt(br));
        }
        else{
            System.out.println(br);
        }

         */
        //zad 6
        /*
        int z=0;
        int p=1;
        for(int i=1; i<21; i++){
            if(i%2==0){
                z+=i;
            }
            else {
                p*=i;
            }
        }
        System.out.println("Zbir je "+z+", a prozivod "+p);
         */

        //VEZBE 2
        //zad 2
        /*
        float k=0;
        int n = 1+(int)(Math.random()*70);
        System.out.println("BROJ: "+n);

        for(int i=1; i<=n;i++){
            k=k+(float)1/i;
        }
        System.out.println(k);

         */
        //zad 3
        /*
        int br=21+(int)(Math.random()*80);

        while(br>0){
            System.out.println(br);
            br--;
        }

         */
        //zad 4
        /*
        for (int i=1; i<101; i++){
            if (i%2!=0){
                System.out.println(i+", koren ovog broja je "+ Math.sqrt(i)+", " +
                        "a zaokruzen koren "+Math.round(Math.sqrt(i)));
            }
        }

         */
        //zad 5
        /*
        int z=0;
        for (int i=1; i<21; i++){
            if (i%2==0){
                z+=(i*i);
            }
        }
        System.out.println(z);

         */
        //zad 6
        /*
        int br=50+(int)(Math.random()*51);

        for (int i=br; i>0; i--){
            if (i%5==0) continue;
            System.out.println(i);
        }

         */
        //zad 7
        /*
        int p=1;
        int br=1+(int)(Math.random()*10);
        System.out.println(br);

        if (br%2==0){
            System.out.println("Kub je "+ (br*br*br));
        }
        else{
            for (int i=1; i<=br; i++){
                p*=i;
            }
            System.out.println(p);
        }

         */

        //VEZBE 3
        //zad 1
        /*
        String s ="Ovo je primer stringa za Objektno orijentisano programiranje";

        System.out.println("Duzina: "+s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s);

         */
        //zad 2
        /*
        String s="Ovo je primer stringa za Objektno orijentisano programiranje";

        for (int i=1; i<s.length(); i+=2){
            System.out.println(s.charAt(i));
        }

         */
        //zad 3
        /*
        String s = "Ovo je primer stringa za Objektno orijentisano programiranje";

        System.out.println(s.indexOf('o')+" "+ s.lastIndexOf('o'));
        System.out.println(s.indexOf('O')+" "+s.lastIndexOf('O'));
        System.out.println(s.indexOf('s')+" "+s.lastIndexOf('s'));
        System.out.println(s.indexOf('p')+" "+s.lastIndexOf('p'));

         */
        //zad 4
        /*
        String s = "Ovo je primer stringa za Objektno orijentisano programiranje";

        int p1=s.indexOf('p');
        int p2=s.lastIndexOf('p');

        System.out.println(s.substring(7,18));
        System.out.println(s.substring(p1, p2+1));

         */
        //zad 5
        /*
        String s = "Ovo je primer stringa za Objektno orijentisano programiranje";

        System.out.println(s.indexOf("string"));
        System.out.println(s.lastIndexOf("program"));
         */
        //zad 6
        /*
        String s = "Ovo je primer stringa za Objektno orijentisano programiranje";
        s=s.replace('O','A');
        s=s.replace('o','a');
        System.out.println(s);
         */
        //zad 7 !!!!!!
        /*
        String[] s={"Mata", "Stata", "OE", "Soc", "EKP", "Racunovodstvo"};

        int k, n=s.length;
        for (int i=0; i<20; i++) {
            k = (int)(Math.random()*n);
            System.out.println(s[k]);
            if (k==0) break;
        }

         */

        //VEZBE 4
        //zad 1
        /*
        int z=0;
        int[] br=new int[10];

        for (int i=0; i<10; i++){
        br[i]= 1+(int)(Math.random()*100);
        z+=br[i];
        System.out.println(br[i]);
        }
        System.out.println(z);

         */
        //zad 2 !!!!!!!
        /*
        int i;
        int[] niz=new int[10];

        for (i=0;i<10;i++){
            niz[i]=1+(int)(Math.random()*100);
            System.out.print(niz[i]+" ");
        }
        int min=niz[0];
        int max=niz[0];

        for (i=1;i<10;i++){
            if (niz[i]<min) min=niz[i];
            if (niz[i]>max) max=niz[i];
        }
        System.out.println();
        System.out.println(min+" "+max);

         */
        //zad 3
        /*
        int m[][]=new int[5][5];

        for (int i=0; i<m.length; i++){
            for (int j=0; j<m.length; j++){
                m[i][j]=i*j;
                System.out.print(m[i][j]);
            }
            System.out.println();
        }

         */
        //zad 4
        /*
        int m[][]=new int[10][10];

        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                if (m[i]==m[j]) System.out.print("*");
                else System.out.print("-");
            }
            System.out.println();
        }

         */
        //zad 5
        /*
        int m[][] = new int[5][5];
        double[] niz={0,0,0,0,0};
        int i, j, z = 0;

        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m.length; j++) {
                m[i][j] = 1 + (int) (Math.random() * 15);
                System.out.print(m[i][j] + " ");

                niz[i]+=m[i][j];
            }
            System.out.println();
            niz[i]=niz[i]/5;
        }
        for (i=0; i<5;i++){
            System.out.println(i+" je "+ niz[i]);
        }

         */
        //zad 6
        /*
        String[] niz={"Mata","Soc","OE","Racunovodstvo","Stata","EKP"};

        int z=0;
        for (int i=0;i<20; i++){
            int br = (int)(Math.random()*6);
            System.out.println("Predmet: "+niz[br]);
            if (br==0){
                z++;
            }
        }
        System.out.println("Mata se pojavljuje: "+z);

         */

        int Alen=A.length;
        int Blen=B.length;

        int C[]=new int[Alen+Blen];
        System.arraycopy(A, 0, C, 0, Alen);
        System.arraycopy(B, 0, C, Alen, Blen);

        System.out.println(C);
    }
}
