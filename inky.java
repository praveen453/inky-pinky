public class inky {

    public inky(String pinkey){
        System.out.println(pinkey);
    }
    public inky(String X,String Y,String V) {
        System.out.println(Y +" " + X);
        System.out.println(X +" " + V);
        System.out.println(Y +" " + X +" " + V);
    }
    public static void main(String args[]){
        String pinkey="donkey";

        inky ponkey= new inky(pinkey);
        String blinky="pinkey";
        String rinky="monkey";
        inky ponkey1=new inky(pinkey,blinky,rinky);
    }
}
