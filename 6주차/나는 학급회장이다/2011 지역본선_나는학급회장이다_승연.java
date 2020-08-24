import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        int[] arr3 = new int[N];
        int total_sum1 = 0, total_sum2 = 0, total_sum3 =0;
        int three1 =0, three2 =0,three3 =0;
        int two1 =0, two2 =0,two3=0;
        int one1 =0, one2 =0, one3=0;
        for(int i=0;i<N;i++){
            arr1[i] = sc.nextInt();
            total_sum1 +=arr1[i];
            if(arr1[i]==3){
                three1++;
            }else if(arr1[i]==2){
                two1++;
            }else{
                one1++;
            }
            arr2[i] = sc.nextInt();
            total_sum2 +=arr2[i];
            if(arr2[i]==3){
                three2++;
            }else if(arr2[i]==2){
                two2++;
            }else{
                one2++;
            }
            arr3[i] = sc.nextInt();
            total_sum3 +=arr3[i];
            if(arr3[i]==3){
                three3++;
            }else if(arr3[i]==2){
                two3++;
            }else{
                one3++;
            }
        }
        if(total_sum1>total_sum2){
            if(total_sum1>total_sum3){
                System.out.println("1 "+total_sum1);
            }else if(total_sum1<total_sum3){
                System.out.println("3 "+total_sum3);
            }else if(total_sum1==total_sum3){
                if(three1!=three3){
                    if(three1>three3){
                        System.out.println("1 "+total_sum1);
                    }else{
                        System.out.println("3 "+total_sum3);
                    }
                }else{
                    if(two1!=two3){
                        if(two1>two3){
                            System.out.println("1 "+total_sum1);
                        }else{
                            System.out.println("3 "+total_sum3);
                        }
                    }else{
                        System.out.println("0 "+total_sum1);
                    }
                }
            }
        }else if(total_sum1<total_sum2){
            if(total_sum2>total_sum3){
                System.out.println("2 "+total_sum2);
            }else if(total_sum2<total_sum3){
                System.out.println("3 "+total_sum3);
            }else if(total_sum2==total_sum3){
                if(three2!=three3){
                    if(three2>three3){
                        System.out.println("2 "+total_sum2);
                    }else{
                        System.out.println("3 "+total_sum3);
                    }
                }else{
                    if(two2!=two3){
                        if(two2>two3){
                            System.out.println("2 "+total_sum2);
                        }else{
                            System.out.println("3 "+total_sum3);
                        }
                    }else{
                        System.out.println("0 "+total_sum2);
                    }
                }
            }
        }
        else if(total_sum1>total_sum3){
            if(total_sum1>total_sum2){
                System.out.println("1 "+total_sum1);
            }else if(total_sum1<total_sum2){
                System.out.println("2 "+total_sum2);
            }else if(total_sum1==total_sum2){
                if(three1!=three2){
                    if(three1>three2){
                        System.out.println("1 "+total_sum1);
                    }else{
                        System.out.println("2 "+total_sum2);
                    }
                }else{
                    if(two1!=two2){
                        if(two1>two2){
                            System.out.println("1 "+total_sum1);
                        }else{
                            System.out.println("2 "+total_sum2);
                        }
                    }else{
                        System.out.println("0 "+total_sum1);
                    }
                }
            }   
        }else if(total_sum1<total_sum3){
            if(total_sum3>total_sum2){
                System.out.println("3 "+total_sum3);
            }else if(total_sum3<total_sum2){
                System.out.println("2 "+total_sum2);
            }else if(total_sum3==total_sum2){
                if(three3!=three2){
                    if(three3>three2){
                        System.out.println("3 "+total_sum3);
                    }else{
                        System.out.println("2 "+total_sum2);
                    }
                }else{
                    if(two3!=two2){
                        if(two3>two2){
                            System.out.println("3 "+total_sum3);
                        }else{
                            System.out.println("2 "+total_sum2);
                        }
                    }else{
                        System.out.println("0 "+total_sum3);
                    }
                }
            }
        }
        else if(total_sum2>total_sum3){
            if(total_sum1>total_sum2){
                System.out.println("1 "+total_sum1);
            }else if(total_sum1<total_sum2){
                System.out.println("2 "+total_sum2);
            }else if(total_sum1==total_sum2){
                if(three1!=three2){
                    if(three1>three2){
                        System.out.println("1 "+total_sum1);
                    }else{
                        System.out.println("2 "+total_sum2);
                    }
                }else{
                    if(two1!=two2){
                        if(two1>two2){
                            System.out.println("1 "+total_sum1);
                        }else{
                            System.out.println("2 "+total_sum2);
                        }
                    }else{
                        System.out.println("0 "+total_sum2);
                    }
                }
            }
        }else if(total_sum2<total_sum3){
            if(total_sum1>total_sum3){
                System.out.println("1 "+total_sum1);
            }else if(total_sum1<total_sum3){
                System.out.println("3 "+total_sum3);
            }else if(total_sum1==total_sum3){
                if(three1!=three3){
                    if(three1>three3){
                        System.out.println("1 "+total_sum1);
                    }else{
                        System.out.println("3 "+total_sum3);
                    }
                }else{
                    if(two1!=two3){
                        if(two1>two3){
                            System.out.println("1 "+total_sum1);
                        }else{
                            System.out.println("3 "+total_sum3);
                        }
                    }else{
                        System.out.println("0 "+total_sum3);
                    }
                }
            }
        }else{
            if(three3>three2){
                if(three3>three1){
                    System.out.println("3 "+total_sum3);
                }else if(three3<three1){
                    System.out.println("1 "+total_sum1);
                }else{
                    if(two3!=two1){
                        if(two3>two1){
                            System.out.println("3 "+total_sum3);
                        }else{
                            System.out.println("1 "+total_sum1);
                        }
                    }else{
                        System.out.println("0 "+total_sum3);
                    }
                }
            }else if(three3<three2){
                if(three2>three1){
                    System.out.println("2 "+total_sum2);
                }else if(three2<three1){
                    System.out.println("1 "+total_sum1);
                }else{
                    if(two2!=two1){
                        if(two2>two1){
                            System.out.println("2 "+total_sum2);
                        }else{
                            System.out.println("1 "+total_sum1);
                        }
                    }else{
                        System.out.println("0 "+total_sum2);
                    }
                }
            }else if(three1>three2){
                if(three3>three1){
                    System.out.println("3 "+total_sum3);
                }else if(three3<three1){
                    System.out.println("1 "+total_sum1);
                }else{
                    if(two3!=two1){
                        if(two3>two1){
                            System.out.println("3 "+total_sum3);
                        }else{
                            System.out.println("1 "+total_sum1);
                        }
                    }else{
                        System.out.println("0 "+total_sum3);
                    }
                }
            }else if(three1<three2){
                if(three3>three2){
                    System.out.println("3 "+total_sum3);
                }else if(three3<three2){
                    System.out.println("2 "+total_sum2);
                }else{
                    if(two3!=two2){
                        if(two3>two2){
                            System.out.println("3 "+total_sum3);
                        }else{
                            System.out.println("2 "+total_sum2);
                        }
                    }else{
                        System.out.println("0 "+total_sum3);
                    }
                }
            }else{
                System.out.println("0 "+total_sum3);
        
            }
            }
    }
}
