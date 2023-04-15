package 과제5;

import java.util.Scanner;

public class Year_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "";
		boolean valid = false;
		Scanner sc = new Scanner(System.in);
		
		while(!valid) {
			System.out.print("암호를 입력하세요: ");
			num = sc.next(); 
			System.out.println("입력된 암호: " + num + "\n");
			
			if(num.length() < 10 || numbers(num) <= 0 || letters(num) <= 0) {
				System.out.println("암호가 유효하지 않다.");
				valid = false;
			}
			else {
				valid = true;
				break;
			}
			
			if(num.length() < 10) {
				System.out.println("이유: 암호의 길이가 10보다 작다.");
			}
			if(numbers(num) <= 0) {
				System.out.println("이유: 암호 내에 숫자가 없다.");
			}
			if(letters(num) <= 0) {
				System.out.println("이유: 암호 내에 영문자가 없다.");
			}
			
			System.out.println();
		}
		
		System.out.println("암호가 유효하다.");
	
	}
	
	public static int numbers(String num) {
		int count = 0;
		
		for (int i = 0; i < num.length(); i++) {
			if( '0' <= num.charAt(i) && num.charAt(i) <= '9') {
				count++;
			}
		}
		
		return count;
	}
	
	public static int letters(String num) {
		int count = 0;
		
		if (('a' <= num.charAt(0) && num.charAt(0) <= 'z') || ('A' <= num.charAt(0) && num.charAt(0) <= 'Z')) {
			count ++;
		}
		else {
			
		}
		
		if (num.length() == 1) {
			return count;
		}
		else {
			return count + letters(num.substring(1));
		}
	}

}
