public class Paranthesis {
    public String removeOuterParentheses(String s) {

        StringBuilder result = new StringBuilder();
        int depth = 0 ;

        for (char ch : s.toCharArray()){
            if( ch == '('){
                if (depth>0) result.append(ch);
                depth++;
            }
            else if (ch==')'){
                depth--;
                if (depth>0) result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "(()())(())";
        Paranthesis sol = new Paranthesis();

        String ans = sol.removeOuterParentheses(s);

        System.out.println("The result is: "+ ans);
    }
}
