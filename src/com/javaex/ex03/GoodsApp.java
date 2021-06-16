package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

    	
    	ArrayList<Goods> goods = new ArrayList<Goods>();
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int total = 0;
    	System.out.println("상품을 입력해주세요(종료q)");
    	
    
    	while (true) {
    		String product = sc.nextLine();	//물건 입력받음.
    		
    		if("q".equals(product)) {	//만약 입력받은 문자가 q일때는 종료해라
    			System.out.println("[입력완료]");
    			System.out.println("====================");
    			break;
    		}
    		
    		String[] thing = product.split(",");	//입력받은 값 ,로 쪼갬
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    	}
    		
    	    	
    	
    	
    	
    	
    	sc.close();
    	
       
    }

}
