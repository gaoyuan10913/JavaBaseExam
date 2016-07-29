package com.hand;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入工资：");
        int salary;
        salary = scanner.nextInt();
        
        if(salary < 3500){
        	System.out.println("所需缴纳的税费为0");
        }else if((salary-3500) < 1500){
        	System.out.println("所需缴纳的税费为"+(salary-3500)*0.03);
        }else if((salary-3500) < 4500 && (salary-3500) >= 1500){
        	System.out.println("所需缴纳的税费为"+(salary-3500)*0.1);
        }else if((salary-3500) < 9000 && (salary-3500) >= 4500){
        	System.out.println("所需缴纳的税费为"+(salary-3500)*0.2);
        }else if((salary-3500) < 35000 && (salary-3500) >= 9000){
        	System.out.println("所需缴纳的税费为"+(salary-3500)*0.25);
        }else if((salary-3500) < 55000 && (salary-3500) >= 35000){
        	System.out.println("所需缴纳的税费为"+(salary-3500)*0.3);
        }else if((salary-3500) < 80000 && (salary-3500) >= 55000){
        	System.out.println("所需缴纳的税费为"+(salary-3500)*0.35);
        }else if((salary-3500) >= 80000){
        	System.out.println("所需缴纳的税费为"+(salary-3500)*0.45);
        }
    }
}
