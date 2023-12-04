import java.util.Stack;
public class displayStack {
    public static void displayReverseRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.println(top+" ");
        displayReverseRec(st);
        st.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        //st.push(6);

        displayReverseRec(st);

    }
}