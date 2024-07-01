public class student {
    string name;
    int roll;
    float marks;
    student(string name,int roll,float marks)
    {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
}
public class course{
    string course_name;
    int course_id;
    string teacher_name;
    course(string course_name,int course_id,string teacher_name){
        this.course_name = course_name;
        this.course_id = course_id;
        this.teacher_name = teacher_name;
        
    }
}
