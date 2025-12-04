package homework2;

public class DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new Persons());
        m(new Object());
    }

    public static void m(Object x) {
        System.out.println(x.toString());
    }
}

class GraduateStudent extends Student {
}
class Student extends Persons {
    @Override
    public String toString() {
        return "Student";
    }
}

class Persons extends Object {
    @Override
    public String toString() {
        return "Person";
    }
}
