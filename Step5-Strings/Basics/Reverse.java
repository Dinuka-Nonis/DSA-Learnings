public class Reverse {
    public String reverseWords(String s){
        StringBuilder result = new StringBuilder();

        int i = s.length() -1;

        while(i>=0){
            while (i>=0 && s.charAt(i) == ' '){
                i--;
            }
            if(i<0) break;
            int end = i;

            while (i>=0 && s.charAt(i) != ' '){
                i--;
            }
            String word = s.substring(i+1, end+1);

            if(result.length()>0){
                result.append(" ");
            }
            result.append(word);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Reverse obj = new Reverse();
        String s = " Adjusting the seat? thats your problem the whole time. The seat height. now you have it  ";
        System.out.println(obj.reverseWords(s));
    }
}
