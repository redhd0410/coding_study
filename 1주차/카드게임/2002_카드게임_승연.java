import java.util.*;
class Main{
    static class Card implements Comparable<Card>{
        String color;
        int num;
        Card(String color, int num){
            this.color = color;
            this.num = num;
        }
        
        public int compareTo(Card o){
            return this.num -o.num;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int Max = Integer.MIN_VALUE;
        int count = Integer.MIN_VALUE;
        ArrayList<Card> card = new ArrayList<>();
        ArrayList<String> color = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();
        for(int i=0;i<5;i++){
            String c = sc.next();
            int n = sc.nextInt();
            card.add(new Card(c,n));
            v[n]+=1;
        }
        Collections.sort(card);
        for(int i=0;i<5;i++){
            if(!number.contains(card.get(i).num)){
                number.add(card.get(i).num);
            }
            if(!color.contains(card.get(i).color)){
                color.add(card.get(i).color);
            }
            Max = Math.max(Max,card.get(i).num);
        }
        
        int N;
        if(number.size()==5){
            N = Math.abs(number.get(0)-number.get(4));
            if(N==4&&color.size()==1){
                count = Math.max(count, Max+900);
            }else if(N==4){
                count = Math.max(count,Max+500);
            }
        }
        if(number.size()==2){
            if(v[number.get(0)]== 4){
                count = Math.max(count,number.get(0)+800);
            }else if(v[number.get(1)]==4){
                count = Math.max(count, number.get(1)+800);
            }
        
            if(v[number.get(0)]==3){
                count = Math.max(count,number.get(0)*10+number.get(1)+700);
            }else if(v[number.get(1)]==3){
                count = Math.max(count,number.get(1)*10+number.get(0)+700);
            }
        }
        if(color.size()==1){
            count = Math.max(count, Max+600);
        }
        if(number.size()==3){
            if(v[number.get(0)]==3){
                count = Math.max(count,number.get(0)+400);
            }else if(v[number.get(1)]==3){
                count = Math.max(count, number.get(1)+400);
            }else if(v[number.get(2)]==3){
                count = Math.max(count, number.get(2)+400);
            }
            if(v[number.get(0)]==2&&v[number.get(1)]==2){
                if(number.get(0)>number.get(1)){
                    count = Math.max(count, number.get(0)*10+number.get(1)+300);
                }else{
                    count = Math.max(count,number.get(1)*10+number.get(0)+300);
                }
            }else if(v[number.get(0)]==2&&v[number.get(2)]==2){
                if(number.get(0)>number.get(2)){
                    count = Math.max(count, number.get(0)*10+number.get(2)+300);
                }else{
                    count = Math.max(count, number.get(2)*10+number.get(0)+300);
                }
            }else if(v[number.get(1)]==2&&v[number.get(2)]==2){
                if(number.get(1)>number.get(2)){
                    count = Math.max(count, number.get(1)*10+number.get(2)+300);
                }else{
                    count = Math.max(count, number.get(2)*10+number.get(1)+300);
                }
            }
        }
        if(number.size()==4){
            for(int i=1;i<10;i++){
                if(v[number.get(i)]==2){
                    count = Math.max(count, number.get(i)+200);
                    break;
                }
            }
        }
        if(count==Integer.MIN_VALUE){
            count = Math.max(count,Max+100);
        }
        System.out.println(count);
    }
    
}