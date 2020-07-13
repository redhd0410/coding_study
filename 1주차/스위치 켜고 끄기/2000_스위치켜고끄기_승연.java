import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        for(int i =1;i<N+1;i++){
            arr[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        for(int i=0;i<K;i++){
            int sex = sc.nextInt();
            int num = sc.nextInt();
            if(sex == 1){
                for(int j=1;j<N+1;j++){
                    if(j%num==0){
                        if(arr[j]==1){
                            arr[j]=0;
                        }else{
                            arr[j]=1;
                        }
                    }
                }
            }else{
            	if(num==0||num==N) {
            		if(arr[num]==1) arr[num]=0;
                    else arr[num]=1;
            		continue;
            	}
                if(arr[num]==1) arr[num]=0;
                else arr[num]=1;
                int left = num-1;
                int right = num+1;
                while(left>=1&&right<=N){
                    if(arr[left]==arr[right]){
                        if(arr[left]==0){
                            arr[left]=1;
                            arr[right]=1;
                        }else{
                            arr[left]=0;
                            arr[right]=0;
                        }
                    }else{
                        break;
                    }
                    left--;
                    right++;
                }
            }
        }
        for(int i=1;i<N+1;i++){
        	System.out.print(arr[i]+" ");
        	if(i%20==0) System.out.println("");
        }
    }
}