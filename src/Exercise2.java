public class Exercise2{
    public static void main(String[]args){
        String Student_name = "Rehman";
        int marks=24;
        char studentgrade=Studentgrade(marks);
        StudentReport(Student_name,studentgrade);

    }
    public static char Studentgrade(int marks){
         char grade = 0;
         if (marks>=80 && marks<=100){
              grade ='A';
         } else if (marks>=60 && marks<=80) {
             grade ='B';

         } else if (marks>=35 && marks<=60) {
             grade ='C';

         } else if (marks<35) {
             grade='F';
         }
         return grade;
    }

    public static void StudentReport(String StudentName, char Studentgrade){
        System.out.println("The student name is : "+ StudentName+" " + "Student Grade is :" + Studentgrade);

    }
        }
