// package 1st_Prac_B;

public class three_d_shape {
    double volume(double radius){
        return 4*Math.PI*radius*radius*radius/3;
    }
    double volume(int l, int b, int h){
        return l*b*h; 
    }
    double volume(int r, int h){
        return Math.PI*r*r*h;
    }
    double volume(int side){
        return side*side*side;
    }
}
