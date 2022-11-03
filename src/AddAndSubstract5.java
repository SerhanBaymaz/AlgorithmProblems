import java.util.Scanner;

public class AddAndSubstract5 {

    public static int recursive(int baseNumber,int newNumber,boolean isIncreasing){
        if(newNumber+5==baseNumber&&isIncreasing==false){
            System.out.print(baseNumber+", ");
        }

        if (newNumber==baseNumber){
            return baseNumber;
        } else if (newNumber>0 && newNumber<baseNumber && isIncreasing==false) {
            System.out.print(newNumber+", ");
            return recursive(baseNumber,newNumber-5,isIncreasing);
        }else{
            System.out.print(newNumber+", ");
            isIncreasing =true;
            return recursive(baseNumber,newNumber+5,isIncreasing);
        }

    }

    public static void main(String[] args)  {
        System.out.println("****************************************************************************************************************************");
        //write a recursive method that subtract 5 from the given number until it reaches 0.
        //when it reaches 0 or less than 0, add 5 to the number until it reaches the original number.
        //and print the numbers in the same line with a space between the numbers.
        //for example, if the number is 20, the output should be 20 15 10 5 0 5 10 15 20

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number -->");
        int number = scan.nextInt();
        int newNumber = number-5;
        System.out.print(recursive(number,newNumber,false)+", ");
        System.out.println();


        System.out.println("****************************************************************************************************************************");
    }

}
