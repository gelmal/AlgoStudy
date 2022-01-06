import java.util.Scanner;

public class iANDo {

    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    public int inputInt(){
        return in.nextInt();
    }

    public String inputString(){
        return in.next();
    }

    public void inputStringSb(String str){
        sb.append(str);
    }

    public void inputIntSb(int str){
        sb.append(str);
    }

    public void inputStringSbNl(String str){
        sb.append(str).append('\n');
    }

    public void inputIntSbNl(int str){
        sb.append(str).append('\n');
    }
}
