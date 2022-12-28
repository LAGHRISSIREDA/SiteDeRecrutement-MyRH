package com.codesigne.myrh.services.impl;

import com.codesigne.myrh.entities.RecruterEntity;
import com.codesigne.myrh.repositories.RecruterRepository;
import com.codesigne.myrh.services.RecruterService;
import com.codesigne.myrh.shared.Utils;
import com.codesigne.myrh.shared.dto.RecruterDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecruterServiceImpl implements RecruterService {
    @Autowired
    RecruterRepository recruterRepository;

    @Autowired
    Utils util;

    @Override
    public RecruterDto createRecuter(RecruterDto user) {
        //check if Recruter exists in data
        RecruterEntity checkRecruter = recruterRepository.findByEmail(user.getEmail());
        if(checkRecruter != null) throw new RuntimeException("Recruter Already Exists !");

        //continue treatement

        RecruterEntity recruterEntity = new RecruterEntity();
        BeanUtils.copyProperties(user,recruterEntity);
        recruterEntity.setEncryptedPassword("testtestest");
        recruterEntity.setRecruterId(util.generateId(32));
        RecruterEntity newRecruter = recruterRepository.save(recruterEntity);
        RecruterDto recruterDto = new RecruterDto();
        BeanUtils.copyProperties(newRecruter,recruterDto);
        return recruterDto;
    }
}
