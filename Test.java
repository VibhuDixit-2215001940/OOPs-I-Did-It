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

// ---------------------