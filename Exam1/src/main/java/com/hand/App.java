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
    	
    	//���
    	System.out.println("101-200֮��Ĺ���"+count+"������"+"�ֱ��ǣ�");
    	for (int i = 0; i < count; i++) {
			System.out.print(number[i]+" ");
		}
    }
    
    //�ж��Ƿ�Ϊ����
    static boolean check(int number){
    	for (int i = 2; i < number-1; i++) {
			if(number % i == 0){
				return false;
			}
		}
    	return true;
    }
}
