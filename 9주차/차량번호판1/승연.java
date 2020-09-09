import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.length()>4) return;
        int ch =26;
        int num = 10;
        int count =1;
        int tmp_um =0;
        int tmp_ch =0;
        if(str.charAt(0)=='c'){
            count*=ch;
            ch--;
        }else{
            count*=num;
            num--;
        }
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)=='c'){
                if(str.charAt(i-1)!='c'){
                    ch=26;
                    count*=ch;
                }else{
                    ch=25;
                    count*=ch;
                }
            }
            if(str.charAt(i)=='d'){
                if(str.charAt(i-1)!='d'){
                    num=10;
                    count*=num;
                }else{
                    num=9;
                    count*=num;
                }
            }
        }
        System.out.println(count);
    }
}
