package practice;

public class Main {
    public static void main(String[] args) {
        発声 ぽち = new 犬("ぽち");
        発声 ハチ = new 犬("ハチ");
        発声 たま = new 猫("たま");

        ぽち.鳴く();
        ハチ.鳴く();
        たま.鳴く();
    }
}
