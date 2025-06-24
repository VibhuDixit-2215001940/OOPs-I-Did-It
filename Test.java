// Class definition
class Class_Name {
    int a = 10;
    String name = "Rahul Gandhi";

    // Method to show values
    public void show() {
        System.out.println(a + " " + name);
    }
}

// Main class
public class Test {
    public static void main(String[] args) {
        // Object creation
        Class_Name obj = new Class_Name();
        obj.show(); // Output: 10 Rahul Gandhi
    }
}
