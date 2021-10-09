package Assignment6;
//nestedLoopExercise

public class num3 {
    public static void main(String[] args){
        NastedLoop();
    }
    public static void NastedLoop(){

        for(int r=10;r<41;r+=10){
            for(int c=0;c<10;c++){
                System.out.print( r+c+ "\t ");

            }
            System.out.println(" ");
        }
    }
}
