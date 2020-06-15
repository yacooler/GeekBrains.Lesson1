public class GbLesson1 {

    public static void main(String[] args) {

        byte byteVal = 33;
        short shortVal = 12000;
        int intVal = 78912;
        long longVal = 9912312312L;
        float floatVal = -98.371F;
        double doubleVal = 1112211102.999812312312D;
        char charVal = 'P';
        boolean booleanVal = true;


        System.out.println(calcExp(3F, 7F, 10F, 1.5F));

        System.out.println(checkSumValue(7,13));
        System.out.println(checkSumValue(-10,19));
        System.out.println(checkSumValue(14,23));

        printPosNeg(-33);
        printPosNeg(0);
        printPosNeg(8);

        System.out.println(isNegative(-1));
        System.out.println(isNegative(0));
        System.out.println(isNegative(1));

        printHelloName("Benedict Timothy Carlton Cumberbatch");

        printLeapYear(1200);
        printLeapYear(1400);
        printLeapYear(2020);
    }

    public static float calcExp(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    public static boolean checkSumValue(int a, int b){
        int sumVal;
        sumVal = a + b;
        return (sumVal >= 10 && sumVal <= 20);
    }

    public static void printPosNeg(int val){
        System.out.print(val);
        if(val < 0){
            System.out.println(" is negative");
        } else {
            System.out.println(" is positive");
        }
    }

    public static boolean isNegative(int val){
        return (val < 0);
    }

    public static void printHelloName(String name){
        System.out.println("Привет, " + name);
    }

    public static void printLeapYear(int year){
        //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
        System.out.print(year);
        if ((year % 4 == 0) && ((year % 100 != 0 )||(year % 400 == 0))) {
            System.out.println(" високосный");
        } else {
            System.out.println(" не високосный");
        }
    }



}
