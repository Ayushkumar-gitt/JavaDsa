public class Strings_practice {
    public static void main(String[] args) {
        System.out.println(palindrome_string());
    }

    public static void printing_abcd(){
        String series = ""; 
        for (int i = 0; i < 26; i++) { 
            char ch = (char)('a'+i);
            series+=ch;
        } // N^2 time complexity. Everytime a ch is getting added in series , the old object with last data is getting discarded as new object is created to point on , cause strings can't change once created. a new object is created and its pointed to it , so the old object is discarded and waste of memory is done.

        System.out.println(series);
        
        StringBuilder seriesb = new StringBuilder();
        for (int i = 0; i < 26; i++) { 
            char ch = (char)('a'+i);
            seriesb.append(ch);
        } // Good time and space complexity , cause its mutable , it is changing in the same object only.
        System.out.println(seriesb);
    }
    public static boolean palindrome_string(){
        String st = "abccba";

        if (st==null || st.length()==0) {
            return true;
        }
        
        int start = 0;
        int end = st.length()-1;
        while (start<end) {
            if (st.charAt(start)==st.charAt(end)) {
                start++;end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
