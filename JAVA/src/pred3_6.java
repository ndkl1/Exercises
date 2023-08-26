public class pred3_6 {
    public static void main(String[] args){
        int broj;

        for(broj=1; broj<20; broj++){
            if(broj%2!=0){
                System.out.println("Broj je " + broj);
            }
            else{
                broj=broj*2;
                System.out.println("Broj je " + broj);
                broj=broj/2;
            }
        }
    }
}
