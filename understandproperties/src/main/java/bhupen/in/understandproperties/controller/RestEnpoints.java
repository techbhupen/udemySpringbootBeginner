package bhupen.in.understandproperties.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by BhupendraKumar on 7/9/18.
 */

@RestController
public class RestEnpoints {


    @Value("${default.course.name}")
    private String cName;

    @Value("${default.course.chapterCount}")
    private int chaptersCount;


    @RequestMapping("/defaultCourse")
    public Course getDefaultCourse(@RequestParam(value = "name", defaultValue = "Spring Boot", required = false) String name,
                              @RequestParam(value = "chapterCount", defaultValue = "2", required = false) int chapterCount
    ) {
        return new Course(cName, chaptersCount);
    }

    @RequestMapping("/course")
    public Course getEndpoint(@RequestParam(value = "name", defaultValue = "Spring Boot", required = false) String name,
                              @RequestParam(value = "chapterCount", defaultValue = "2", required = false) int chapterCount
                              ) {
        return new Course(name, chapterCount);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/register/course")
    public String saveCourse(@RequestBody Course course){
        return "Your course named "+ course.getName() + " with " + course.getChapterCount() + "chapters saved successfuly.";
    }


}
