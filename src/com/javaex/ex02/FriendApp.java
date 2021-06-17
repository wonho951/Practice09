package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class FriendApp {

    public static void main(String[] args) {

    	
        
    	
        Scanner sc = new Scanner(System.in);

        List<Friend> fArray = new ArrayList<Friend>();	//친구3명 담을 그릇 준비
        System.out.println("친구를 3명 등록해 주세요");

        try {
        	//친구정보 3명 입력 로직 --> 반복문 사용
            for( int i = 0; i < 3; i++) {    
            	// 친구정보(이름,핸드폰,학교) 입력받기
            	String Info = sc.nextLine();
            	String[] sArray = new String[3];//3명 담을 방 만들고
            	sArray = Info.split(" ");
      
            	
                // Friend 인스턴스 생성하여 데이터 넣기
            	Friend info = new Friend();
            	
            	info.setName(sArray[0]);
            	info.setHp(sArray[1]);
            	info.setSchool(sArray[2]);        	        	
                // 인스턴스 주소를 배열에 대입
            	
            	fArray.add(info);
            }

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("다시 입력해주세요.");
		}
        
                
        
        // 친구정보 출력
        for (int i = 0; i < fArray.size(); i++) {
            //친구정보 출력 메소드 호출
        	fArray.get(i).showInfo();
        }

        sc.close();
    }

}
