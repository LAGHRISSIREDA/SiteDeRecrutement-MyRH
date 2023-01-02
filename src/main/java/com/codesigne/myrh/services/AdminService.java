package com.codesigne.myrh.services;

import com.codesigne.myrh.shared.dto.AdminDto;

public interface AdminService {

    AdminDto getAdmin(String email);
}
