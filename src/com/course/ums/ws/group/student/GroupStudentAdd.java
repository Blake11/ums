package com.course.ums.ws.group.student;

import com.course.ums.ws.MyRoute;
import spark.Request;
import spark.Response;
import spark.Route;

public class GroupStudentAdd extends MyRoute {
    @Override
    public Object myHandle(Request request, Response response) throws Exception {
        return "gsa";
    }

}