class Empregado {
   public void trabalhar() {
       System.out.println("trabalhar");
   }
}

class QuadroFuncionario {
   Empregado mgr  = new Empregado() {
      public void trabalhar() {
         System.out.println("mandar");
      }
   };

   Empregado peao = new Empregado() {
      public void trabalhar() {
         System.out.println("executar");
      }
   };
}
class Teste{
   public static void main(String[] args) {
      QuadroFuncionario funcionario = new QuadroFuncionario();
      funcionario.peao.trabalhar();
   }
}
