package com.course.ums.ws.semester;

import com.course.ums.ws.MyRoute;
import spark.Request;
import spark.Response;
import spark.Route;

public class AddSemester extends MyRoute {
    @Override
    public Object myHandle(Request request, Response response) throws Exception {
        return "as";
    }

}