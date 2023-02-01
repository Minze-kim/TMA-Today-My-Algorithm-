package Programmers;
//https://school.programmers.co.kr/learn/courses/30/lessons/42587
import java.util.*;

public class pro_프린터_mijip0320 {
    public static class Printer {
		int location;
		int prior;

		Printer(int location, int prior) {
			this.location = location;
			this.prior = prior;
		}
	}
    public static void main(String[] args) {
        int answer = 0;
        int[] priorities = { 2, 1, 3, 2 };
        int location = 2;

        Queue<Printer> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Printer(i, priorities[i]));
        }
        
        while (!queue.isEmpty()) {
            boolean flag = false;
			int com = queue.peek().prior;
			for (Printer p : queue) { //큐의 값들을 하나씩 Printer p로 꺼내보기
				if (com < p.prior) { // 맨앞의 수보다 큰 숫자가 존재하면
					flag = true;
                    break;
				}
			}
            
            if(flag){ //true값이면 맨 앞으로 가져옴
                queue.offer(queue.poll());
			} else {// 현재 맨앞의 숫자가 가장 클 때(flag = false일때)
				if (queue.poll().location == location) { //Printer 객체의 location과 주어진 location이 같다면
					answer = priorities.length - queue.size(); //떨어진 만큼 구하기(우선순위순으로..)
				}
			}
        }

        System.out.println(answer);
    }
}
