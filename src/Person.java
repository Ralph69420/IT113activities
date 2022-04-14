public class Person {
    private String name;
    private int age;
    private String address;

    Person(){
        this.name = "Ashton Cox";
        this.age = 47;
        this.address = "Roseville NH 11523";
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
}
