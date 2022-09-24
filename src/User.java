import java.io.*;
import java.util.Arrays;

//import com.coderscampus.Students;
//
public class User {

    public void getStudents() throws IOException {
        Students[] apStudents = new Students[33];
        Students[] compStudents = new Students[34];
        Students[] statStudents = new Students[33];


        try (BufferedReader readFile = new BufferedReader(new FileReader("src/resources/student-master" +
                "-list.csv"));
             BufferedWriter file1 = new BufferedWriter(new FileWriter("src/resources/course1-csv"));
             BufferedWriter file2 = new BufferedWriter(new FileWriter("src/resources/course2-csv"));
             BufferedWriter file3 = new BufferedWriter(new FileWriter("src/resources/course3-csv"))) {

            int i = 0;
            String line = null;
            Students[] students = new Students[101];

            while ((line = readFile.readLine()) != null) {
                String[] data = line.split(",");
                Students student = new Students(data[0], data[1], data[2], data[3]);
                students[i] = student;
                i++;
            }
            int apStudentsIndex = 0;
            int compStudentsIndex = 0;
            int statStudentsIndex = 0;


            for (Students student : students) {
                if (student.getCourse().contains("APMTH")) {
                    apStudents[apStudentsIndex] = student;
                    apStudentsIndex++;
                }
                if (student.getCourse().contains("COMPSCI")) {
                    compStudents[compStudentsIndex] = student;
                    compStudentsIndex++;

                }
                if (student.getCourse().contains("STAT")) {
                    statStudents[statStudentsIndex] = student;
                    statStudentsIndex++;
                }
            }

            Arrays.sort(apStudents);
            file1.write("Student ID | Student Name | Course | Grade\n");

            for (Students student : apStudents) {
                file1.write(student.getStudentId() + ",");
                file1.write(student.getStudentName() + ",");
                file1.write(student.getCourse() + ",");
                file1.write(student.getStudentGrade() + "\n");

            }
            Arrays.sort(compStudents);

            file2.write("Student ID | Student Name | Course | Grade\n");

            for (Students student : compStudents) {
                file2.write(student.getStudentId() + ",");
                file2.write(student.getStudentName() + ",");
                file2.write(student.getCourse() + ",");
                file2.write(student.getStudentGrade() + "\n");

            }
            Arrays.sort(statStudents);
            file3.write("Student ID | Student Name | Course | Grade\n");

            for (Students student : statStudents) {
                file3.write(student.getStudentId() + ",");
                file3.write(student.getStudentName() + ",");
                file3.write(student.getCourse() + ",");
                file3.write(student.getStudentGrade() + "\n");

            }
        }

    }
}
