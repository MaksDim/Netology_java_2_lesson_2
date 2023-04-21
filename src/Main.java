public class Main {

    public static void main(String[] args) {
        //входные данные
        int amount = 80;
        boolean isRegistered = true;

        // логика
        int percent;
        if (isRegistered) {
            percent = 3;
        } else {
            percent = 1;
        }
        //int percent2 = isRegistered ? 3 : 1; // тернараный оператор

        int bonus = amount * percent / 100;

        if (bonus > 500) {
            bonus = 500;
        }

        System.out.println("Бонус с покупки " + bonus);

//        System.out.println("Hello world");

//        byte b = 5; // 8 -128...127
//        short s = 5; // 16 -32k..32k
//        int i = 5; // 32 -2B..2B основной используемый
//        long x = 5; // 64 ...*/

//        Типы для дробных чисел (осн. double)
//        double d = 0.5;
//        float f = 0.5F;
//
//        String name = "Petya";
//
//        char c = 'P'; // один символ
//        boolean b_ = 5 > 3;
//
//        double d1 = 0.3 + 0.3 + 0.3;
//        double d2 = 0.9;
//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(d1 == d2);

//        System.out.println("Hello!");

//        int age = 19;
//        if (age > 80) {
//            System.out.println("Пора получать пенсию");
//        } else {
//            System.out.println("Еще живем на свои");
//        }


//        System.out.println("Bye");
    }
}
