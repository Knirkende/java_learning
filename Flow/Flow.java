public class Flow {
    public static void main(String[] args) {
        
        //ternary operator
        boolean aVar = false;
        boolean invertVar = aVar ? false : true;

        if (invertVar) {
            System.out.println("Yep, true");
        }
        else {
            System.out.println("Nope, false");
        }
    }
}