import java.util.*;
class Main{
    static int[] answer;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        answer = new int[N];
        for(int i=0;i<N;i++){
            String str = sc.next();
            function(str, i);
        }
        for(int i=0;i<N;i++){
            System.out.println(answer[i]);
        }
    }
    public static void function(String s,int index){
        int left = 0;
        int right = s.length()-1;
        int count =0;
        while(left<=right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else{
                int l = left;
                int r = right;
                l++;
                while(l<r){
                    if(s.charAt(l)!=s.charAt(r)){
                        count++;
                        break;
                    }
                    l++;
                    r--;
                }
                l = left;
                r = right;
                r--;
                while(l<r){
                    if(s.charAt(l)!=s.charAt(r)){
                        count++;
                        break;
                    }
                    l++;
                    r--;
                }
                if(count>=1) break;
            }
        }
        if(count==0) answer[index] = 0;
        else if(count==1) answer[index] = 1;
        else answer[index] = 2;
    }
}
