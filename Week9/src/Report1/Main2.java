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
    Skill attack;
    Skill magic;
    Skill tool;
    Player(String name){
        this.name = name;
        this.attack = new attack();
        this.magic = new magic();
        this.tool = new tool();
    }
}

public class Main2 {
    public static void main(String[] args) {
        Player tarou = new Player("tarou");
        String tname = tarou.name;
        tarou.attack.invoke(tname);
        tarou.magic.invoke(tname);
        tarou.tool.invoke(tname);
    }
}