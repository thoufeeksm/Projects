class student{
    private int student_id;
    private String name;
    private String department;
    private String email;
    private float cgpa;

    public student(int student_id,String name,String department,String email,float cgpa) {
        this.student_id=student_id;
        this.name=name;
        this.department=department;
        this.email=email;
        this.cgpa=cgpa;
    }
    int getid(){
        return student_id;

    }
    String getname(){
        return name;

    }
    String getdep(){
        return department;

    }
    String getemail(){
        return email;

    }
  float getcgpa(){
        return cgpa;
    }
    

}