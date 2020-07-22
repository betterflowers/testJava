package practice04;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        String showName = "My name is "+this.name+". ";
        String showAge = "I am "+this.age+" years old.";
        String totalString = showName+showAge;
        return totalString;
    }

}
