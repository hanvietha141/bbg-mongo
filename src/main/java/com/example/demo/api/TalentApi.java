package com.example.demo.api;

import com.example.demo.service.iplm.TalentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TalentApi {
    @Autowired
    private TalentService talentService;
    @GetMapping(value="/talent")
    public Object getTalents() {
        return talentService.getTalents();
    }
}
