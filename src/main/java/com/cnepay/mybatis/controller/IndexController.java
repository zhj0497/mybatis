package com.cnepay.mybatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = {"/", ""})
public class IndexController {
    @RequestMapping(value = {""})
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}