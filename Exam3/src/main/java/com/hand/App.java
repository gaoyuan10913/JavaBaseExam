package com.hand;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int year,month,day;
        String days;
        Scanner scanner = new Scanner(System.in);
        System.out.println("�����������գ�");
        days = scanner.nextLine();
        //��ȡ������
        year = Integer.parseInt(days.substring(0, 4));
        month = Integer.parseInt(days.substring(5, 7));
        day = Integer.parseInt(days.substring(8, 10));
        
        int number1[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int number2[] = {0,31,29,31,30,31,30,31,31,30,31,30,31};//����
        
       
        boolean checkup = check(year);
        //��������
        int count = 0;
        if(checkup){
        	for(int i = 0;i < month;i++){
        		count += number2[i];
        	}
        	count += day;
        	System.out.println("�����������Ϊ����ĵ�"+count+"��");
        }
        else{
        	for(int i = 0;i < month;i++){
        		count += number1[i];
        	}
        	count += day;
        	System.out.println("�����������Ϊ����ĵ�"+count+"��");
        }
        
    }
    //�ж����Ƿ�Ϊ����
    static boolean check(int year){
    	if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
    		return true;
    	}
    	return false;		
    }
}
