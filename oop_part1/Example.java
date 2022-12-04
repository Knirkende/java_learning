public class Example {
    public int beep; // accessible everywhere
    protected int boop; // accessible to this package and subclasses elsewhere
    int meep = 3; // package access
    private int moop = 4; // only accessible by this class

    public static boolean top = true; // static, common for all instances

    public Example(int beep, int boop) { // this is a constructor
        this.beep = beep;
        this.boop = boop;
    }

    public Example() { // constructor chaining
        this(0, 0);
    }

    public int getMoop() {
        return moop;
    }

    public void setMoop(int moop) {
        this.moop = moop;
    }

}
