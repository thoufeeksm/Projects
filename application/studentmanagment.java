
import java.util.ArrayList;
import java.util.Scanner;

class studentmanagment{
    ArrayList<student> students=new ArrayList<>();
     Scanner scan =new Scanner(System.in);
     public static void main(String[] args) {
        studentmanagment sm=new studentmanagment();
         Scanner scan =new Scanner(System.in);
         int choice;
      
        do { 
        System.out.println("---Student Mangment System---");
        System.out.println("1.add student");
        System.out.println("2.view student");
        System.out.println("3.search student");
        System.out.println("4.delete student");
        System.out.println("5.Exit");
        System.out.println("Enter Your Choices:");
        choice=scan.nextInt();
            switch (choice) {
                case 1:
                sm.addstudent();;
                    break;
                case 2:
                    sm.viewstudent();
                    break;
                case 3:
                    sm.searchstudent();
                    break;
                case 4:
                    sm.deletestudent();
                    break;
                case 5:
                    System.out.println("Exit from the student managment");
                
            }
            
        } while (choice!=5);   
     }
void addstudent(){
    System.out.println("--- Add The Student ---");
   
    System.out.println("Enter the Student ID");
    int student_id=scan.nextInt();
    scan.nextLine();
    System.out.println("Enter the Student name");
    String name=scan.nextLine();
    System.out.println("Enter the department");
    String department=scan.nextLine();
    System.out.println("Enter the Email of the Student");
    String email=scan.nextLine();
    System.out.println("Enter the Cgp of the Student");
    float cgpa=scan.nextFloat();
    student s=new student(student_id, name, department, email, cgpa);
    students.add(s);
    System.out.println("Student Added Successfully");
}
void viewstudent(){
    System.out.println("--Students in the College --");
    for(student stu:students){
        System.out.println("studentId: "+stu.getid());
        System.out.println("StudentName: "+stu.getname());
        System.out.println("Department: "+stu.getdep());
        System.out.println("Email: "+stu.getemail());
        System.out.println("CGPA: "+stu.getcgpa());

    }
}
    void searchstudent(){
        System.out.println("Enter the student id to be search" );
        int searchstudent=scan.nextInt();
        boolean found=false;
        for(student stu:students){
            if(stu.getid()==searchstudent){
                System.out.println("Student  Exist"+stu.getname());
                System.out.println("Department: "+stu.getdep());
                System.out.println("Email: "+stu.getemail());
                System.out.println("CGPA: "+stu.getcgpa());

                found=true;
                break;

            }
           
        }
        if(!found){
            System.out.println("Student not found");
        }

    }

    void deletestudent(){
        System.out.println("Enter the studentid to be deleted");
        int deletestudent=scan.nextInt();
        boolean found=false;
       for(int i=0;i<students.size();i++){
            if(students.get(i).getid()==deletestudent){
                found=true;
                students.remove(i);
                break;
            }
        }
        if(!found){
            System.out.println("Student not Exists SO cant be deleted");
        }
    }   
}







