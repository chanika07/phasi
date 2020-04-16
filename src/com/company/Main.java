package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double x = sc.nextDouble();
	if (x>=5000001){
		System.out.println((x*35)/100);
	}
	else if (x>=2000001){
		System.out.println((x*30)/100);
	}
	else if (x>=1000001){
		System.out.println((x*25)/100);
	}
	else if (x>=750001){
		System.out.println((x*20)/100);
	}
	else if (x>=500001){
		System.out.println((x*15)/100);
	}
	else if (x>=300001){
		System.out.println((x*10)/100);
	}
	else if (x>=150000){
		System.out.println((x*5)/100);
	}else {
		System.out.println("ไม่ต้องเสียภาษี");
	}

    }
}
