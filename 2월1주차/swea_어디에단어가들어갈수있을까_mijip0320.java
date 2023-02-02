package SWEA;
//https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PuPq6AaQDFAUq&categoryId=AV5PuPq6AaQDFAUq&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1
import java.util.*;

public class swea_어디에단어가들어갈수있을까_mijip0320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int T;
        T = sc.nextInt();
        int answer = 0;

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[][] puzzleMap = new int[N + 1][N + 1];
            for (int i = 0; i < N; i++) {

                for (int j = 0; j < N; j++) {
                    puzzleMap[i][j] = sc.nextInt();
                }
            }

            //행우선 체크
            for (int col = 0; col < N; col++) {
                int count = 0;
                for (int row = 0; row < N; row++) {
                    if (puzzleMap[row][col] == 0) {
                        if (count == K) { //글자 수만큼 들어감
                            answer += 1;
                            //count = 0; <-여기에 넣으면 에러 발생
                        } 
                        count = 0;
                    }else {
                            count += 1;
                        }
                }
                if (count == K) {
                    answer += 1;
                }
            }
        
            //열우선 체크
            for (int row = 0; row < N; row++) {
                int count = 0;
                for (int col = 0; col < N; col++) {
                    if (puzzleMap[row][col] == 0) {
                        if (count == K) { //글자 수만큼 들어감
                            answer += 1;
                           
                        } 
                    count = 0;
                    }else {
                            count += 1;
                        }
                }
                if (count == K) {
                    answer += 1;
                }
            }
           System.out.print('#' + Integer.toString(test_case) + " " + Integer.toString(answer));
            System.out.println();
        }
    }
}
