package com.course.ums.ws.teacher.course;

import com.course.ums.ws.MyRoute;
import spark.Request;
import spark.Response;
import spark.Route;

public class TeacherCourseRemove extends MyRoute {
    @Override
    public Object myHandle(Request request, Response response) throws Exception {
        return "tcr";
    }

}