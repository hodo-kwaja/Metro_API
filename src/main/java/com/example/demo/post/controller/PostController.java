package com.example.demo.post.controller;

import com.google.gson.JsonParser;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import MetroNavi.MetroNavi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDate;
import java.time.LocalTime;

import com.google.gson.JsonObject;

@RestController
public class PostController {
    @GetMapping("/navi")
    public String Controller(@RequestParam("departure") String departname, @RequestParam("arrival") String dstname, @RequestParam("hour") String hour, @RequestParam("minute") String minute, @RequestParam("week") String weekType) throws FileNotFoundException {
        String[] arr = {departname, dstname, hour, minute, weekType};
        System.out.println(departname + " " + dstname + " " + hour + " " + minute + " " + weekType);
        MetroNavi.main(arr);
        Reader reader = new FileReader("Path.json");
        JsonParser parser = new JsonParser();
        Object obj = parser.parse(reader);
        return obj.toString();
    }

    @GetMapping("/hello")
    public String Controller() {
        LocalTime now = LocalTime.now();
        return now.toString();
    }
}

