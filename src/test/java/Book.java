
public class Book {

     /**
      Это конструктор
      */
     public Book() {
          System.out.println("Чтение книг Петей и Васей:)");
          return;
     }

     /**
      * В конструкторе допускается использование оператора
      * return без параметров.
      */


     private String nameOfTheBook1 = "StudyJava";//переменная с типом string - сылочная
     private String authorBookJava = "WilliamWilson";//переменная с типом string - сылочная
     private  String nameOfTheBook2 = "ExploringTheWorld"; //переменная с типом string - сылочная
     private String authorBookWorld = "MeghanMarkle";//переменная с типом string - сылочная
     private  byte pageJava = 100; //переменная с типом byte - примитивные
     private  int pageJavaTwo = 200;
     private  int page1World = 3000; //переменная с типом int - примитивные
     private  int page1WorldTwo = 4000;


     public String getNameOfTheBook1() { return nameOfTheBook1; }

     public String getNameOfTheBook2() { return nameOfTheBook2; }

     public byte getPageJava() { return pageJava; }

     public int getPage1World() { return page1World; }

     public int getPageJavaTwo() { return pageJavaTwo; }

     public int getPage1WorldTwo() { return page1WorldTwo; }




     public void setPageJava(byte pageJava) {
          if (pageJava>= 200) {
          this.pageJava = pageJava;
          } else {
               System.out.println("Ошибка! Вася не может читать эту книгу на 200 странице потому-что страниц всего 100!!");
          }
     }



     public void setPage1World(int page1World) {
          if (page1World <= 3000) {
          this.page1World = page1World;
          } else {
               System.out.println("Ошибочка выходит, так как страниц всего 3000 а Петя говорит что читает на 4000!! ");
          }
     }
/**

Разница в том, что сеттер — это полноценный метод. А в метод, в отличие от поля, ты можешь заложить необходимую
тебе логику проверки, чтобы не допустить неприемлемых значений.

 Геттер - это метод возвращающий значение некоего свойства класса, а сеттер соответственно то что устанавливает
  свойство класса.
  “get” — “получать”
  set — “устанавливать”

  getter позволяет получить значения (читать значения), а setter - записать значения в переменную.
  В коде они представляют собой обычные методы. Но имя метода всегда начинается с префикса get или set.
 */

}


