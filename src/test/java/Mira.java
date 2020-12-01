import org.testng.annotations.Test;

public class Mira {
    Human human = new Human();

    @Test
    public void test(){
        human.test();
    }

    public static void main(String[]args){
        Human human = new Human();
        human.test("Jora");

    }


}
