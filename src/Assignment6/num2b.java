package Assignment6;

public class num2b {
    public static void main(String[] args){
        int sum=0;
        int pro =1;
       /* int num =5;
        while(num<=50){
            sum+=num;
            num+=5;
            pro*=num;
        }
        System.out.println(sum);
        System.out.println(pro);
        */
        for(int i=5;i<=50;i+=5){
            sum+=i;
            pro*=sum;

        }
        System.out.println(sum);
        System.out.println(pro);
    }
}
