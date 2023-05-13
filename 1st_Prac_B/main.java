// package 1st_Prac_B;

public class main {
    public static void main(String[] args) {
        three_d_shape v = new three_d_shape();
        
        double sphere_v = v.volume(5.0);
        System.out.println("Volume of Sphere : "+sphere_v);
         
        double cube_c= v.volume(2);
        System.out.println("Volume of Cube : "+cube_c);
         
        double cuboid_v = v.volume(2,3,4);
        System.out.println("Volume of Cuboid : "+cuboid_v);
         
        double cylinder_v = v.volume(2,3);
        System.out.println("Volume of Cylinder : "+cylinder_v);
    }
}
