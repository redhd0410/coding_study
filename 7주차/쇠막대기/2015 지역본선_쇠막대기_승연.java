import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Character>stack = new Stack<>();
        String str = sc.next();
        int answer =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                stack.add('(');
            }
            if(str.charAt(i)==')'){
                stack.pop();
                if(str.charAt(i-1)=='('){
                    answer+=stack.size();
                }
                else answer++;
                
            }
        }
        System.out.println(answer);
    }
}

