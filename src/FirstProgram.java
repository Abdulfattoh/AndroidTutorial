public class FirstProgram {
    public static void main(String[] args){
        System.out.println("It's my first program");

        // O'zgaruvchilar - Variables
        // Ma'lumotlar turlari - Data types

        String meva = "Olma";
        System.out.println(meva);


        // -2^31 < int < 2^31-1
        int yosh = 24;

        // -128 < byte < 127
        byte myByte = 127;

        // -2^15 < short < 2^15 -1
        short myShort = 536;

        // 3.4e-38 < float < 3.4e38
        float pi = 3.14f;

        // 1.7e-308 < double < 1.73e308
        double myDouble = 6.47;

        // character
        char myChar = '*';

        // -2^63 < long < 2^63 -1
        long myLong = 4324;

        System.out.println(Character.SIZE / 8 + " byte");
        System.out.println(Byte.SIZE / 8 + " byte");
        System.out.println(Short.SIZE / 8 + " byte");
        System.out.println(Integer.SIZE / 8 + " byte");
        System.out.println(Long.SIZE / 8 + " byte");
        System.out.println(Float.SIZE / 8 + " byte");
        System.out.println(Double.SIZE / 8 + " byte");








    }
}
