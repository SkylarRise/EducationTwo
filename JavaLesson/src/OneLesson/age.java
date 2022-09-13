package OneLesson;

import java.util.Scanner;

public class age {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 3 возраста");

        int firstAge  = scan.nextInt();
        int secondAge = scan.nextInt();
        int thirdAge  = scan.nextInt();

        int maxAge = 0;
        int minAge = 0;
        int middleAge = 0;
        
        if ((firstAge > secondAge) & (firstAge > thirdAge)){
            maxAge = firstAge;
        } else if ((firstAge < secondAge) & (firstAge < thirdAge)){
            minAge =firstAge;
        }else {
            middleAge = firstAge;
        }

        if ((secondAge > firstAge) & (secondAge > thirdAge)){
            maxAge = secondAge;
        } else if ((secondAge < firstAge) & (secondAge < thirdAge)){
            minAge =secondAge;
        }else {
            middleAge = secondAge;
        }

        if ((thirdAge > firstAge) & (thirdAge > secondAge)){
            maxAge = thirdAge;
        } else if ((thirdAge < firstAge) & (thirdAge < secondAge)){
            minAge =thirdAge;
        }else {
            middleAge = thirdAge;
        }
        //Тест для GitHub!
        System.out.println("Средний возраст: "       + middleAge);
        System.out.println("Максимальный возраст: "  + maxAge);
        System.out.println("Меньший возраст: "       + minAge);
    }
}
