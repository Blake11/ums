package com.course.ums.ws.user.student;

import com.course.ums.db.DBManager;
import com.course.ums.ws.MyRoute;
import org.json.JSONObject;
import spark.Request;
import spark.Response;
import spark.Route;

import java.sql.PreparedStatement;

public class AddStudent extends MyRoute {
    @Override
    public Object myHandle(Request request, Response response) throws Exception {
        return "student";
    }

}
