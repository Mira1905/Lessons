public class Reading {

public static void main(String[]args) {
    Book book = new Book();

    System.out.println("Петя читает  книгу " + book.getNameOfTheBook1() + " на последней  " + book.getPageJava() + " странице");
    System.out.println("А Вася говорит что читае книгу " + book.getNameOfTheBook1() + " на " + book.getPageJavaTwo() + " странице");
    book.setPageJava((byte) 200);
    System.out.println("Еще Петя закончил читать книгу " + book.getNameOfTheBook2() + " в которой " + book.getPage1World() + " страниц");
    System.out.println("Но Васе не очень интресна такая литература, но он сказал Пете что читает  " + book.getNameOfTheBook2() + " на " + book.getPage1WorldTwo() + " странице");
    book.setPage1World(4000);
    }


}
