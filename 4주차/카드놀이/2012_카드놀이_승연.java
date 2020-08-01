import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int sum_A = 0;
        int sum_B = 0;
        for(int i=0;i<10;i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            B[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(A[i]>B[i]){
                sum_A +=3;
            }else if(A[i]<B[i]){
                sum_B +=3;
            }else{
                sum_A +=1;
                sum_B +=1;
            }
        }
        System.out.println(sum_A+" "+sum_B);
        if(sum_A>sum_B){
            System.out.println("A");
        }else if(sum_A<sum_B){
            System.out.println("B");
        }else{
            int i=0;
            for(i=9;i>=0;i--){
                if(A[i]>B[i]){
                    System.out.println("A");
                    return;
                }else if(A[i]<B[i]){
                    System.out.println("B");
                    return;
                }
            }
            if(i<=0){
                System.out.println("D");
            }
        }
    }
}
