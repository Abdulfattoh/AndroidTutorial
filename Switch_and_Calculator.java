import java.util.Scanner;

public class Switch_and_Calculator {

    public static void main(String[] args){

//        int haftakuni = 2;

//        switch (haftakuni){
//            case 1:
//                System.out.println("Dushanba");
//                break;
//            case 2:
//                System.out.println("Seshanba");
//                break;
//            case 3:
//                System.out.println("Chorshanba");
//        }

//        Scanner newValue = new Scanner(System.in);
//        int value1;
//        System.out.println("Value kiriting");
//
//        System.out.println("Siz " + newValue.nextLine() + " sonini kiritdingiz");

        Scanner newValue = new Scanner(System.in);
        int value1,value2,result;
        char operator;

        System.out.println("Birinchi sonni kiriting : ");
        value1 = newValue.nextInt();
        System.out.println("Ikkinchi sonni kiriting : ");
        value2 = newValue.nextInt();
        System.out.println("Qanday amal bajarilishini hohlaysiz : ");
        operator = newValue.next().charAt(0);

        switch (operator){
            case '+':
                result = value1 + value2;
                System.out.println("Natija : " + result);
                break;
            case '-':
                result = value1 - value2;
                System.out.println("Natija : " + result);
                break;
            case '*':
                result = value1 * value2;
                System.out.println("Natija : " + result);
                break;
            case '/':
                result = value1 / value2;
                System.out.println("Natija : " + result);
                break;
        }



    }

}
