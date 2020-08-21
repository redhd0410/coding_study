import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        char[] answer = new char[3];
        for(int i=0;i<3;i++){
            a=0;
            b=0;
            for(int j=0;j<4;j++){
                int num = sc.nextInt();
                if(num==0){
                    a++;
                }else{
                    b++;
                }
            }
            if(a==1){
                answer[i]='A';
            }else if(a==2){
                answer[i]='B';
            }else if(a==3){
                answer[i]='C';
            }else if(a==4){
                answer[i]='D';
            }else{
                answer[i]='E';
            }
        }
        for(int i=0;i<3;i++){
            System.out.println(answer[i]);
        }
    }
}
