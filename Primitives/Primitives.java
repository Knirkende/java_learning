public class Primitives {
    public static void main(String[] args) {
        //integers
        int myMinInt = Integer.MIN_VALUE;
        int myMaxInt = Integer.MAX_VALUE;
        
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;

        //type casting
        int anInt = 2;
        byte castThing = (byte)(anInt / 2);

        //float and double
        float myFloat = 0.2f;
        double myDouble = 0.2d;

        System.out.println(myFloat * myDouble);
        System.out.println(myDouble * myDouble);

        System.out.println(convertType(2, true));
        System.out.println(convertType(2, false));


        //string, char and boolean
        String myString = "something"; //not actually a primitive type
        char myChar = 'a';
        boolean myBool = true;

    }

    public static double convertType(int val, boolean poundInp) {
        if (poundInp == true) {
            return val * 0.45359237d;
        }
        return val / 0.45359237d;
    }
}