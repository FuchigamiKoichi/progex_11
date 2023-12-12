package Exercise.report3;

public class Main {
    public static void main(String[] args) {
        三角形 三角なもの = new 三角形(10, 10);
        面積計算 面積計算可能な三角形 = 三角なもの;
        System.out.println("三角なもの");
        System.out.println(面積計算可能な三角形.面積を計算());

        描画 描画可能な三角形 = 三角なもの;
        描画可能な三角形.描画する();

        正方形 あからさまな正方形 = new 正方形(20);
        面積計算 面積計算可能な正方形 = あからさまな正方形;
        System.out.println("あからさまな正方形");
        System.out.println(面積計算可能な正方形.面積を計算());

        描画 描画可能な正方形 = あからさまな正方形;
        描画可能な正方形.描画する();


        楕円 噂の楕円 = new 楕円(5, 8);
        面積計算 面積計算可能な楕円 = 噂の楕円;
        System.out.println("噂の楕円");
        System.out.println(面積計算可能な楕円.面積を計算());

        描画 描画可能な楕円 = 噂の楕円;
        描画可能な楕円.描画する();

    }
}
