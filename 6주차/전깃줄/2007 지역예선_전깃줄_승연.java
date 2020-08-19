import java.util.*;
class Main{
    static class Point implements Comparable<Point>{
        int first;
        int second;
        Point(int first,int second){
            this.first = first;
            this.second = second;
        }
        
        public int compareTo(Point p){
            if(this.first<p.first){
                return -1;
            }else{
                return 1;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Point> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            int f = sc.nextInt();
            int s = sc.nextInt();
            list.add(new Point(f,s));
        }
        Collections.sort(list);
        int[] dp = new int[N+1];
        Arrays.fill(dp,1);
        for(int i=1;i<N;i++){
            for(int j=0;j<i;j++){
                if(dp[i]<dp[j]+1&&list.get(i).second>list.get(j).second){
                    dp[i] = dp[j]+1;
                }
            }
        }
        int max = 0;
        for(int i=0;i<N;i++){
            max = Math.max(max,dp[i]);
        }
        System.out.println(N-max);
    }
}
