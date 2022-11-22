public class Flow {
    public static void main(String[] args) {
        
        // ternary operator
        boolean aVar = false;
        boolean invertVar = aVar ? false : true;

        if (invertVar) {
            System.out.println("Yep, true");
        }
        else {
            System.out.println("Nope, false");
        }

        char c = 'A';
        // switch
        
        switch(c) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Yep");
                break;
            default:
                System.out.println("Nope");
                break;
        }
        
        // for
        for (int i = 1; i < 5; i++) {
            System.out.println((i));
        }

        // while
        int i = 0;
        while(i < 6) {
            System.out.println(i);
            i++;
        }
    
        // do while
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 6);

    }
        
}