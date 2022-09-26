public class Vowels {

    /*
        Return the number (count) of vowels in the given string.
        We will consider a, e, i, o, u as vowels for this Kata (but not y).
        The input string will only consist of lower case letters and/or spaces.
     */

    public static int getCount(String str) {
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if ( (str.charAt(i)=='a') ){
                count++;
            }else if((str.charAt(i)=='e')){
                count++;
            }else if((str.charAt(i)=='i')){
                count++;
            }else if((str.charAt(i)=='o')){
                count++;
            }else if((str.charAt(i)=='u')){
                count++;
            }
        }

        return count;
    }



    public static void main(String[] args) {
        String s = "abracadabra";
        System.out.println(getCount(s));
    }
}