import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();//학생수
        int K = sc.nextInt();//가로줄수
        char[] first = new char[N];
        char[] finish = new char[N];
        for(int i=0;i<N;i++){
            first[i] = (char)('A'+i);
        }
        String f = sc.next();
        for(int i=0;i<N;i++){
            finish[i] = f.charAt(i);   
        }
        int mid =0;
        String[] lines = new String[K];
        for(int i=0;i<K;i++){
            lines[i] = sc.next();
            if(lines[i].charAt(0)=='?'){
                mid = i;
            }
        }
        for(int i=0;i<mid;i++){
            for(int j=0;j<lines[i].length();j++){
                if(lines[i].charAt(j)=='-'){
                    char tmp = first[j];
                    first[j] = first[j+1];
                    first[j+1] = tmp;
                }
            }
        }//forward
        for(int i=K-1;i>mid;i--){
            for(int j=0;j<lines[i].length();j++){
                if(lines[i].charAt(j)=='-'){
                    char tmp = finish[j];
                    finish[j] = finish[j+1];
                    finish[j+1] = tmp;
                }
            }
        }//backward
        String ans ="";
        for(int i=0;i<N-1;i++){
            if(first[i]!=finish[i]){
                ans +="-";
                if(i+2<N){
                    ans+="*";//이미 서로 자리를 바꿨으므로 
                    i++;
                }
            }else{
                ans +="*";
            }
        }
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)=='-'){
                char tmp = first[i];
                first[i] = first[i+1];
                first[i+1] = tmp;
            }
        }//check
        for(int i=0;i<N;i++){
            if(first[i]!=finish[i]){
                ans="";
                for(int j=0;j<N-1;j++){
                    ans +="x";
                }
                break;
            }
        }
        System.out.println(ans);
    }
}
