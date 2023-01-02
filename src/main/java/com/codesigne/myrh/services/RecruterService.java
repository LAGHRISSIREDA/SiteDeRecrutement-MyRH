package com.codesigne.myrh.services;

import com.codesigne.myrh.shared.dto.RecruterDto;

public interface RecruterService  {

    RecruterDto getRecruter(String email);
    RecruterDto getRecruterByRecruterId(String recruterId);
    RecruterDto updateRecruter(String id,RecruterDto recruterDto);

    RecruterDto createRecuter(RecruterDto recruterDto);

    void deleteRecruter(String recruterId);
}
