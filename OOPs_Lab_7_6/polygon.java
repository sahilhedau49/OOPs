public class polygon extends close {
    int length,n;
    double area, parameter;

    polygon(int length, int n){
        this.length = length;
        this.n = n;
    }

    @Override
    double area() {
        area = (length*length*n)/(4*Math.tan(Math.PI/n));
        System.out.println("Polygon Area: "+area);
        return area;
    }

    @Override
    void display() {
        System.out.println("Polygon\nLength: "+length);
        System.out.println("No. of sides: "+n);
    }

    @Override
    double length() {
        parameter = length*n;
        System.out.println("Polygon Parameter: "+parameter);
        return parameter;
    }
    
}
