class Student{
    String name;
    int rollNo;

    void getDetails(String n, int r) {
        name = n;
        rollNo = r;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}


class Marks extends Student {
    int mark1, mark2;

    void getMarks(int m1, int m2) {
        mark1 = m1;
        mark2 = m2;
    }

    void displayMarks() {
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Marks m = new Marks();

        m.getDetails("priya", 101);
        m.getMarks(85, 90);

        System.out.println("--- Student Details ---");
        m.displayDetails();

        System.out.println("--- Marks Details ---");
        m.displayMarks();
    }
}

    

