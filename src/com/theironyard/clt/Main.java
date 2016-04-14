package com.theironyard.clt;

import spark.ModelAndView;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

import java.util.HashMap;

public class Main {

    static User user;

    public static void main(String[] args) {


        Spark.init();

        Spark.get(
                "/",
                ((request, response) -> {
                    HashMap<String, User> model = new HashMap<>();
                    if (user == null) {
                        return new ModelAndView(model, "index.html");
                    } else {
                        model.put("name", user);
                        return new ModelAndView(model, "messages.html");
                    }
                }),
                new MustacheTemplateEngine()
        );

        Spark.post(
                "/create-user",
                "/create-message",
                ((request, response) -> {
                    String name = request.queryParams("loginName");
                    user = new User(name);
                    response.redirect("/");
                    return "";
                })
        );





    }
}



