import java.util.Scanner;
import java.util.Stack;
/**
 * @notice   : 단어뒤집기 - Filp word
 * @blog     : https://gelmal00story.tistory.com/7?category=1047251
 * @BaekJoon : https://www.acmicpc.net/problem/9093
 * @author   : sykang
 */

public class FlipWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int NOC = sc.nextInt();
        Stack stack = new Stack();
        sc.nextLine();

        for(int i=0; i<NOC; i++) {
            String str = sc.nextLine() + " ";
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j) == ' ') {
                    while(!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    sb.append(" ");
                } else {
                    stack.push(str.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
}