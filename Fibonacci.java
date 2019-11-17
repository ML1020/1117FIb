import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n){
        List<Integer> list = new ArrayList<>();
        for (int num = 1;num <=31;num++){
            if (num == 1 || num == 2) {
                list.add(1);
                continue;
            }else {
                int last2 = 1;
                int last1 = 1;
                int cur = 0;
                for (int i = 3; i <= num; i++) {
                    cur = last1 + last2;
                    last2 = last1;
                    last1 = cur;
                }
                list.add(cur);
                continue;
            }
        }
        int x,y,min;
        int t = n;
        for(int j = 0; ;j++){
            if(list.contains(t)){
                x = j;
                break;
            }
            t = t + 1;
        }
        int tmp = n;
        for(int k = 0; ; k++){
            if(list.contains(tmp)){
                y = k;
                break;
            }
            tmp = tmp - 1;
        }
        min = (x < y)? x:y;
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}
