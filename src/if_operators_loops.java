public class if_operators_loops {

    public static void main(String[] args){

//        System.out.println("Hello Java");
//
//        // Ma'lumot turlari
//
//        //String
//        String text = "this is my first program";
//
//        int age = 21312;
//
//        float pi = 3.14f;
//
//        // -127 < byte <= 127
//        byte myByte = 127;
//
//        double myDouble = 36.4;
//
//        // character
//        char myChar = '&';
//
//        boolean c = true;


        //Relational operators -- Solishtirish operatorlari
        //if statement -- shart operatori

        //Relational operators - Solishtirish operatorlari
        // == - tenglik -- equal
        // != - teng emas -- not equal
        // > - katta - greater than
        // < - kichik - less than
        // >= - katta yoki teng - greater than or equal
        // <= - kichik yoki teng - less than or equal

//        int a = 5;
//        int b = 6;
//
//        if(a > b){
//            System.out.println("a soni katta");
//        }else{
//            System.out.println("b soni katta");
//        }


        // logical operators - mantiqiy amallar

        // AND yoki ( && ) -- mantiqiy "va"
        // OR yoki ( || ) -- mantiqiy "yoki"
        // ! -- inkor belgisi

        int avtobusRaqami = 28;
        int sizKutayotganAvtobus = 28;
        int yolovchilarSoni = 50;

        if (!(sizKutayotganAvtobus == avtobusRaqami)){
            System.out.println("Bu avtobusga chiqmang !");
        }else{
            System.out.println("Bu avtobusga chiqing");
        }

        // For and While operators - For va While operatorlari

//        for(int i = 0; i < 10; i++){  //i++ -- increment ma'lum bir qiymatga oshirish
//            System.out.println(i);
//        }

        // for(int i = 10; 10 < 10; i++){
        //      System.out.println();
        // }
//        int i = 0;
//        while (i < 5){
//            System.out.println(i);
//            i++;
//        }

        for (int a = 1; a < 5; a++){
            for (int b = 1; b < 10; b++){
                int c = a * b;
                System.out.println(a + "*" + b + " = " + c);
            }
        }






















    }

}
