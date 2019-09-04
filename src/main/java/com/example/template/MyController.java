package com.example.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class MyController {

    @Autowired
    MyService myService;

    @RequestMapping(value = "/mypage/order/{username}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public List<OrderHistory> myOrderHistory(HttpServletRequest request, HttpServletResponse response,
                                             @PathVariable(value = "username") String username
    ) throws Exception {
        return this.myService.myOrderHistory(username);
    }

}