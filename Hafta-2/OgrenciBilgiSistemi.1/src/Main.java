public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "0000");
        Teacher t3 = new Teacher("Kulyutmaz", "BIO", "1111");


        Course tarih = new Course("TARİH", "101", "HIS");
        tarih.addTeacher(t1);
        Course fizik = new Course("FİZİK", "102", "PHY");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biology", "103", "BIO");
        biyo.addTeacher(t3);


        Student s1 = new Student("Inek Saban", "123", "4", tarih,fizik,biyo);
        s1.addBulkExamNote(85, 90, 78, 92, 88, 95);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi", "444", "4", tarih,fizik,biyo);
        s2.addBulkExamNote(72, 88, 95, 60, 75, 82);
        s2.isPass();
    }
}