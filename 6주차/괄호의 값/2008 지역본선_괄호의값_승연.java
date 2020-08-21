import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 1;
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                sum *=2;
                stack.add('(');
                if(str.charAt(i+1)==')'&&i+1<str.length()){
                    answer+=sum;
                }
            }else if(str.charAt(i)=='['){
                sum *=3;
                stack.add('[');
                if(str.charAt(i+1)==']'&&i+1<str.length()){
                    answer+=sum;
                }
            }else if(str.charAt(i)==')'){
                if(stack.peek()=='('&&!stack.isEmpty()){
                    stack.pop();
                    sum = sum/2;
                    
                }
            }else{
                if(stack.peek()=='['&&!stack.isEmpty()){
                    stack.pop();
                    sum = sum/3;
                }
            }
        }
        if(!stack.isEmpty()){
            System.out.println("0");
            return;
        }
        System.out.println(answer);
    }
}
