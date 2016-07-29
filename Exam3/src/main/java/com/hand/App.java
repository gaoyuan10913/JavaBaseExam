package com.hand;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int year,month,day;
        String days;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年月日：");
        days = scanner.nextLine();
        //获取年月日
        year = Integer.parseInt(days.substring(0, 4));
        month = Integer.parseInt(days.substring(5, 7));
        day = Integer.parseInt(days.substring(8, 10));
        
        int number1[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int number2[] = {0,31,29,31,30,31,30,31,31,30,31,30,31};//闰年
        
       
        boolean checkup = check(year);
        //计算天数
        int count = 0;
        if(checkup){
        	for(int i = 0;i < month;i++){
        		count += number2[i];
        	}
        	count += day;
        	System.out.println("你输入的日期为当年的第"+count+"天");
        }
        else{
        	for(int i = 0;i < month;i++){
        		count += number1[i];
        	}
        	count += day;
        	System.out.println("你输入的日期为当年的第"+count+"天");
        }
        
    }
    //判断年是否为闰年
    static boolean check(int year){
    	if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
    		return true;
    	}
    	return false;		
    }
}
