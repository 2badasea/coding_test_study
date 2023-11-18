import java.util.Scanner;

public class Main {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램
        // 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때다.

        System.out.println("연도를 입력하세요");
        int target_year = scn.nextInt();

        System.out.println(cal_result(target_year));
    }

    static int cal_result(int year){

        if(  (year % 4 == 0 && year % 100 != 0) ||  year % 400 == 0){
            return 1;
        } else {
            return 0;
        }

    }
}