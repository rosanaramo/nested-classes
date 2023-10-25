public class TestEnclosingClass {
    public static void main(String[] args) {
        EnclosingClass enclosingClass = new EnclosingClass();
        EnclosingClass.NestedClass nestedClass = enclosingClass.new NestedClass();
        nestedClass.printStatic();
    }

}
