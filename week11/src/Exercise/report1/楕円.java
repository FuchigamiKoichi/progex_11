package Exercise.report1;

public class 楕円 implements 面積計算{
    double 半径a;
    double 半径b;

    楕円(double 半径a, double 半径b){
        this.半径a = 半径a;
        this.半径b = 半径b;
    }

    @Override
    public double 面積を計算() {
        double area;

        area = 半径a*半径b*Math.PI;
        return area;
    }
}
