package com.alex_ttt.remindme.server.controller;

import com.alex_ttt.remindme.server.entity.Remind;
import com.alex_ttt.remindme.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/reminder")
public class ReminderController {

    @Autowired
    private RemindRepository remindRepository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(ModelMap model) {
        List<Remind> all = remindRepository.findAll();
        return createMockRemind();
    }

    private Remind createMockRemind() {
        Remind remind = new Remind();
        remind.setId(1);
        remind.setTitle("title");
        remind.setRemindDate(new Date());

        return remind;
    }

}

