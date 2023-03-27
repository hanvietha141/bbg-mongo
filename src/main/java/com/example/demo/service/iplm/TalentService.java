package com.example.demo.service.iplm;

import com.example.demo.model.Talent;
import com.example.demo.repository.TalentRepository;
import com.example.demo.service.ITalentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TalentService implements ITalentService {
    @Autowired
    private TalentRepository talentRepository;

    @Override
    public List<Talent> getTalents() {
        List<Talent> talents = talentRepository.findAll();
        for (Talent talent : talents) {
            System.out.println(talent.getId());
        }
        return talents;
    }
}
