import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int answer = 10;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)!=str.charAt(i)){
                answer+=10;
            }
            else{
                answer+=5;
            }
        }
        System.out.println(answer);
    }
}
