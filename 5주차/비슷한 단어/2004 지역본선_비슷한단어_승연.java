import java.util.*;
class Main{
    static int[] visited; 
    static int len;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String first = sc.next();
        int len = first.length();
        String[] str = new String[N-1];
        visited = new int[len];
        for(int i=0;i<N-1;i++){
            str[i] = sc.next();
        }
        int count = 0;
        int answer = 0;
        for(int i=0;i<N-1;i++){
            String s = str[i];
            count=0;
            if(s.length()>len+1){
                continue;
            }
            if(s.length()<len-1){
                continue;
            }
            int tmp=0;
            for(int h=0;h<len;h++){
                visited[h] =0;
            }
            for(int j=0;j<s.length();j++){
                boolean flag = false;
                for(int k=0;k<len;k++){
                    if(s.charAt(j)==first.charAt(k)){
                        if(visited[k]!=1){
                            visited[k]=1;
                            flag = true;
                            break;
                        }
                    }
                }
                if(flag){//방문한수개수
                    tmp++;
                }
                if(!flag){//한번도 방문 못함
                    count++;
                }
                
            }
            if(count<=1&&tmp>=len-1){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
