package bhupen.in.restendpointpost.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by BhupendraKumar on 7/9/18.
 */

@RestController
public class RestEnpoints {


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
