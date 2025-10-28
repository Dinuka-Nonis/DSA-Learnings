public class isPalindrome {
        static boolean palindrome(int i, String s){

            if(i >= s.length()/2) return true; // base condition - if i exceed half of the string that means all elements are compared. we return true

            if(s.charAt(i)!= s.charAt(s.length()-i-1) )return false; // if start is not equal to end its not a palindrome 

            return palindrome(i+1, s);
        }
        public static void main(String[] args) {
            String s = "madam";
            System.out.println(palindrome(0, s));
        }
}
