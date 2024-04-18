package exam01;

public class Car {

    String Name;

    String Color;

    boolean Gasoline;

   

    void Run() {

         if (Gasoline) {

             System.out.println("부릉 부릉");

         } else {

             System.out.println("덜컹 덜컹");

         }

    }

    void Stop() {

         System.out.println("끼이익");

    }

}