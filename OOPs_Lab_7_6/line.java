public class line extends open {
    point ps;
    point pe;
    double length;

    line(point ps, point pe){
        this.ps = ps;
        this.pe = pe;
    }

    void display(){
        System.out.println("Line\nStart Point:");
        ps.display();
        System.out.println("End Point:");
        pe.display();
    }

    double length(){
        length = Math.sqrt((pe.x - ps.x)^2 + (pe.y - ps.y)^2);
        System.out.println("Length: "+length);
        return length;
    }
}
