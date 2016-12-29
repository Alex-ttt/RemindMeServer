package com.alex_ttt.remindme.server.service;


import com.alex_ttt.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReminderService {

    public List<Remind> getAll();
    Remind getById(Long id);
    Remind save(Remind remind);
    void remove(Long id);
}
