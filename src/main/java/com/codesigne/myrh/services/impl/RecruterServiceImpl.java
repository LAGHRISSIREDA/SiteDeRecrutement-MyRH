package com.codesigne.myrh.services.impl;

import com.codesigne.myrh.entities.RecruterEntity;
import com.codesigne.myrh.repositories.RecruterRepository;
import com.codesigne.myrh.services.RecruterService;
import com.codesigne.myrh.shared.dto.RecruterDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecruterServiceImpl implements RecruterService {
    @Autowired
    RecruterRepository recruterRepository;
    @Override
    public RecruterDto createRecuter(RecruterDto user) {
        RecruterEntity recruterEntity = new RecruterEntity();
        BeanUtils.copyProperties(user,recruterEntity);
        recruterEntity.setEncryptedPassword("testtestest");
        recruterEntity.setRecruterId("recruterId");
        RecruterEntity newRecruter = recruterRepository.save(recruterEntity);
        RecruterDto recruterDto = new RecruterDto();
        BeanUtils.copyProperties(newRecruter,recruterDto);
        return recruterDto;
    }
}
