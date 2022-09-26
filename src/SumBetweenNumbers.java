/*
https://www.codewars.com/kata/55f2b110f61eb01779000053/train/java
    Given two integers a and b, which can be positive or negative,
  find the sum of all the integers between and including them and return it.
  If the two numbers are equal return a or b.
  Examples (a, b) --> output (explanation)
  (-1, 2) --> 2 because(-1 + 0 + 1 + 2 = 2)
 */

public class SumBetweenNumbers {

    public static int getSum(int a, int b) {
        int sum =0;
        if(a==b) {
            return a;
        }else if(a<b){
            for (int i = a; i <=b ; i++) {
                sum=sum+i;
            }
            return sum;
        }else if (a>b){
            for (int i = b; i <=a ; i++) {
                sum=sum+i;
            }
            return sum;
        }else{
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println(getSum(1,0));
        System.out.println(getSum(1,2));
        System.out.println(getSum(0,1));
        System.out.println(getSum(1,1));
        System.out.println(getSum(-1,0));
        System.out.println(getSum(-1,2));

    }

}
