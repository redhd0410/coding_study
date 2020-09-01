import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.length()<=1){
            System.out.println("true");
            return;
        }
        int count =0;
        int left =0;
        int right = str.length()-1;
        boolean flag = false;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                left++;
                count++;
            }else{
                left++;
                right--;
            }
            if(count>1){
                System.out.println("false");
                return;
            }
            
        }
        count=0;
        left = 0;
        right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                right--;
                count++;
            }else{
                 left++;
                right--;   
            }
            if(count>1){
                System.out.println("false");
                return;
            }
            
        }
        System.out.println("true");
    }
}
