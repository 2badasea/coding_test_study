package baekjoon.javascript.java;

import java.util.*;
import java.io.*;

public class Q_2753 {

    public static void main(String[] args)  throws IOException{
        // 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램
        // 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        System.out.println(cal_result(year));
    }

    // 윤년 계산
    static int cal_result(int year){
        if(  (year % 4 == 0 && year % 100 != 0) ||  year % 400 == 0){
            return 1;
        } else {
            return 0;
        }

    }
}