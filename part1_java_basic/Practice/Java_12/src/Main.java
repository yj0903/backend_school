// Java 프로그래밍 - 내부 클래스

class Outer {
    public void print(){
        System.out.println("Outer.print");
    }

    class Inner {
        public void innerPrint(){
            Outer.this.print();
        }
    }


}


public class Main {

    public static void main(String[] args) {

//      외부 클래스

//      내부 클래스 - 인스턴스

//      내부 클래스 - 정적

//      익명 클래스


    }

}
