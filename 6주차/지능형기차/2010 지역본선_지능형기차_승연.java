import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max =0;
        int count =0;
        for(int i=0;i<4;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            count-=a;
            count+=b;
            max = Math.max(max,count);
        }
        System.out.println(max);
    }
}
