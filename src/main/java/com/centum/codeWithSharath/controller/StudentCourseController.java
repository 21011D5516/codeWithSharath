package com.centum.codeWithSharath.controller;

import com.centum.codeWithSharath.entity.Course;
import com.centum.codeWithSharath.entity.Student;
import com.centum.codeWithSharath.repository.CourseRepository;
import com.centum.codeWithSharath.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.List;

@RestController
@RequestMapping("/codewithsharath")
public class StudentCourseController {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;

//    public StudentCourseController(StudentRepository studentRepository, CourseRepository courseRepository) {
//        this.studentRepository = studentRepository;
//        this.courseRepository = courseRepository;
 //   }
    @PostMapping("/enrollnow")
    public Student saveStudentwithCourse(@RequestBody Student student){
        return studentRepository.save(student);
    }


@GetMapping("/getall")
public List<Student> gtAllStudents(){
    return studentRepository.findAll();
}
@GetMapping("/get/{studentId}")
    public Student findStudent(@PathVariable Long studentId){
        return studentRepository.findById(studentId).orElse(null);
}
    @GetMapping("/Search/{price}")
    public List<Course> findByPrice(@PathVariable double price) {
        return courseRepository.findByFeeLessThan(price);
    }
    @GetMapping("/find/{name}")
    public List<Student> findstudentbyName(@PathVariable String name){
        return studentRepository.findByName(name);
    }


}