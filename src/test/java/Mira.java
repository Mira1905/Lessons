import org.testng.annotations.Test;

public class Mira extends Human{

    final String name = "Tolik";

    Human human = new Human();



    @Test
    public void test() throws Exception {
        int i;
        for (i=0;i<3;i++){
            System.out.println("Попытка "+i);
            human.test("Мира");
        }


    }

    public static void main(String[]args) throws Exception {
        Human human = new Human();
        human.test("Jora");
        

    }



    @Test
    public void test2() throws Exception {

        int i = 0;
        while (i < 3) {
            System.out.println("Попытка" + i);
            human.test("Мира");

            i = i = 1;

        }
    }


        @Test
        public void test3(){
            System.out.println(name);
            System.out.println(Human.SEX);
        }




        }



