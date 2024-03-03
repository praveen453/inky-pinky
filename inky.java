/*Inside the class Inky, Create an object called Ponkey.
Create a local variable inside the main method Pinkey and its value is "donkey".
Print variable Pinky inside the constructor.
Create an Other variable Inside the main method as blinky. It's value is "Pinkey".
There is another variable inside the main method rinkey. It's value is "monkey".
Pass all 3 variables to another constructor and Create below statements.
1) Pinky donkey
2) donkey, monkey Monkey
3) pinky, donkey, Monkey */


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
