public class Q23_LocalInstanceVariable {
    int instanceVar = 10;

    void show() {
        int localVar = 20;
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Local variable: " + localVar);
    }

    public static void main(String[] args) {
        Q23_LocalInstanceVariable obj = new Q23_LocalInstanceVariable();
        obj.show();
    }
}
