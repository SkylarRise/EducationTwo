package OneLesson;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Scanner;

public class FirstClass {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 3 возраста");

        int firstAge  = scan.nextInt();
        int secondAge = scan.nextInt();
        int thirdAge  = scan.nextInt();

        int[] numberArray  = new int[] {firstAge,secondAge,thirdAge};

        int minArray    = returnMinArray(numberArray);
        int maxArray    = returnMaxArray(numberArray);
        int middleAge   = returnMiddleArray(firstAge,secondAge,thirdAge);

        System.out.println("Средний возраст: "       + middleAge);
        System.out.println("Максимальный возраст: "  + maxArray);
        System.out.println("Меньший возраст: "       + minArray);
    }

    public static int returnMinArray(int[] numberArray ){
        int minArray = numberArray[0];

        for (int i = 0; i < numberArray.length; i++) {

            if (numberArray[i] < minArray) {
                minArray = numberArray[i];
            }
        }
        return minArray;
    }

    public static int returnMaxArray(int[] numberArray ){
        int maxArray = numberArray[0];

        for (int i = 0; i < numberArray.length; i++) {

            if (numberArray[i] > maxArray) {
                maxArray = numberArray[i];
            }
        }
        return maxArray;
    }

    public static int returnMiddleArray(int firstAge, int secondAge, int thirdAge ){

        int middleAge = (firstAge + secondAge + thirdAge) / 3;

        return middleAge;
    }

}
