package rvt;

public class Student {
    
    private String name;
    private int age;

    public String getName() {
        
        return this.name;
    }

    public int getAge() {

        return this.age;
    }


    public static void main(String[] args) {
        Student s1 = new Student("John");
        s1.toString();
        System.out.println(s1.name);
    }

    public void Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }

    public Student(String n) {
        name = n;
    }


}
    