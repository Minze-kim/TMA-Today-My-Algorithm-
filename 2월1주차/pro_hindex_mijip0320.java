package Programmers;
//https://school.programmers.co.kr/learn/courses/30/lessons/42747
import java.util.*;

public class pro_hindex_mijip0320 {
    public static void main(String[] args) {
        int answer = 0;
        int[] citations = { 3, 0, 6, 1, 5 };

        //조건: 어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값
        // h<=n

        Arrays.sort(citations);
        //0 1 3 5 6
        //5 4 3 2 1

        
        int hIndex = citations.length;
        for (int i = 0; i < citations.length; i++) {
           // System.out.println(citations[i]);
            if (hIndex > 0 && hIndex <= citations[i]) {
                answer = hIndex;
                break;
            }
            hIndex--;
        }

        System.out.println(answer);

    }
}
