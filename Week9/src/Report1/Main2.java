package Report1;

abstract class  Skill {
    abstract void invoke(String name);
}

class attack extends Skill{
    @Override
    void invoke(String name) {
        System.out.printf("%sは攻撃した！\n", name);
    }
}

class magic extends Skill{
    @Override
    void invoke(String name) {
        System.out.printf("%sは魔法を使った！\n", name);
    }
}

class tool extends Skill{
    @Override
    void invoke(String name) {
        System.out.printf("%sは道具を使った！\n", name);
    }
}

class Player{
    String name;
    Skill attack = new attack();
    Skill magic = new magic();
    Skill tool = new tool();
    Player(String name){
        this.name = name;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Player tarou = new Player("tarou");
        tarou.attack.invoke(tarou.name);
        tarou.magic.invoke(tarou.name);
        tarou.tool.invoke(tarou.name);
    }
}