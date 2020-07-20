import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        HashMap<String,String> hash = new HashMap<>();
        hash.put("000000","A");
        hash.put("001111","B");
        hash.put("010011","C");
        hash.put("011100","D");
        hash.put("100110","E");
        hash.put("101001","F");
        hash.put("110101","G");
        hash.put("111010","H");
        StringBuffer answer = new StringBuffer();
        for(int i=0;i<N;i++){
            String s = str.substring(i*6,(i+1)*6);
            String res = hash.get(s);
            if(res==null){
                for(String key:hash.keySet()){
                    char[] k = key.toCharArray();
                    char[] s2 = s.toCharArray();
                    int count=0;
                    for(int j=0;j<6;j++){
                        if(k[j]!= s2[j]){
                            count++;
                        }
                    }
                    if(count==1){
                        res = hash.get(key);
                    }                
                }
            }
            if(res!=null){
                answer.append(res);
            }else{
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(answer);
    }
}