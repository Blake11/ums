package com.course.ums.ws.group;

import com.course.ums.ws.MyRoute;
import spark.Request;
import spark.Response;
import spark.Route;

public class GroupAdd extends MyRoute {
    @Override
    public Object myHandle(Request request, Response response) throws Exception {
        return "ga";
    }

}