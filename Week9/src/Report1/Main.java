package Report1;

abstract class Human {
    abstract void greet();
}

class Japanese extends Human {
   @Override
   void greet() {
       System.out.println("こんにちは");
   }
}

class Korean extends Human {
   @Override
   void greet() {
       System.out.println("안녕하세요");
   }
}

class Vietnamese extends Human {
   @Override
   void greet() {
       System.out.println("xin chào");
   }
}

class Mongolian extends Human {
   @Override
   void greet() {
       System.out.println("Сайн уу");
   }
}



public class Main { 
    public static void main(String[] args) {

        Human japanese = new Japanese();
        Human korean = new Korean();
        Human vietnamese = new Vietnamese();
        Human mongolian = new Mongolian();

        japanese.greet();
        korean.greet();
        vietnamese.greet();
        mongolian.greet();
    }
}

