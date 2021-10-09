package Assignment6;
//print the row 10 and columen 10
public class nastedloops {
    public static void main(String[] args){
       loop();
    }
    public static void loop(){
         int pro=0;
        for(int r=1;r<11;r++){
            for(int c=1;c<11;c++){
                 pro =r*c;
                System.out.print(pro + "    ");

            }
            System.out.println(" ");
        }
    }
}
