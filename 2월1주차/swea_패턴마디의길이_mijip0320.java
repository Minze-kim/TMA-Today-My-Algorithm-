package SWEA;
//https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5P1kNKAl8DFAUq&categoryId=AV5P1kNKAl8DFAUq&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1
import java.util.*;

public class swea_패턴마디의길이_mijip0320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            String s = sc.next();
            

            for (int i = 1; i <= s.length(); i++) {
                String pattern1 = s.substring(0, i);
                String pattern2 = s.substring(i, i + i);
                if (pattern1.equals(pattern2)) {
                    System.out.println("#" + Integer.toString(test_case) + " " + Integer.toString(pattern1.length()));
                    break;
                }
            }

        }
    }
    
}
