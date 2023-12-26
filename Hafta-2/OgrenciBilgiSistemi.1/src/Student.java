public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;


    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;


        double average = 0.0;
        boolean isPass = false;
    }


    void addBulkExamNote(double note1, double note2, double note3, double sNote1, double sNote2, double sNote3) {

        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }

        if (sNote1 >= 0 && sNote1 <= 100) {
            this.c1.sNote = sNote1;
        }

        if (sNote2 >= 0 && sNote2 <= 100) {
            this.c2.sNote = sNote2;
        }

        if (sNote3 >= 0 && sNote3 <= 100) {
            this.c3.sNote = sNote3;
        }
    }


    void isPass() {
        System.out.println("--------------");
        System.out.println(name);


        double c1 = (this.c1.sNote * 0.20) + (this.c1.note * 0.80);
        double c2 = (this.c2.sNote * 0.20) + (this.c2.note * 0.80);
        double c3 = (this.c3.sNote * 0.20) + (this.c3.note * 0.80);
        this.average = (c1 + c2 + c3) / 3.0;




        if (this.average > 55) {
            System.out.println("Hababam Sinifi Uyaniyor   ! ");
            this.isPass = true;
        } else {
            System.out.println("Hababam Sinifi Sinifta Kaldi. ");
            this.isPass = false;
        }
        printNote();
    }


    void printNote() {
        System.out.println(this.c1.name + " Sinav Notu: " + this.c1.note + " Sozlu Notu : " + this.c1.sNote);
        System.out.println(this.c2.name + " Sinav Notu: " + this.c2.note + " Sozlu Notu : " + this.c2.sNote);
        System.out.println(this.c3.name + " Sinav Notu:" + this.c3.note + " Sozlu Notu : " + this.c3.sNote);
        System.out.println("Ortalama: " + this.average);
    }
}