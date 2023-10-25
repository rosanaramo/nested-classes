public class EnclosingClass {
   static int countStatic =12;
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


}
