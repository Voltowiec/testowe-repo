public class StackTraceExapmple {
    public static void main(String[] args) {
        StackTraceExapmple stackTraceExapmple = new StackTraceExapmple();
        stackTraceExapmple.method1();

    }
    void method1() {
        method2();
    }
    void method2() {
        method3();
    }
    void method3() {
        throw new RuntimeException("BUM!");
    }
}
