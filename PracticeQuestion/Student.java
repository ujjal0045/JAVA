package PracticeQuestion;

public class Student {
  int rollno, marks;
  String name;

  Student() {
    this.rollno = 101;
    this.name = "Rahul";
    this.marks = 60;
  }

  Student(int rollno, String name) {
    this.rollno = rollno;
    this.name = name;
    this.marks = 60;
  }

  Student(int rollno, int marks, String name) {
    this.rollno = rollno;
    this.name = name;
    this.marks = marks;
  }

  void display() {
    System.out.println("Rollno: " + rollno + ", Name: " + name + ", Marks: " + marks);
  }

  public static void main(String[] args) {
    Student s1 = new Student();
    s1.display();
    Student s2 = new Student(102, "ujjal");
    s2.display();
    Student s3 = new Student(103, 99, "Moumita");
    s3.display();
  }
}
