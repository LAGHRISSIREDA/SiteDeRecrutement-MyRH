package com.codesigne.myrh.services.impl;

import com.codesigne.myrh.entities.UserEntity;
import com.codesigne.myrh.repositories.RecruterRepository;
import com.codesigne.myrh.services.RecruterService;
import com.codesigne.myrh.shared.Utils;
import com.codesigne.myrh.shared.dto.RecruterDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RecruterServiceImpl implements RecruterService{
    @Autowired
    RecruterRepository recruterRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    Utils util;

    @Override
    public RecruterDto getRecruter(String email) {
        return null;
    }

    @Override
    public RecruterDto getRecruterByRecruterId(String recruterId) {
        return null;
    }

    @Override
    public RecruterDto updateRecruter(String id, RecruterDto recruterDto) {
        return null;
    }

    @Override
    public RecruterDto createRecuter(RecruterDto user) {
        //check if Recruter exists in data
        UserEntity checkRecruter = recruterRepository.findByEmail(user.getEmail());
        if(checkRecruter != null) throw new RuntimeException("Recruter Already Exists !");

        //continue treatement

        UserEntity recruterEntity = new UserEntity();
        BeanUtils.copyProperties(user,recruterEntity);
//        bCryptPasswordEncoder.encode(user.getPassword())
        recruterEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        recruterEntity.setRecruterId(util.generateId(32));
        UserEntity newRecruter = recruterRepository.save(recruterEntity);
        RecruterDto recruterDto = new RecruterDto();
        BeanUtils.copyProperties(newRecruter,recruterDto);
        return recruterDto;
    }

    @Override
    public void deleteRecruter(String recruterId) {

    }



//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return null;
//    }
}
