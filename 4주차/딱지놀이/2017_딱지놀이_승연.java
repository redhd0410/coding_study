import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] answer = new char[N];
        Arrays.fill(answer,'F');
        int i = 0;
        while(i<N){
            int a = sc.nextInt();
            Integer[] A = new Integer[a];
            for(int j=0;j<a;j++){
                A[j] = sc.nextInt();
            }
            int b = sc.nextInt();
            Integer[] B = new Integer[b];
            for(int j=0;j<b;j++){
                B[j] = sc.nextInt();
            }
            Arrays.sort(A,Collections.reverseOrder());
            Arrays.sort(B,Collections.reverseOrder());
            if(a>b){
                
                for(int j = 0;j<b;j++){
                    if(A[j]>B[j]){
                        answer[i] = 'A';
                        break;
                    }else if(A[j]<B[j]){
                        answer[i] = 'B';
                        break;
                    }
                }
                if(answer[i]=='F'){
                    answer[i] = 'A';
                }
            }else if(a<b){
                for(int j=0;j<a;j++){
                    if(A[j]>B[j]){
                        answer[i] = 'A';
                        break;
                    }else if(A[j]<B[j]){
                        answer[i] = 'B';
                        break;
                    }
                }
                if(answer[i]=='F'){
                    answer[i] = 'B';
                }
            }else{
                for(int j=0;j<a;j++){
                    if(A[j]>B[j]){
                        answer[i] ='A';
                        break;
                    }else if(A[j]<B[j]){
                        answer[i] = 'B';
                        break;
                    }
                }
                if(answer[i]=='F'){
                    answer[i]='D';
                }
            }
            i++;
        }
        for(i=0;i<N;i++){
            System.out.println(answer[i]);
        }
    }
}
