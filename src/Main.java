public class Main {

    public static void main(String[] args){

        // Intro to array -- Massiv

        int[] myNumbers = {1,2,3,4,5};
        String[] myString = {"Hello", "Hi", "Hey"};

        System.out.println(myNumbers.length);

        for (int i = 0; i < myNumbers.length; i++){
            System.out.println(myNumbers[i]);
        }

        int[] newArray = new int[5];
        newArray[0] = 10;
        newArray[1] = 20;
        newArray[2] = 30;
        newArray[3] = 40;
        newArray[4] = 50;

        for (int a=0; a < newArray.length; a++){
            System.out.println(newArray[a]);
        }


    }
}
