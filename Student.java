class class Student {

int id;
String name;

Student() {
this(101, "Rishikesh"); // calls parameterized constructor
System.out.println("Default Constructor Called");
}

// Parameterized constructor
Student(int id, String name) {
this.id = id;
this.name = name;
System.out.println("Parameterized Constructor Called");
}

void display() {
System.out.println(id + " " + name);
}

public static void main(String[] args) {
Student s = new Student();
s.display();
}
}