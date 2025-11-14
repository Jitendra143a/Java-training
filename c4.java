public class c4 {
                public static void main(String[] args) {
                    String str = "aabbc";
                    StringBuilder result = new StringBuilder(str);
                    String reversedStr = result.reverse().toString();
                    
                    if (str.equals(reversedStr)) {
                        System.out.println(str + " is a palindrome.");
                    } else {
                        System.out.println(str + " is not a palindrome.");
                    }
                }
            }
    
// write a program to find palendrome
            

