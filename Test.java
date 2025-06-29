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

// // ------------------------CONSTRUCTOR OVERLOADING_-----------
// class A {
// double a;
// boolean f;

// A(int a) {
// System.out.println(a);
// }

// A(int a, String str) {
// System.out.println(a + " " + str);
// }

// A(double x, boolean y) {
// a = x;
// f = y;
// }
// }

// class Test {
// public static void main(String[] args) {
// A r = new A(10);
// A r2 = new A(10, "Vibhu");
// A r3 = new A(10.5, false);
// System.out.println(r3.a + " " + r3.f);
// }
// }

// --------------------STATIC BLOCK------------------
// class Test {
// public static void main(String[] args) {
// Test t = new Test();
// }

// Test() {
// System.out.println(3);
// }

// {
// System.out.println(2);
// }
// static {
// System.out.println(1);
// }
// }

// ---------------------INSTANCE BLOCK-----------------
// class Test {
// {
// System.out.println(1);
// }

// public static void main(String[] args) {
// // Test t = new Test(); //Without object creation it cn't be executed!!
// System.out.println(2);
// }
// }

// --------------Instance & Static Block --------------------
// class Test {
// int a = 10;
// static String str = "Vibhu";
// {
// System.out.println(a + " " + str);
// }
// static {
// System.out.println(a + " " + str);//Here static block only access static or
// var created inside its block!!
// }

// public static void main(String[] args) {
// Test t = new Test();
// // System.out.println(a + " " + str);
// }
// }

// ------------------------RETURN TYPE--------------
// class Test {
// public static void main(String[] args) {
// Test t = new Test();
// System.out.println(a);//20
// }

// static int a = 10;
// {
// a = 20;
// int b = 10;
// System.out.println(a);//20
// System.out.println("Omg");
// return void;//Doesn't return anything
// }
// }

// ----------------------INHERITANCE TYPES-------------
// ----------------------SIMPLE INHERITENCE(1SP&1SC)-------------------
// class A { // SUPER CLASS
// int roll;
// String name;

// void display() {
// System.out.println("Enter roll no. and name: ");
// }
// }

// class Test extends A { // SUB CLASS
// void put() {
// roll = 10;
// name = "Vibhu";
// System.out.println(roll + " " + name);
// }

// public static void main(String[] args) {
// Test t = new Test();// Object always made of subclass
// t.display();// Can access methods of super class tooo
// t.put();
// }
// }

// ---------------SIMPLE INHERITENCE WITH PRIVATE MEM-----
// Private memebers can't be access aoutside of superclass but protected can be
// class A { // SUPER CLASS
// protected int roll;
// private String name;

// void display() {
// System.out.println("Enter roll no. and name: ");
// }
// }

// class Test extends A { // SUB CLASS
// void put() {
// roll = 10;
// name = "Vibhu";// WILL GIVE ERROR
// System.out.println(roll + " " + name);
// }

// public static void main(String[] args) {
// Test t = new Test();// Object always made of subclass
// t.display();// Can access methods of super class tooo
// t.put();
// }
// }

// -----------------------MULTILEVEL INHERITENCE (1SP & ManySC)------------
// class Add {
// int a = 10, b = 20;

// void add() {
// System.out.println("Addition: " + (a + b));
// }
// }

// class Subtract extends Add {
// void subtract() {
// System.out.println("Subtraction: " + (b - a));
// }
// }

// class Multiply extends Subtract {
// void multiply() {
// System.out.println("Multiply: " + (a * b));
// }
// }

// class Divide extends Multiply {
// void divide() {
// System.out.println("Divide: " + (b / a));
// }
// }

// class Test extends Divide {
// public static void main(String[] args) {
// Test t = new Test();
// t.add();
// t.subtract();
// t.multiply();
// t.divide();
// }
// }

// ----------------MULTIPLE INHERITANCE(Java doesn't support)------------
// class A{
// void xyz(){
// System.out.println("Mai kya karu abb !!");
// }
// }
// class B{
// void xyz(){
// System.out.println("Mai kya karu abb !!");
// }
// }
// class Test extends A,B{//Giving error
// public static void main(String args[]){

// }
// }

// -----------------HIERARCHICAL INHERITANCE------------------------
// class Student {
// int roll;
// String name;

// void display() {
// System.out.println("I am a student!!");
// }
// }

// class Ankit extends Student {
// Ankit() {
// roll = 10;
// name = "Ankit";
// }

// void naam() {
// System.out.println("Mera naam hai " + name + " " + roll);
// }
// }

// class Parul extends Student {
// Parul() {
// roll = 69;
// name = "Parul";
// }

// void naam() {
// System.out.println("Mera naam hai " + name + " " + roll);
// }
// }

// public class Test {
// public static void main(String[] args) {
// Parul p = new Parul();
// p.display();
// p.naam();

// Ankit a = new Ankit();
// a.display();
// a.naam();
// }
// }

// ---------------------SUPER KEYWORD----------------------
// class A {
// int a = 10;
// }

// class B extends A {
// int a;

// B() {
// a = 20;
// }

// void display() {
// System.out.println(a);// It refers to same class var "a"
// System.out.println(super.a);// Now it refers to super class var "a"
// }
// }

// class Test {
// public static void main(String[] args) {
// B t = new B();
// t.display();
// int a = 100;
// System.out.println(super.a);//Can't be use in a static method!!
// }
// }

// ------------------------THIS KEYWORD--------------------
// class Test {
// void Test() {
// System.out.println(this);// Test@4617c264
// }

// public static void main(String[] args) {
// Test r = new Test();
// System.out.println(r);// Test@4617c264
// r.Test();
// // System.out.println(this);//this can't be use in static method.
// }
// }

// class Test {
// int a = 10;

// Test(int a) {
// a = this.a;
// System.out.println(a);
// }

// public static void main(String[] args) {
// Test t = new Test(20);
// }
// }

// --------------------------THIS KEYWORD FOR CALLING DEFAULT
// CONSTRUCTOR--------
// class Test {
// int a = 10;

// Test() {
// // a = 20;
// System.out.println(a);
// }

// Test(int a) {
// // this();
// System.out.println(a);
// this.a = a;
// this();// This will give error as
// }

// public static void main(String[] args) {
// Test t = new Test(20);
// }
// }

// ------------------------------METHOD OVERLOADING---------------------
// -----------------(Compile Time Polymorphism)----------------------
// class Test {
// void add() {
// int a = 10, b = 20;
// System.out.println(a + b);
// }

// int add(int a) {
// int b = 10;
// return a + b;
// }

// String add(int a, int b) {
// System.out.println(a + b);
// return "Hello";
// }

// public static void main(String[] args) {
// Test t = new Test();
// t.add();
// System.out.println(t.add(10));
// System.out.println(t.add(10, 20));
// }
// }

// ----------------------METHOD OVERRIDING-------------------
// -----------------(Runtime Polymorphism)-------------------
// class A {
// void display() {
// System.out.println("Kya dekh raha hai bhadwe!!");
// }
// }

// class B extends A {
// // @Override
// void display() {
// System.out.println("Haan bhai kesse ho!!");
// }
// }

// class Test {
// public static void main(String[] args) {
// A t = new B();
// t.display();
// }
// }

// -------------------ENCAPSULATION------------------------
// class B {
// private int a;

// public void setValue(int x) {
// a = x;
// }

// public int getValue() {
// return a;
// }
// }

// class Test {
// public static void main(String[] args) {
// B t = new B();
// // t.a = 10;
// // System.out.println(t.a);
// t.setValue(100);
// System.out.println(t.getValue());
// }
// }

// -------------------ABSTRACT CLASS---------------
// abstract class A {
// void display() {
// System.out.println("Le kutte mai abstractt class use kar raha!!");
// }
// }

// class B extends A {

// }

// class Test {
// public static void main(String[] args) {
// // A t = new A();// Cannot instantiate the type A
// A t = new B();
// t.display();
// }
// }

// ----------------------ABSTRACT METHOD-------------------
// abstract class Fruit {// As one method is abstract thus its compulsory to
// made class also abstract
// abstract public void taste();// Here we don't have specific fruit to tell its
// taste thus make this abstract
// // and in further code we canimplement it in sub class!!
// }

// class Apple extends Fruit {
// @Override
// public void taste() {
// System.out.println("Meetha!!!");
// }
// }

// public class Test {

// public static void main(String[] args) {
// Apple a = new Apple();
// // Fruit f = new Fruit();//Can't create object of abstract class
// a.taste();
// }
// }

// // ------------------ABSTRACT METHOD(for diff code implementation)------
// abstract class Add {
// abstract public int add(int a, int b); // Abstract method
// }

// class AddWithoutPlus extends Add {
// @Override
// public int add(int a, int b) {
// while (b != 0) {
// int carry = a & b;
// a = a ^ b;
// b = carry << 1;
// }
// return a;
// }
// }

// public class Test {
// public static void main(String[] args) {
// Add obj = new AddWithoutPlus();
// System.out.println(obj.add(5, 7)); // Output: 12
// }
// }

// -----------------------------INTERFACE--------------
// import java.util.*;

// interface client {
// void input();

// void output();
// }

// class Raju implements client {
// String name;

// public void input() {//SHOULD BE COMPULSORY A PUBLIC as in inter face methods
// are by-default "public+final"
// Scanner sc = new Scanner(System.in);
// System.out.println("Naam likh bhadwe!!");
// name = sc.next();
// }

// public void output() {//SHOULD BE COMPULSORY A PUBLIC
// System.out.println("Tera naam hai bhadwa " + name);
// }

// }

// public class Test {
// public static void main(String[] args) {
// Raju r = new Raju();
// r.input();
// r.output();
// }

// }

// -----------------INTERFACE VARS(public+static+final)-------------
// interface A {
// // int a;//Will give as it is by-default "final" thus have to declare and
// // initialise at the same time
// int a = 10;
// }

// class Test {
// public static void main(String[] args) {
// System.out.println(A.a);// Can be access wiythout making an object thus
// "static"
// // Also it is available to use outside interface thus public
// }
// }

// -----------------INTERFACE METHOD(public+abstract)-----------------
// interface A {
// void m1();
// }

// class B implements A {
// // void m1() {//Cannot reduce the visibility of the inherited method from A
// // System.out.println("Hello");
// // }
// public void m1(){
// System.out.println("Hello");
// }
// }

// class Test {
// public static void main(String[] args) {
// A a = new A();//Cannot instantiate the type A....as its abstract

// }
// }

// -----------------INTERFACE JDK1.8(default,static)--------------
// interface A {
// void m1();

// void m2();

// default void m3() {
// System.out.println("I am created newly and don't need to implement in all sub
// class!!");
// }
// }

// class B implements A {
// public void m1() {
// System.out.println("B implements A in m1");
// }

// public void m2() {
// System.out.println("B implements A in m2");
// }
// }

// class C implements A {
// public void m1() {
// System.out.println("C implements A in m1");
// }

// public void m2() {
// System.out.println("C implements A in m2");
// }
// }

// class Test {
// public static void main(String[] args) {
// B b = new B();
// b.m1();
// b.m2();
// C c = new C();
// c.m1();
// c.m2();
// c.m3();
// }
// }

// ------------------INTERFACE(static)------------------------
// interface B {
// static void m1() {// Has to implement in the same class
// System.out.println("Mai intercae B ke m1 mai hoo!!");
// }
// }

// class C implements B {
// public static void m1() {
// System.out.println("Bhadwe!!!!!!");
// }
// }

// class A {
// public static void m1() {
// System.out.println("Mai class A ke m1 mai hoo!!");
// }

// public static void m2() {
// System.out.println("Mai class A ke m2 mai hoo!!");
// }
// }

// class Test {
// public static void main(String[] args) {
// A.m1();// But sub class can implement it
// A.m2();// Don't need to create object
// B.m1();// Overriden to sub class is not allowed!!
// C.m1();
// }
// }

// ----------------OVERRIDE ANOTATION-----------------
// class A {
// public void m1() {
// System.out.println("Mai m1 mai hoo !!!");
// }
// }

// class B extends A {
// @Override
// public void m1() {
// System.out.println("Mai m1 mai hoo !!!");
// }
// }

// class Test {
// public static void main(String[] args) {
// B b = new B();
// b.m1();
// }
// }

// -------------------------COVARIENT RETURN TYPE-----------------
// class A {
// A show() {
// System.out.println("I am in A");
// return this;// this refers to current object
// // return new A(); will be same as upper
// }
// }

// class B extends A {
// @Override
// B show() {
// super.show();
// System.out.println("I am in B");
// return new B();
// }
// }

// class Test {
// public static void main(String[] args) {
// B b = new B();
// b.show();
// }
// }

// ----------------------var args-----------------------
// class A {
// void add(int... arr) {// Here arr is an 1D array
// int sum = 0;
// for (int x : arr) {
// sum += x;
// }
// System.out.println(sum);
// }
// }

// class Test {
// public static void main(String[] args) {
// A a = new A();
// // a.add(null);
// a.add(10);
// a.add(10, 20);
// a.add(10, 20, 30);
// a.add(10, 20, 30, 40);
// }
// }

// -------------------EXCEPTION HANDLING----------------------
// class Test {
// // public static void main(String[] args) {
// // int a = 10, b = 0, c = 0;
// // c = a / b;//Exception in thread "main" java.lang.ArithmeticException: / by
// // zero
// // System.out.println(c);
// // }
// public static void main(String[] args) {
// int a = 10, b = 0, c = 0;
// try {
// c = a / b;
// System.out.println(c);
// } catch (Exception e) {
// System.out.println(e);// java.lang.ArithmeticException: / by zero
// }
// }
// }

// ------------------------Exception Heirarchy---------------
// -----------------------NULLPOINTEREXCEPTION---------------------
// class Test {
// public static void main(String[] args) {
// String str = null;
// try {
// System.out.println(str.toLowerCase());
// } catch (Exception e) {
// System.out.println("Bhadwee");
// }
// }
// }

// ---------------------