public class EnclosingClass {
   static int countStatic =0;
   int countNonStatic = 0;

   public class NestedClass{
      void printStatic(){
         System.out.println(countStatic);
      }
   }

   /***
    * This nested class cannot access non-static members
    */
   static class StaticNestedClass{
        public void doInner(){
           System.out.println(countStatic);
        }
   }

   public static void main(String[] args) {
      EnclosingClass enclosingClass = new EnclosingClass();

      NestedClass nestedClass = enclosingClass.new NestedClass();
   }
}
