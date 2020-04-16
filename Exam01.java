package kr.ac.jinwoo.day04.homework;

import java.util.Scanner;

/*
	10개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성하시오.
	
	< 짝수 >
	12 8 30 22 4 22
	짝수의 총합 : XXX
	
	< 홀수 >
	5 87 9 15
	홀수의 총합 : XXX

 */

public class Exam01 {

	public static void main(String[] args) {
		
		int[] numArr = new int[10];
		int totalEven = 0, totalOdd = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.printf("%d's num : ", i+1);
			
			numArr[i] = sc.nextInt();
			sc.nextLine();
		}
		sc.close();
		System.out.println();
		
		System.out.println("< 짝수 >");
		for(int i = 0; i < numArr.length; i++) {
			if(numArr[i] % 2 == 0) {
				totalEven += numArr[i];
				System.out.printf("%d ", numArr[i]);
			}
		}
		System.out.println("\n짝수의 총합 : " + totalEven + '\n');
		
		System.out.println("< 홀수 >");
		for(int i = 0; i < numArr.length; i++) {
			if(numArr[i] % 2 != 0) {
				totalOdd += numArr[i];
				System.out.printf("%d ", numArr[i]);
			}
		}
		System.out.println("\n홀수의 총합 : " + totalOdd);
		
	}

}
