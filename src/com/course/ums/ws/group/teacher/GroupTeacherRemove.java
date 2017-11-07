package com.course.ums.ws.group.teacher;

import com.course.ums.ws.MyRoute;
import spark.Request;
import spark.Response;
import spark.Route;

public class GroupTeacherRemove extends MyRoute {
    @Override
    public Object myHandle(Request request, Response response) throws Exception {
        return "gtr";
    }

}