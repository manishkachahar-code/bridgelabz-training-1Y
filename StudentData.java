Encapsulation example:


public class StudentData {

// private data (hidden)
private int marks;

// setter method (write data)
public void setMarks(int m) {
if(m >= 0) {
marks = m;
}
}

// getter method (read data)
public int getMarks() {
return marks;
}
}



public class EncapsulationExample {
public static void main(String[] args) {

StudentData s = new StudentDAta();

s.setMarks(90);
System.out.println(s.getMarks());

// s.marks = 100;
}
}