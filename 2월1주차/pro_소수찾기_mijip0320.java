//https://school.programmers.co.kr/learn/courses/30/lessons/42839
import java.util.*;

public class pro_소수찾기_mijip0320 {
    static ArrayList<Integer> arr = new ArrayList<>();
    static boolean[] check = new boolean[7];
    public static void main(String[] args) throws Exception {
        String numbers = "17";
        int answer = 0;
        
        for(int i=0; i<numbers.length(); i++){
            dfs(numbers,"",i+1);
        }
        
        for(int i=0; i<arr.size(); i++){
            if(isPrime(arr.get(i))) answer++;              
        }

        System.out.println(answer);
    }
    
    public static void dfs(String numbers, String s, int j ) {
        if(s.length() == j){
                int num = Integer.parseInt(s);
                if(!arr.contains(num)){
                    arr.add(num);
                }
            }
        
            for(int i=0; i<numbers.length(); i++){
                if(!check[i]){
                    check[i] = true;
                    s += numbers.charAt(i);
                    dfs(numbers, s, j);
                    check[i] = false;
                    s = s.substring(0, s.length()-1);
                }
            }
    }
    
    public static boolean isPrime(int n) {
        if(n<2) return false;
	for (int i = 2; i<=(int)Math.sqrt(n); i++) {
      if (n % i == 0) {
          return false;
      }
	}
	return true;
}
}
