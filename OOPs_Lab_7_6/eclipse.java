public class eclipse extends close {
    int big_rds, sml_rds;
    double area,parameter;

    eclipse(int big_rds, int sml_rds){
        this.big_rds = big_rds;
        this.sml_rds = sml_rds;
    }

    @Override
    double area() {
        area = Math.PI*big_rds*sml_rds;
        System.out.println("Eclipse\nArea: "+area);
        return area;
    }

    @Override
    void display() {
        System.out.println("Eclipse\nMajor Axis: "+big_rds);
        System.out.println("Minor Axis: "+sml_rds);
    }

    @Override
    double length() {
        double res = ((big_rds*big_rds)+(sml_rds*sml_rds))/2;
        parameter = 2*Math.PI*Math.sqrt(res);
        System.out.println("Parameter: "+parameter);
        return parameter;
    }
    
}
