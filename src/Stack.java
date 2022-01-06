/**
 * 단어를 모두 뒤집는 문제에 사용
 *
 */
public class Stack {

    iANDo is = new iANDo();

    public static int[] stack;
    public static int size = 0;
    public static int NOC = 0;

    Stack(){
        NOC = is.inputInt();
        stack = new int[NOC];
    }

    public void startStack(){

        for(int i=0 ; i<NOC ; i++){
            String opcode = is.inputString();
            switch (opcode) {

                case "push":
                    push(is.inputInt());
                    break;
                case "pop":
                    is.inputIntSbNl(pop());
                    break;
                case "size":
                    is.inputIntSbNl(size());
                    break;
                case "empty":
                    is.inputIntSbNl(empty());
                    break;
                case "top":
                    is.inputIntSbNl(top());
                    break;
            }
        }
        System.out.println(is.sb);
    }

    public void push(int item) {
        stack[size++] = item;
    }

    public int pop() {
        if(size == 0) return -1;
        return stack[size-- -1];
    }

    public int size() {
        return size;
    }

    public int empty() {
        return (size == 0) ? 1 : 0;
    }

    public int top() {
        return stack[size-1];
    }
}
