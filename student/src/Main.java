public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Bayram ARSLAN", "555", "BIO");
        Teacher t2 = new Teacher("Elif ELELÇİ", "556","FZK");
        Teacher t3 = new Teacher("Muhammed Hüseyin ARSLAN", "557", "MAT");

        Course bio = new Course("Biyoloji", "101", "BIO", t1);
        bio.addTeacher(t1);
        Course fzk = new Course("Fizik", "102", "FZK", t2);
        fzk.addTeacher(t2);
        Course mat = new Course("Matematik", "101", "MAT", t3);
        mat.addTeacher(t3);

        Verbal matV = new Verbal("Matematik Sözlü", "101", "MAT", t3);
        matV.addTeacher(t3);
        Verbal fzkV = new Verbal("Fizik Sözlü", "102", "FZK", t2);
        fzkV.addTeacher(t2);
        Verbal bioV = new Verbal("Biyoloji Sözlü", "101", "BIO", t1);
        bioV.addTeacher(t1);

        Student s1 = new Student("Kadir ARSLAN", "123", "3", mat, bio, fzk, matV, bioV, fzkV);
        s1.addBulkExamNote(100, 56,80,90,90,90);
        s1.isPass();

        Student s2 = new Student("Pınar ARSLAN", "477", "4", mat, bio, fzk, matV, bioV, fzkV);
        s2.addBulkExamNote(90, 80,70, 90,90,90);
        s2.isPass();

        Student s3 = new Student("Yonca ARSLAN", "187", "4", mat, bio, fzk, matV, bioV, fzkV);
        s3.addBulkExamNote(100, 90, 85, 90,90,90);
        s3.isPass();




    }
}