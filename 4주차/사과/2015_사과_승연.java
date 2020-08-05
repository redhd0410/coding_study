import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i=0;i<N;i++){
            int student = sc.nextInt();
            int apple = sc.nextInt();
            count+=apple%student;
        }
        System.out.println(count);
    }
}
