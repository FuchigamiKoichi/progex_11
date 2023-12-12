package Exercise.report1;

public class Main {
    public static void main(String[] args) {
        面積計算 ピラミッド = new 三角形(2, 4);
        面積計算 トライアングル = new 三角形(3,10);
        面積計算 田んぼ = new 正方形(100);
        面積計算 周回軌道 = new 楕円(150, 24);

        System.out.println("ピラミッドの面積は"+ピラミッド.面積を計算());
        System.out.println("トライアングルの面積は"+トライアングル.面積を計算());
        System.out.println("田んぼの面積は"+田んぼ.面積を計算());
        System.out.println("周回軌道の面積は"+周回軌道.面積を計算());
    }
}
