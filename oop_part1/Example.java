public class Example {
    public int beep = 1; // accessible everywhere
    protected int boop = 2; // accessible to this package and subclasses elsewhere
    int meep = 3; // package access
    private int moop = 4; // only accessible by this class
    
    public static boolean top = true; // static, common for all instances

    public int getMoop() {
        return moop;
    }

    public void setMoop(int moop) {
        this.moop = moop;
    }
    
}
