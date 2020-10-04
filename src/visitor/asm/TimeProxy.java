package visitor.asm;

public class TimeProxy {
    public static long time = 0;
    public static void before(){
        time = System.currentTimeMillis();
        System.out.println("Before...");
    }
    public static void after(){
        time = System.currentTimeMillis()-time;
        System.out.println("After...");
        System.out.println(time +"ms elapsed");
        time = 0;
    }
}
