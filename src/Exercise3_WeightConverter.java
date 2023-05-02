import java.util.Scanner;

public class Exercise3_WeightConverter {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Weight in Kgs");
        double weight_kgs = sc.nextDouble();
        Convert(weight_kgs);
    }
    public static void Convert(double kgs){
        double weigthgms,weightmgs;
        weigthgms= kgs*1000;
        weightmgs=weigthgms*1000;
        System.out.println("the converted weight from kgs to gms is : " + weigthgms);
        System.out.println("the converted weight from gms to mgs is : " + weightmgs);


    }
}

