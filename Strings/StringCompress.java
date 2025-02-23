public class StringCompress {

    public static void main(String args[]){
        // String str = "aaabbbbcc";
        String str = "abcd";
        String newStr="";

        for (int i = 0; i < str.length(); i++) {
            char strChar = str.charAt(i);
            int count = 1;

            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(j) == str.charAt(i)){
                    count++;
                    i++;
                };
            }
            newStr += strChar+ String.valueOf(count);
        

        }
        System.out.print(newStr);
    }
    
}
