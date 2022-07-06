// Java 프로그래밍 - 상속

class Person {
    // 접근제어자(public, private, default)
    String name;
    int age;
    public int a1;
    private int a2;

    Person() {}
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printInfo() {
        System.out.println("Person.printInfo");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}

// Student 클래스 - Person 상속, 접근제어자 확인
class Student extends Person {
    Student(){ //생성자
        a1=1;
//        a2=1; // 접근제어자 private 접근 불가
    }
}

// Student2 클래스 - Person 상속, super 사용, 오버라이딩
class Student2 extends Person {
    String name;
    int stdId;

    Student2(String name, int age, int stdId) { // 생성자
        this.name = name; //Student2의 name
        this.age = age; //Person의 age
        this.stdId = stdId; // Student2의 stdId
        // 만약 Person의 name에 접근하려고 하면,
        // super.name = name 으로 사용해야 한다.
    }

    // 오버라이딩
    public void printInfo(){
        System.out.println("Student2.printInfo");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("stdId: " + stdId);
    }
}


public class Main {

    public static void main(String[] args) {

//      Test code
//      1. 상속: Student 클래스에 선언을 따로 하지 않았어도 Person 상속 받았기 때문에 Person 코드 실행됨.
        System.out.println("=============");
        Student s1 = new Student();
        s1.name = "a";
        s1.age = 25;
        s1.printInfo();


//      2. super, super(), 오버라이딩
        System.out.println("=============");
        Student2 s2 = new Student2("b",32, 1);
        s2.printInfo();
    }
}
