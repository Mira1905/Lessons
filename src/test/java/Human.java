public  class Human {
   public String name;
    public int age;
    public boolean alive;
    public static final String SEX = "female";



   public void test() throws Exception {
       name = "Mira";
       System.out.println(name);


   }

    public void test(String name2)  throws Exception{
        System.out.println(name2);



try {
    if (name2 =="Kolia2"){
        System.out.println("Имя не Коля");
    } else {
        System.out.println("Имя Коля");
    }

} catch (Exception e) {
    throw new Exception("Програма не работает");


 }


    }
}
