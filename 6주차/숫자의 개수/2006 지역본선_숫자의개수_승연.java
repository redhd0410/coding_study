import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String num = Integer.toString(A*B*C);
        int[] arr = new int[11];
        for(int i=0;i<num.length();i++){
            arr[num.charAt(i)-'0']++;
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}
