package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	
        
        Scanner sc = new Scanner(System.in);
        
        
        ArrayList<Friend> fArray = new ArrayList<Friend>();
        
        System.out.println("친구를 3명 등록해 주세요");

        //친구정보 3명 입력 로직 --> 반복문 사용
        
        for( int i = 0; i < fArray.size(); i++) {    
        	
        	// 친구정보(이름,핸드폰,학교) 입력받기
        	
        	String Info = sc.nextLine();
        	String[] sArray = Info.split(" ");
  
        	
            // Friend 인스턴스 생성하여 데이터 넣기
        	
        	
        	    	        	
            // 인스턴스 주소를 배열에 대입
        	
        	
        }
        
        
        // 친구정보 출력
        for (int i = 0; i < fArray.size(); i++) {
            //친구정보 출력 메소드 호출
        	fArray.get(i).showInfo();
        }

        sc.close();
    	
    	
    }

}
