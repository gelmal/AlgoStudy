package Stack;

import java.util.Scanner;

/**
 * @notice   : 괄호 bracket
 * @blog     : https://gelmal00story.tistory.com/10?category=1047251
 * @BaekJoon : https://www.acmicpc.net/problem/9012
 * @author   : sykang4966@naver.com
 */
class Bracket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int NOC = sc.nextInt();


        sc.nextLine();
        while(NOC-- > 0) {
            int stack = 0;
            String str = sc.nextLine();
            for(int i=0 ; i<str.length() ; i++) {
                if(str.charAt(i) == '(') {
                    stack++;
                } else if(str.charAt(i) == ')') {
                    if(stack == 0) {
                        stack = 100;
                        break;
                    } else {
                        stack--;
                    }
                }
            }
            if(stack == 0) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }
        System.out.print(sb);
    }
}