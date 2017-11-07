package com.course.ums.ws.course;

import com.course.ums.ws.MyRoute;
import spark.Request;
import spark.Response;
import spark.Route;

public class AddCourse extends MyRoute {
    @Override
    public Object myHandle(Request request, Response response) throws Exception {
        return "course";
    }

}