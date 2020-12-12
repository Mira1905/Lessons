import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class KeywordsTest {

 /* Используя оператор break, можно вызвать немедленное завершение цикла, пропуская условное выражение и любой остальной
 код в теле цикла.*/

    @Test
    public void test(){

        for (int i = 0; i < 100; i++) {
            if (i == 10) break;
        }
    }

//**********************************************************************************************************************
/*boolean
true(правда) false(ложь)
с помощью if-else прописали, что при a>5, необходимо в консоль выводить true, а во всех остальных случаях -
выводить false.
циклы while и for
условные операторы if-else
более пяти*/
    static boolean moreThanFive(int a){
        if (a > 5) {
            return true;
        }
        else {
            return false;
        }
    }
/* далее вызвали метод moreThanFive()
   и по сколько 7>5, в консоли мы увидели слово true.*/

    public static void main(String[] args){
        System.out.println( moreThanFive(7) );
    }
//**********************************************************************************************************************

/*1. case - Это оператор ветви. Он позволяет идентифицировать ветви выполнения в операторе switch. Ветвь кода
идентифицируется значением выражения.
2. switch прописываем выражение для сравнения
3. Выражение в switch должно иметь тип char, byte, short, int, enum  или String. Использование любого другого типа,
например float, приведет к ошибке компиляции.
4. Оператор switch может только проверять на равенство. Такие операторы как >=, <= недопустимы.
5. Если уберем break;  программа выполнит все case после первого совпадения и до конца блока switch. */


    public static  List<String> getPlanetAtmosphere(int seqNumberFromSun) {
        List<String> result = new ArrayList<>(); //создаем объект ArrayList
        switch (seqNumberFromSun) {
            case 1: result.add("Нет атмосферы");
                break;
            case 2:
                break;
            case 4: result.add("Углекислый газ");
                break;
            case 3: result.add("Углекислый газ");
                result.add("Азот");
                result.add("Кислород");
                break;
            case 5:
            case 6: result.add("Водород");
                result.add("Гелий");
                break;
            case 7:
            case 8: result.add("Метан");
                result.add("Водород");
                result.add("Гелий");
                break;
            default:
                break;
        }
        return result;

    }
/* вызываем метод с любым параметром   */
    @Test
    public void planet(){
        System.out.println(getPlanetAtmosphere(3));
    }

//**********************************************************************************************************************
    /*
    Обработка исключений в Java основана на использовании в программе следующих ключевых слов:
try – определяет блок кода, в котором может произойти исключение;
catch – определяет блок кода, в котором происходит обработка исключения;
finally – определяет блок кода, который является необязательным, но при его наличии выполняется в любом случае независимо от результатов выполнения блока try.
Эти ключевые слова используются для создания в программном коде специальных обрабатывающих конструкций: try{}catch, try{}catch{}finally, try{}finally{}.
throw – используется для возбуждения исключения;
throws – используется в сигнатуре методов для предупреждения, о том что метод может выбросить исключение.
1. finally - Оператор позволяет выполнить код, после того, как try...catch, независимо от результата:
     */

    @Test
    public void tes2() {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Что-то пошло не так.");
        } finally {
            System.out.println("Ошибка");
        }
    }


   /*
   Если возникает ошибка, мы можем использовать ее try...catch для ее обнаружения и выполнения кода для ее обработки
    */

    @Test
    public void tes3() {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Что-то пошло не так.");

        }
    }
}
