public class Verbal {

    Teacher teacher;
    String nameVerbal;
    String codeVerbal;
    String prefixVerbal;
    int noteVerbal;

    Verbal(String nameVerbal, String codeVerbal, String prefixVerbal, Teacher teacher){
        this.nameVerbal = nameVerbal;
        this.codeVerbal = codeVerbal;
        this.noteVerbal = 0;
        this.prefixVerbal = prefixVerbal;
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefixVerbal)){
            this.teacher = teacher;
        }else{
            System.out.println("Öğretmen ve branş uyuşmazlığı mevcut.");
        }
    }

    void printTeacher(){
        this.teacher.print();
    }


}


