public class ExamplesOfConstructors {
/*
в конструкторе используется ключевое слово this.
"this" по-английски — "этот, этого". Это слово указывает на конкретный предмет.
описываем Car(ExamplesOfConstructors).
--Конструктор - это специальный метод, который вызывается при создании нового объекта.
--Конструктор должен иметь одинаковое название с классом
--В одном классе может быть сразу несколько конструкторов. Создав несколько конструкторов мы можем передавать
разное количество параметров при создании объекта.
 */
    String model;
    int maxSpeed;

    public ExamplesOfConstructors(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    /*
    перевод дословно -"model для этой машины (которую мы сейчас создаем) = аргументу model, который указан в конструкторе.
 maxSpeed для этой машины (которую мы создаем) = аргументу maxSpeed, который указан в конструкторе."
     */
/*
Конструктор похож на обычный метод, но у него нет типа возвращаемого значения. При этом в конструкторе указывается
название класса, тоже с большой буквы. В нашем случае — описываем Car(ExamplesOfConstructors).
 */
    public static void main(String[] args) {
        ExamplesOfConstructors bugatti = new ExamplesOfConstructors ("Bugatti Veyron", 407);
        System.out.println(bugatti.model);
        System.out.println(bugatti.maxSpeed);
    }

//**********************************************************************************************************************


}
