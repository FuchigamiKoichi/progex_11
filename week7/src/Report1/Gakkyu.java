package Report1;

import java.util.ArrayList;

public class Gakkyu {
    String name;
    ArrayList<Student> students;

    Gakkyu(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void add(Student student){
        this.students.add(student);
    }

    public int average(){
        int sum = 0;
        for (var m : this.students){
            sum += m.totalscore();
        }
        return sum / (this.students.size() * 3) ;
    }

    // テスト用コード
    public void printAverage() {
        System.out.println(name + "の");
        System.out.print("生徒は");
        for (var m : students) {
            System.out.print(m.name + " ");
        }
        System.out.println();
        System.out.print("平均点数は");
        System.out.print(average());
        System.out.println();
        System.out.println();
}

}
