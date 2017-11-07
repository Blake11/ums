package com.course.ums.ws.user.teacher;

import com.course.ums.ws.MyRoute;
import spark.Request;
import spark.Response;
import spark.Route;

public class AddTeacher extends MyRoute {
    @Override
    public Object myHandle(Request request, Response response) throws Exception {
        return "at";
    }

}