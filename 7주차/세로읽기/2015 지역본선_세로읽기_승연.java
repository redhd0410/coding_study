import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        String str4 = sc.next();
        String str5 = sc.next();
        String answer ="";
        for(int i=0;i<15;i++){
            if(str1.length()>i){
                answer+=str1.charAt(i);
            }
            if(str2.length()>i){
                answer+=str2.charAt(i);
            }
            if(str3.length()>i){
                answer+=str3.charAt(i);
            }
            if(str4.length()>i){
                answer+=str4.charAt(i);
            }
            if(str5.length()>i){
                answer+=str5.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
