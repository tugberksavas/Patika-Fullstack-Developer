public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double sNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        double note = 0;
        double sNote = 0;
    }


    void addTeacher(Teacher teacher) {
        this.teacher = teacher;

        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Ogretmen Ve Ders Bolumleri Uyusmuyor");
        }
    }


    void printTeacher() {
        this.teacher.print();
    }
}