package com.course.ums.ws.user;

import com.course.ums.db.DBManager;
import com.course.ums.ws.MyRoute;
import org.json.JSONObject;
import spark.Request;
import spark.Response;
import spark.Route;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserAuth extends MyRoute{
    @Override
    public Object myHandle(Request request, Response response){
        JSONObject json = new JSONObject(request.body());
        JSONObject result = new JSONObject();
        String id;
        try{
        String username = json.getString("username");
        String password = json.getString("password");
        String sql = "SELECT id from users WHERE email=" + username + " AND password=" + password;
        Statement statement = DBManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next())
            id = resultSet.getString("id");
            result.put("id",id);
        return result;
        }catch (SQLException e){
            return "username of password does not match";
        }
    }

}