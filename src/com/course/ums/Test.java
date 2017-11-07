package com.course.ums;

import com.course.ums.ws.*;
import com.course.ums.ws.course.AddCourse;
import com.course.ums.ws.semester.AddSemester;
import com.course.ums.ws.teacher.course.TeacherCourseAdd;
import com.course.ums.ws.teacher.course.TeacherCourseRemove;
import com.course.ums.ws.user.AddUser;
import com.course.ums.ws.user.ListUsers;
import com.course.ums.ws.user.UserAuth;
import com.course.ums.ws.group.GroupAdd;
import com.course.ums.ws.group.student.GroupStudentAdd;
import com.course.ums.ws.group.student.GroupStudentRemove;
import com.course.ums.ws.group.teacher.GroupTeacherAdd;
import com.course.ums.ws.group.teacher.GroupTeacherRemove;
import com.course.ums.ws.user.student.AddStudent;
import com.course.ums.ws.user.teacher.AddTeacher;
import spark.Request;
import spark.Response;
import spark.Spark;

public class Test {
    public static void main(String[] args) throws Exception {

        Spark.port(8080);
        Spark.get("/hello", new MyRoute() {
            @Override
            public Object myHandle(Request request, Response response) throws Exception {
                return "World";
            }
        });

        Spark.path("/user", () -> {
            Spark.post("/add", new AddUser());
            Spark.post("/list", new ListUsers());
            Spark.post("/authenticate", new UserAuth());
            Spark.path("/student",() -> {
                Spark.post("/add", new AddStudent());
            });
            Spark.path("/teacher",() -> {
                Spark.post("/add", new AddTeacher());
            });
        });

        Spark.path("/semester", ()-> {
            Spark.post("/add", new AddSemester());
        });

        Spark.path("/group", () -> {
           Spark.post("/add", new GroupAdd());
           Spark.path("/teacher", () -> {
               Spark.post("/add", new GroupTeacherAdd());
               Spark.post("/remove", new GroupTeacherRemove());
           });
           Spark.path("/student",()->{
               Spark.post("/add", new GroupStudentAdd());
               Spark.post("/remove", new GroupStudentRemove());
           });
        });

        Spark.path("/course",() -> {
            Spark.post("/add",new AddCourse());

        });

        Spark.path("/semester",() -> {
            Spark.post("/add",new AddSemester());

        });
        Spark.path("/teacher",() -> {
           Spark.path("/course",()->{
               Spark.post("/add", new TeacherCourseAdd());
               Spark.post("/remove", new TeacherCourseRemove());
           });
        });

    }
}
