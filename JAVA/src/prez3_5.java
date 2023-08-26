public class prez3_5 {
    public static void main(String[] args){
        int broj = 0;
        broj = 1 + (int)(100*Math.random());

        if(broj%2==0){
            System.out.println("Ovo je paran broj " + broj);
        }
        else{
            System.out.println("Ovo je neparan broj " + broj);
        }
    }
}
