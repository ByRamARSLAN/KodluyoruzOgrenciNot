import java.sql.SQLOutput;

public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    Verbal v1;
    Verbal v2;
    Verbal v3;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3,
            Verbal v1, Verbal v2, Verbal v3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.avarage = 0.0;
        this.isPass = false;
    }


    void addBulkExamNote(int note1, int note2, int note3, int noteV1, int noteV2, int noteV3){
        if(note1 >= 0 && note1 <=100){
            c1.note = note1;
        }

        if(note2 >= 0 && note2 <=100){
            c2.note = note2;
        }

        if(note3 >= 0 && note3 <=100){
            c3.note = note3;
        }

        if(noteV1 >= 0 && noteV1 <= 100){
            v1.noteVerbal = noteV1;
        }
        if(noteV2 >= 0 && noteV2 <= 100){
            v2.noteVerbal = noteV2;
        }
        if(noteV3 >= 0 && noteV3 <= 100){
            v3.noteVerbal = noteV3;
        }

    }

    void isPass(){
        this.avarage = ((this.c1.note + this.c2.note + this.c3.note)*0.8 +
                (this.v1.noteVerbal +this.v2.noteVerbal + this.v3.noteVerbal)*0.2)/3.0;
        if(this.avarage >= 55){
            System.out.println(this.name + " Dersi geçtiniz.");
        }else{
            System.out.println(this.name + " Dersten kaldınız.");
        }
        printNote();
    }

    void printNote(){
        System.out.println(c1.name + " Notu\t:" + c1.note);
        System.out.println(c2.name + " Notu\t:" + c2.note);
        System.out.println(c3.name + " Notu\t:" + c3.note);
        System.out.println(v1.nameVerbal + " Notu\t:" + v1.noteVerbal);
        System.out.println(v2.nameVerbal + " Notu\t:" + v2.noteVerbal);
        System.out.println(v3.nameVerbal + " Notu\t:" + v3.noteVerbal);
        System.out.println("Ortalamanız : " + this.avarage);
        System.out.println("******************************");
    }
}

