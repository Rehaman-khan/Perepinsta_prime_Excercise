public class Method_Overloading_Exercise4 {
    public static void main(String[]args){
        int l=10;
        double b=20;
        double h=5.3;
        Area(b,h);

    }
    public static void Area(int side){
        int area=side*side;
        System.out.println(area);
    }
    public static void Area(int l,double b){
        double area=l*b;
        System.out.println(area);
    }
    public static void Area(double h, double b){
        double area= 0.5*b*h;
        System.out.println(area);
    }
}
