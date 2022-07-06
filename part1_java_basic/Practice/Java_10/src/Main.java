// Java 프로그래밍 - 추상 클래스

// 추상 클래스 Person
abstract class Person{
    abstract void printInfo();
}


// 추상 클래스 상속
class Student extends Person {

    public void printInfo(){
        System.out.println("Student.printInfo");
    }
}

public class Main {

    public static void main(String[] args) {
        
        // 추상클래스는 바로 객체선언 불가.
        // Person p1 = new Person();

        // 상속받은 클래스는 가능.
        Student s1 = new Student();
        s1.printInfo();


        // 익명 클래스로 만들어서 직접 선언해서 쓰는 방법.
        Person p2 = new Person() {
            @Override
            void printInfo() {
                System.out.println("Main.printInfo");
            }
        };


    }

}
