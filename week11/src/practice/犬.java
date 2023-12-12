package practice;

public class 犬 implements 発声{
    String 名前;

    犬(String 名前){
        this.名前 = 名前;
    }

    @Override
    public void 鳴く(){
        System.out.println(名前+"　わんわん　");
    }
}
