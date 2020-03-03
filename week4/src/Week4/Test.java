package Week4;

public class Test {
    public static void main(String[] args) {
        PhysicsTeacher pt1 = new PhysicsTeacher("Ali", "Veli");
        PhysicsTeacher pt2 = pt1;
        PhysicsTeacher pt3 = new PhysicsTeacher("Ahmet", "Mehmet");
        pt1.printProperties();
        pt2.printProperties();
        pt3.printProperties();

        MathTeacher mt1 = new MathTeacher("Ayse","Fatma");
        Teacher mt2 = new MathTeacher("John","Tom");
        Object mt3 = new MathTeacher("xx","yy");
        mt1.printProperties();
        mt2.printProperties();
        ((Teacher)mt3).printProperties();
    }
}
