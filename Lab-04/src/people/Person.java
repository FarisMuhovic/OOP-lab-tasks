package people;

public class Person {
    private String name;
    private String street;
    private int age;
    private String country;

    public Person(){}
    public Person(String n, String s) {
        this.name = n;
        this.street = s;
    }
    public String getName() {
        return this.name;
    }
    public String getStreet() {
        return this.street;
    }
    public int getAge() { return this.age; }
    public void setAge(int age){
        this.age = age;
    }
    public String getCountry() { return this.country; }
    public void setCountry(String c) {
        this.country = c;
    }

    public String toString(){
        return this.getName() + '\n' + this.getStreet();
    }
}
