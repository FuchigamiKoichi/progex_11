package Exercise.report3;

public class 正方形 implements 面積計算,描画{
    double 一辺の長さ;
    
    正方形(double 一辺の長さ){
        this.一辺の長さ = 一辺の長さ;
    }

    @Override
    public double 面積を計算() {
        double area;
        
        area = Math.pow(一辺の長さ, 2);
        return area;
    }

    @Override
    public void 描画する() {
        System.out.println("□");
    }
}
