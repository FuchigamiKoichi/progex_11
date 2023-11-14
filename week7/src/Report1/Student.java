package Report1;

public class Student {
    String name;
    int math;
    int english;
    int japanese;

    Student(String name, int math, int english, int japanese){
        this.name = name;
        this.math = math;
        this.english = english;
        this.japanese = japanese;
    }

    public int totalscore(){
        return this.math + this.english + this.japanese;
    }
}
