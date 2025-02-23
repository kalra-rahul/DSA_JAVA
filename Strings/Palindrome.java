
public class Palindrome {
    public static void main(String args[]){
        Boolean flag = true;
        String str = "radax";

        int start =0;
        int end = str.length()-1;

        while (start<end) {
            if(str.charAt(start) != str.charAt(end)){
                flag=false;
                break;
            }
            start++;
            end--;
        }

        System.out.println(flag);
    }
    
}
