package com.course.ums.ws.group.student;

import com.course.ums.ws.MyRoute;
import spark.Request;
import spark.Response;
import spark.Route;

public class GroupStudentRemove extends MyRoute {
    @Override
    public Object myHandle(Request request, Response response) throws Exception {
        return "gsr";
    }

}