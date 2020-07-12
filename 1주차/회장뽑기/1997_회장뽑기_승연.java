/*플로이드 와샬*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] dist = new int[N+1][N+1];
        int[] visited = new int[N+1];
        int cnt = 0;
        for(int i=1;i<N+1;i++) {
        	for(int j=1;j<N+1;j++) {
        		dist[i][j]=123456789;
        	}
        }
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a==-1&&b==-1){
                break;
            }
            dist[b][a]=1;
            dist[a][b]=1;
            
        }
        for(int k=1;k<N+1;k++){
            dist[k][k]=1;
            for(int i=1;i<N+1;i++){
                for(int j=1;j<N+1;j++){
                    if(dist[i][j]>dist[i][k]+dist[k][j]){
                        dist[i][j]=dist[i][k]+dist[k][j];
                    }
                }
            }
        }
       
        int min = Integer.MAX_VALUE;
        int[] max = new int[N+1];
        for(int i=1;i<N+1;i++) {
        	for(int j=1;j<N+1;j++) {
        		max[i]  = Math.max(max[i],dist[i][j]);
        	}
        	
        	min = Math.min(max[i],min);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<N+1;i++) {
        	if(min == max[i]) {
        			list.add(i);
        	}
        }
        System.out.println(min+" "+list.size());
        for(int i=0;i<list.size();i++) {
        	System.out.print(list.get(i)+" ");
        }
    }
}
