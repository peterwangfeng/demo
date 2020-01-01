package com.example.demo.controller;

import com.example.demo.dao.IUserDao;
import com.example.demo.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
public class UserController {
    @Autowired
    private IUserDao iUserDao;

    @GetMapping("/qwqw")
    @ResponseBody
    public Map<String, Object> get() {
        log.error("hello world");
        List<User> list = iUserDao.getList();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 1000);
        map.put("msg", "success");
        map.put("data", list);
        throw new RuntimeException("not found");
//        return map;
    }
    @RequestMapping("/")
    public String getList(ModelAndView model) {
        return "index";
    }
}
