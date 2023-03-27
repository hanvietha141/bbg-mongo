package com.example.demo.service;

import com.example.demo.model.Talent;
import com.example.demo.repository.TalentRepository;

import java.util.List;

public interface ITalentService  {
    List<Talent> getTalents();
}
