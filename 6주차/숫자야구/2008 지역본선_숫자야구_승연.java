import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] arr = new boolean[1001];
        int[] example = new int[N];
        int[] ball = new int[N];
        int[] strike = new int[N];
        int strike_cnt =0;
        int ball_cnt=0;
        Arrays.fill(arr,true);
        for(int i=0;i<N;i++){
            example[i] = sc.nextInt();
            strike[i] = sc.nextInt();
            ball[i] = sc.nextInt();
        }
        for(int i=111;i<999;i++){
            String str = Integer.toString(i);
            char[] ch = str.toCharArray();
            if(ch[1]=='0'||ch[2]=='0'||ch[0]==ch[1]||ch[0]==ch[2]||ch[1]==ch[2]){
                arr[i] = false;
            }
        }
        for(int i=0;i<N;i++){
            String str1 = Integer.toString(example[i]);
            for(int j=111;j<999;j++){
                if(arr[j]==true){
                    String str2 = Integer.toString(j);
                    strike_cnt=0;
                    ball_cnt=0;
                    for(int k=0;k<3;k++){
                        for(int q =0;q<3;q++){
                            if(str1.charAt(k)==str2.charAt(q)){
                                if(k==q){
                                    strike_cnt++;
                                }else{
                                    ball_cnt++;
                                }
                            }
                        }
                    }
                    if(strike_cnt!=strike[i]||ball_cnt!=ball[i]){
                        arr[j] = false;
                    }
                }
            }
        }
        int answer =0;
        for(int i=111;i<999;i++){
            if(arr[i]==true){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
