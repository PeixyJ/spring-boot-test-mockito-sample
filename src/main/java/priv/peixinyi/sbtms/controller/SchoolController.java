package priv.peixinyi.sbtms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import priv.peixinyi.sbtms.entity.IClass;
import priv.peixinyi.sbtms.entity.IStudent;
import priv.peixinyi.sbtms.service.IClassService;
import priv.peixinyi.sbtms.service.IStudentService;

import java.util.List;

/**
 * @author peixinyi
 */
@RestController
@RequestMapping("/school")
public class SchoolController {

    @Resource
    IClassService iClassService;

    @Resource
    IStudentService iStudentService;

    public String getSchool() {
        return "school";
    }

    @GetMapping("/class")
    public List<IClass> getClasses() {
        return iClassService.list();
    }

    @GetMapping("/class/{id}")
    public IClass getClassById(@PathVariable Integer id) {
        return iClassService.getById(id);
    }

    @PostMapping("/class")
    public void addClass(@RequestBody IClass iClass) {
        iClassService.save(iClass);
    }

    @PatchMapping("/class")
    public void updateClass(IClass iClass) {
        iClassService.updateById(iClass);
    }

    @DeleteMapping("/class/{id}")
    public void deleteClass(String id) {
        iClassService.removeById(id);
    }

    @GetMapping("/student")
    public List<IStudent> getStudents() {
        return iStudentService.list();
    }

    @GetMapping("/student/{id}")
    public IStudent getStudentById(String id) {
        return iStudentService.getById(id);
    }

    @PostMapping
    public void addStudent(IStudent iStudent) {
        iStudentService.save(iStudent);
    }

    @PatchMapping
    public void updateStudent(IStudent iStudent) {
        iStudentService.updateById(iStudent);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable String id) {
        iStudentService.removeById(id);
    }

    @PostMapping("/join/{classId}/{studentId}")
    public void joinClass(@PathVariable("classId") String classId, @PathVariable("studentId") String studentId) {
        IStudent student = iStudentService.getById(studentId);
        if (ObjectUtils.isNotEmpty(student)) {
            student.setClassId(Integer.parseInt(classId));
            iStudentService.updateById(student);
        }
    }

    @GetMapping("/student/age/{age}")
    public List<IStudent> getStudentByAge(@PathVariable int age) {
        LambdaQueryWrapper<IStudent> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(IStudent::getAge, age);
        return iStudentService.list(queryWrapper);
    }


}
