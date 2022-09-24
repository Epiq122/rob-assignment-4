public class Students implements Comparable<Students> {
    private String studentId;
    private String studentName;
    private String course;
    private String studentGrade;

    public Students(String studentId, String studentName, String course, String studentGrade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.studentGrade = studentGrade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    @Override
    public int compareTo(Students that) {
        if (this.studentGrade.compareTo(that.studentGrade) == 0) {
            return this.studentGrade.compareTo(that.studentGrade);

        } else {
            return that.studentGrade.compareTo(this.studentGrade);
        }
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", course='" + course + '\'' +
                ", studentGrade='" + studentGrade + '\'' +
                '}';
    }
}
