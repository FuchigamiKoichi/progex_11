package Exercise.report1;

public class 三角形 implements 面積計算{
    double 底辺;
    double 高さ;

    三角形(double 底辺,double 高さ){
        this.底辺 = 底辺;
        this.高さ = 高さ;
    }

    @Override
    public double 面積を計算(){
        double area;
        area = 底辺 * 高さ / 2;

        return area;
    }
}
