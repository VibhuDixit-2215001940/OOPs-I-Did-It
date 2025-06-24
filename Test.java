// -------------------------------CLASS INTRO-----------------
// // Class definition
// class Class_Name {
// int a = 10;
// String name = "Rahul Gandhi";

// // Method to show values
// public void show() {
// System.out.println(a + " " + name);
// }
// }

// // Main class
// public class Test {
// public static void main(String[] args) {
// // Object creation
// Class_Name obj = new Class_Name();
// obj.show(); // Output: 10 Rahul Gandhi
// }
// }

// ----------------------------CONSTRUCTOR-----------------
// class Rampo {
// int a;

// Rampo() {
// a = 10;
// }

// public void show() {
// System.out.println(a);
// }
// }

// class Test {
// public static void main(String[] args) {
// System.out.println("We are learning constructor:---");
// Rampo a = new Rampo();
// a.show();
// }
// }

// ---------------------------DEFAULT CONSTRUCTOR------------
// every class in java has a default constructor that is made by compiler if not
// already present ....... and that constructor assigns default value too the
// vars that might present in that class!!!!!!!
// class Demo {
// int a;
// String str;

// // Demo() { //Behind the scene compiler made it by default and initialise
// // default values!!
// // a = 0;
// // str = null;
// // }

// public void show() {
// System.out.println(a + " " + str);
// }
// }

// class Test {
// public static void main(String[] args) {
// Demo a = new Demo();
// a.show();
// }
// }

// -----------------------------PARAMETERIZED CONSTRUCTOR--------------
// class Learn {
// int x, y;

// Learn(int a, int b) {
// x = a;
// y = b;
// System.out.println(a + b);
// }

// Learn(int a, String str) {
// System.out.println(a + " " + str);
// }
// }

// class Test {
// public static void main(String[] args) {
// Learn a = new Learn(10, 20);
// Learn b = new Learn(10, "Vibhu");
// }
// }
// --------------------COPY Constructor---------------------
// class A {
// int a, b;

// A(int x, int y) {
// a = x;
// b = y;
// System.out.println(a + b);
// }

// A(A ref) {
// a = ref.a;
// b = ref.b;
// System.out.println(a + b);
// }
// }

// class Test {
// public static void main(String[] args) {
// A r = new A(10, 20);
// A r2 = new A(r);
// }
// }
// ------------------PRIVATE CONSTRUCTOR----------------------
// class A {
// int b;

// private A(int a) {
// b = 100;
// System.out.println(a);
// }

// public void main(String[] args) {
// System.out.println(b);
// }
// }

// class Test {
// public static void main(String[] args) {
// A a = new A(10);
// }
// }

// ------------------------CONSTRUCTOR OVERLOADING_-----------
class A {
    double a;
    boolean f;

    A(int a) {
        System.out.println(a);
    }

    A(int a, String str) {
        System.out.println(a + " " + str);
    }

    A(double x, boolean y) {
        a = x;
        f = y;
    }
}

class Test {
    public static void main(String[] args) {
        A r = new A(10);
        A r2 = new A(10, "Vibhu");
        A r3 = new A(10.5, false);
        System.out.println(r3.a + " " + r3.f);
    }
}