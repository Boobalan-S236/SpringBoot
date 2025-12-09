package com.example.ApiArchStudentGet.StudentController;

import com.example.ApiArchStudentGet.Model.Student;
import com.example.ApiArchStudentGet.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController("c1")
public class StudentController {

    @Autowired
    @Qualifier("s1")
    private StudentService ss;

    @GetMapping("/")
    public String welcome(){
        return ss.welcome();
    }
    @GetMapping("students")
    public ArrayList<Student> studentDetails(){
        return ss.studentDetailsService();
    }

    @GetMapping("students/{rno}")
    public ResponseEntity<?> specificStudent(@PathVariable("rno") int rno){
        Student s= ss.specificStudent(rno);
        if(s == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT EXISTS....");
        }
        return ResponseEntity.ok(s);
    }

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        ss.addStudent(student);
        return "success";
    }

    @PutMapping("/update")
    public String update(@RequestBody Student student){
        return ss.update(student);
    }

    @DeleteMapping("/delete/{rno}")
    public String delete(@PathVariable("rno") int rno){
        return ss.delete(rno);
    }
}
