package ru.synergy.encapsulationTest;

public class Main {

    public static final Integer MAGNIFIER = 10000;



    public  static  void main(String[] args) throws Exception{
        Person person = new Person("Sergey", 28, "Proletarskaya 10", "88005554411");
        Person.getCounter();
        Fraction fraction = new Fraction(1, 10);

    }


}



class Person{
    int id;
    private String name;
    private   int age;
  //  public String address;
   // private String phone;

    private static int counter = 0;

    public static int getCounter() {
        return counter;
    }

    static {
        System.out.println(counter);
    }


    public Person(String name, int age, String address, String phone) {
        id = counter++;
        this.name = name;
        this.age = age;
        //this.address = address;
        //this.phone = phone;
    }

  /*  public void displayName(){
        System.out.printf("Name %s \n", name);
    }

    void displayAge(){
        System.out.printf("Age %d \n", age);
    }


    private void displayAddress(){
        System.out.printf("Address %s \n", address);
    }

    protected void displayPhone(){
        System.out.printf("Phone %s \n", phone);
    }
*/

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >0 && age <110)
        this.age = age;
    }
}



class Fraction{
    int numerator;
    int denominator = 1;


    public Fraction(int numerator, int denominator){
        if (denominator == 0){
            System.out.println("Denominator can't be zero");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;



    }


}



