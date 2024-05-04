import java.util.List;

public class Main {
    public static void main(String[] args) {

        class Student {
            public String fname;
            public String lname;
            public int indexNumber;
            public String email;
            public String address;
            public List<Integer> grades;
            public StudentGroup group;

            public Student(String fname, String lname, int indexNumber, String email, String address,
                           List<Integer> grades) {
                this.fname = fname;
                this.lname = lname;
                this.indexNumber = indexNumber;
                this.email = email;
                this.address = address;
                this.grades = grades;

            }

            class StudentGroup {
                public String nazwa;
                public List<Student> students;

                public StudentGroup(String nazwa, List<Student> students) {
                    this.nazwa = nazwa;
                    this.students = students;
                }

            }
        }
    }
}