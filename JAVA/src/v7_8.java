public class v7_8 {
    //VEZBE 7
    //1. zad
//RAZLIKA IZMEDJU VOID I RETURN METODE!!

    //VOID metoda
    /*
    public static void faktorijel(int br){
        int i;
        int f=1;
        for (i=1; i<=br; i++){
            f*=br;
        }
        System.out.println(f);
    }
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Broj: ");
        int br = ulaz.nextInt();

        faktorijel(br);
    }

     */

    //RETURN metoda
    /*
    public static int fakt(int br){
        int i;
        int f=1;
        for (i=1; i<=br; i++){
            f*=br;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Broj: ");
        int br = ulaz.nextInt();

        System.out.println(fakt(br));
    }

     */

    //2. zad !!!!!!!
    /*
    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);
        System.out.println("Broj: ");
        int br = unos.nextInt();

        System.out.println(metoda(br));
    }

    public static int metoda(int br){

        int z=0;
        while (br!=0){
            z+=br%10;
            // 3200%10=0
            // 320%10=0
            // 32%10=2
            // 3%10=5
            System.out.println("Dodavanje za z "+z);
            br=br/10;
            // 3200/10=320
            // 320/10=32
            // 32/10=3
            // 3/10=0
            System.out.println("Deljenje br "+br);
        }
        return z;
    }

     */

    //3. zad
    /*
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unos: ");
        int br= unos.nextInt();

        System.out.println(metod(br));
    }

    public static int metod(int br){
        int n=0;
        while (br!=0){
            br=br/10;
            n++;
        }
        return n;
    }

     */

    //4. zad
    /*
    public class tacka {
        double x;
        double y;
        double z;

        tacka() {
            x = 1;
            y = 1;
            z = 1;
        }

        tacka(double xv, double yv, double zv) {
            x=xv;
            y=yv;
            z=zv;
        }
        */

    //5. zad
    /*
    public static void main(String[] args) {
        Tacka t = new Tacka();
        System.out.println("Rastojanje je " + t.rastojanje());
    }
    public class Tacka {
        double x;
        double y;
        double z;

        double rastojanje() {
            double r = Math.sqrt(x * x + y * y + z * z);
            return r;
        }

    }

     */

    //VEZBE 8
    // zad 1
    /*
    public static void main(String[] args) {
        Scanner unos=new Scanner(System.in);
        System.out.println("Prvi broj: ");
        int br1=unos.nextInt();
        System.out.println("Drugi broj: ");
        int br2=unos.nextInt();

        metoda(br1, br2);
    }

    public static void metoda(int x, int y){
        x=x+1;
        y=y+1;
        System.out.println("X uvecan za 1: "+x+", a Y uvecan za 1: "+y);
    }

     */

    // zad 2 !!!!! POGLEDAJ OPET
    /*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Donja granica: ");
        int dg = in.nextInt();
        System.out.println("Gornja granica: ");
        int gg = in.nextInt();

        for (int i = dg; i <= gg; i++) {
            if (provera(i)) System.out.print(i+", "); ;
        }
    }

    public static boolean provera(int x) {
        int i;
        double k = Math.sqrt(x);

        if (x == 2) return true;
        if (x % 2 == 0 || x == 1) return false;

        for (i = 3; i <= k; i += 2)
            if (x % i == 0) return false;
            return true;
    }

     */

    // zad 3
    /*
    public static void main(String[] args) {
        Proizvod p = new Proizvod("jabuka", 150);
        Proizvod p1 = new Proizvod("kruska", 200);

        p.RazmeniC(p1);

        System.out.println(p1.naziv+" "+p1.cena);
    }
    static class Proizvod {
        String naziv;
        double cena;

        Proizvod(String n, int c){
            naziv=n;
            cena=c;
        }

        public void RazmeniC(Proizvod p){
            cena=cena + p.cena;
            p.cena = cena - p.cena;
            cena = cena - p.cena;
        }
    }
     */

    // zad 4

    //zad 5
    /*
    public static void main(String[] args) {

        double niz[] = {1.3,17.5,24,23.67,81.5,91.53,2.34,1.12,3.06};
        int i;
        int n=niz.length;
        for (i=0; i<n;i++){
            System.out.print(uvecajPdv(niz[i])+" ");
        }
    }

    public static double uvecajPdv(double i){
        return i=i+(i*0.2);
    }

     */
}
