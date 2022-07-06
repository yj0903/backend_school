// Java 프로그래밍 - 다형성

class Person { // 부모클래스
    public void print() {
        System.out.println("Person.print");
    }
}

class Student extends Person { //자식클래스

    public void print() { //오버라이딩
        System.out.println("Student.print");
    }

    public void print2() {
        System.out.println("Student.print2");
    }
}

class CollegeStudent extends Person {

    public void print() { //오버라이딩
        System.out.println("CollegeStudent.print");
    }
}


public class Main {

    public static void main(String[] args) {

//      1. 다형성
        System.out.println("== 다형성 ==");
        Person p1 = new Person(); //person 클래스
        p1.print(); //Person.print
        Student s1 = new Student(); // student 클래스
        s1.print(); //Student.print
        s1.print2(); //Student.print2

        Person p = new Student(); // 다형성
        p.print(); // Student.print
//        p.print2(); // 안되는 이유? person를 상속받았는데 부모클래스에 print2가 없으므로 제한됨.
//        CollegeStudent c1 = new Student(); // 같은 부모 상속한 자식클래스 간 다형성 안됨.


//      2. 타입 변환
        System.out.println("== 타입 변환 ==");
        Person pp1 = null;
        Student ss1 = null;

        Person pp2 = new Person();
        Student ss2 = new Student();
        Person pp3 = new Student(); //업캐스팅 다형성

        pp1 = pp2; // 됨. 같은 형
        ss1 = ss2; // 됨. 같은 형
//        ss1 = pp3; // 안 됨. 형이 다르다.
        ss1 = (Student)pp3; //됨. 다운캐스팅




//      3. instanceof
        System.out.println("== instanceof ==");
        Person pe1 = new Person();
        Student st1 = new Student();
        Person pe2 = new Student();
        Person pe3 = new CollegeStudent();

        System.out.println(pe1 instanceof Person); // True
        System.out.println(pe1 instanceof Student); // False

        System.out.println(st1 instanceof Person); // True!!!!!!! 업캐스팅
        System.out.println(st1 instanceof Student); // True

        System.out.println(pe2 instanceof Person); // True
        System.out.println(pe2 instanceof Student); // True

        System.out.println(pe3 instanceof Person); // True
        System.out.println(pe3 instanceof CollegeStudent); // True



    }
}
