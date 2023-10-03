//package com.rushi.firstproject.controllers;
//
////import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.rushi.firstproject.model.Response;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
//
//@RequestMapping("/v1")
//@RestController
//public class HomeController {
//
////    @GetMapping("/hello")
////    public String Home(){
//////        System.out.println("Home controller");
////        return "Home controller";
////    }
//
//
////    @GetMapping("/hello")
////    public Map<String,String> Home(){
//////        System.out.println("Home controller");
////        Map<String,String> test=new HashMap<>();
////        test.put("Data","Home controller");
////        test.put("name","rushi");
////        return test;
////    }
//
//
////@GetMapping("/hello")
////public JsonNode Home(){
//////        System.out.println("Home controller");
////    Map<String,Object> test=new HashMap<>();
////    test.put("Data","Home controller");
////    test.put("status",true);
////    ObjectMapper mapper=new ObjectMapper();
////    return mapper.convertValue(test, JsonNode.class);
////}
//
//
//@GetMapping("/hello")
//public Response Home(){
//    Response response=new Response();
//    response.setStatus("success");
//
////        System.out.println("Home controller");
//    Map<String,Object> test=new HashMap<>();
//    test.put("Data","Home controller");
//    test.put("status",true);
//
//    response.setData(test);
//   // ObjectMapper mapper=new ObjectMapper();
//    //return mapper.convertValue(test, JsonNode.class);
//    return response;
//}
//
//
////    @PostMapping("/hello")
////    public Response Home(@RequestBody Response response){
////        response = new Response();
////        response.setStatus("success");
////
//////        System.out.println("Home controller");
////        Map<String,Object> test=new HashMap<>();
////        test.put("Data","Home controller");
////        test.put("status",true);
////
////        response.setData(test);
////        // ObjectMapper mapper=new ObjectMapper();
////        //return mapper.convertValue(test, JsonNode.class);
////
////
////        return response;
////    }
//
//    @GetMapping("/getstatus")
//    public String Home(@RequestBody String resbodystr)
//    {
//        Response response=new Response();
//        return response.toString()+resbodystr;
//
//    }
//
//
//}
