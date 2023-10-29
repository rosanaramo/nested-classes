public class TestOuter {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.see();
    }
}

class Outer {
 private int x = 10;
 public void see(){
     System.out.println("Before: "+x);
     class Inner{
        public Inner(){
            System.out.println("Value after changing: "+ (x*30));
        }
     }
     Inner inner = new Inner();
 }
}
