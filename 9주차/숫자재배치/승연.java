import java.util.*;
class Main{
    static int[] visited;
    static int N;
    static String strA;
    static String strB;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        strA = sc.next();
        strB = sc.next();
        N = strA.length();
        visited = new int[N];
        String ans = "";
        permutation(0,ans);
        if(max==Integer.MIN_VALUE){
          System.out.println("-1");
        }else{
          System.out.println(max);  
        }
        
    }
    public static void permutation(int count,String ans){
        if(count==N){
          if(ans.charAt(0)!='0'){
            int tmp = Integer.parseInt(ans);
            if(Integer.parseInt(strB)>=tmp){
                max = Math.max(max,tmp);
            }
          }
        }
        for(int i=0;i<N;i++){
            if(visited[i]==0){
                visited[i]=1;
                permutation(count+1,ans+strA.charAt(i));
                visited[i]=0;
            }
        }
    }
}
