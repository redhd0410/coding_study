import java.util.*;
class Main{
   static class Dot{
       int x;
       int y;
       Dot(int x,int y){
           this.x = x;
           this.y = y;
       }
   } 
   static int[] visited = new int[14];
   static int N;
   static int M;
   static int ans = Integer.MAX_VALUE;
   static ArrayList<Dot> home = new ArrayList<>();
   static ArrayList<Dot> chicken = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[][] arr = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int num = sc.nextInt();
                arr[i][j]=num;
                if(num==1){
                    home.add(new Dot(i,j));
                }else if(num==2){
                    chicken.add(new Dot(i,j));
                }
            }
        }
        fun(0,0);
        System.out.println(ans);
    }
    public static void fun(int index,int count){
        if(index>chicken.size()) return;
        if(count==M){
            int tmp =0;
            for(int i=0;i<home.size();i++){
                int dist = Integer.MAX_VALUE;
                for(int j=0;j<chicken.size();j++){
                    if(visited[j]==1){
                        dist = Math.min(dist,Math.abs(home.get(i).x-chicken.get(j).x)+Math.abs(home.get(i).y-chicken.get(j).y));
                    }
                }
                tmp+=dist;
            }
            ans = Math.min(tmp,ans);
            return;
        }
        visited[index]=1;
        fun(index+1,count+1);
        visited[index]=0;
        fun(index+1,count);
    }
}
