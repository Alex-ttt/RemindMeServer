package com.alex_ttt.remindme.server.controller;

import com.alex_ttt.remindme.server.entity.Remind;
import com.alex_ttt.remindme.server.repository.RemindRepository;
import com.alex_ttt.remindme.server.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
public class ReminderController {

    @Autowired
    private ReminderService service;

    @RequestMapping(value = "/reminders", method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllReminders() {
        return service.getAll();
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Remind getRemind(@PathVariable("id") long remindId){
        return service.getById(remindId);
    }

    @RequestMapping(value = "/reminders", method = RequestMethod.POST)
    @ResponseBody
    public Remind postReminder(@RequestBody Remind remind){
        return service.save(remind);
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteReminder(@PathVariable("id") long remindId){
        service.remove(remindId);
    }
}

