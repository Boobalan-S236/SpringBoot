package com.example.ApiArchStudentGet.StudentService;

import com.example.ApiArchStudentGet.Model.Student;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("s1")
public class StudentService {

    ArrayList<Student> al = new ArrayList();

    public String welcome(){
        return "WELCOME";
    }

    public ArrayList<Student>  studentDetailsService(){

        al.add(new Student(1,"Boobalan","CSE",90));
        al.add(new Student(2,"Ravi","AIML",96));

        return al;
    }

    public Student specificStudent(int rno){
        int index=0;
        boolean f=false;
        for(int i=0;i<al.size();i++){
            if(rno == al.get(i).getRno()) {
                index=i;
                f=true;
                break;
            }
        }
        if(f){
            return al.get(index);
        }
        return null;
    }


    public void addStudent(Student student) {
        al.add(student);
    }

    public String update(Student student) {
        int index=0;
        boolean f=false;
        for (int i=0;i<al.size();i++){
            if(al.get(i).getRno() == student.getRno()) {
                index=i;
                f=true;
                break;
            }
        }
        if(f){
             al.set(index,student);
             return"Updated successfully....";
        }
        return "not found" ;
    }

    public String delete(int rno) {
        int index=0;
        boolean f=false;
        for(int i=0;i<al.size();i++){
            if(rno == al.get(i).getRno()){
                index=i;
                f=true;
                break;
            }
        }
        if(f){ al.remove(index);
        return" deleted...";
        }

        return "not exist";
    }
}
