package SWEA;
//https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5LrsUaDxcDFAXc&categoryId=AV5LrsUaDxcDFAXc&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class swea_백만장자프로젝트_mijip0320 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer s;

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] price = new int[N];


            //매매가를 저장
            s = new StringTokenizer(br.readLine());
            //long max = Long.MIN_VALUE;
            long answer = 0;
            for (int i = 0; i < N; i++) {
                price[i] = Integer.parseInt(s.nextToken());
                //if(max < price[i]) max = price[i];
                //System.out.println(price[i]);
            }


                //맨 마지막 날짜부터 계산
                //i : 파는 날, j : 사는 날.
                for(int i=N-1; i>=0; i--) {

                    int j = i-1; //현재 파는 날짜보다 바로 앞의 날짜들을 검사
                    int tmp = 0;
                    while(j >= 0 && price[i] > price[j]) { //이익을 남길 수 있는 날일때
                        tmp += price[i]; //파는 날의 매매가를 더해준다.
                        tmp -= price[j]; //사는 날의 매매가를 빼준다.
                        j--; //앞의 날짜로 이동
                    }

                    answer += tmp; //이익에 더해준다.
                    i = j+1; //파는 날을 옮겨준다.
                }

            System.out.println("#" + tc + " " + answer);

        }
    }
}
