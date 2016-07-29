package com.hand;


public class App 
{
    public static void main( String[] args )
    {
    	int number[] = new int[100];
    	int count = 0;
    	for(int i = 101;i <= 200;i++){
    		boolean yes = check(i);
    		if(yes){
    			number[count] = i;
    			count++;
    		}
    	}
    	
    	//输出
    	System.out.println("101-200之间的共有"+count+"个素数"+"分别是：");
    	for (int i = 0; i < count; i++) {
			System.out.print(number[i]+" ");
		}
    }
    
    //判断是否为素数
    static boolean check(int number){
    	for (int i = 2; i < number-1; i++) {
			if(number % i == 0){
				return false;
			}
		}
    	return true;
    }
}
