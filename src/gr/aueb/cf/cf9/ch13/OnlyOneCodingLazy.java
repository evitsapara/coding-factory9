package gr.aueb.cf.cf9.ch13;

public class OnlyOneCodingLazy {
    private static OnlyOneCodingLazy instance; // = null

    private OnlyOneCodingLazy() {}

    public static OnlyOneCodingLazy getInstance() {
        if (instance == null) {
            instance = new OnlyOneCodingLazy();
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello Coding Factory");
    }
}
