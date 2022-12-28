package com.codesigne.myrh.controllers;

import com.codesigne.myrh.requests.RecruterRequest;
import com.codesigne.myrh.responses.RecruterResponse;
import com.codesigne.myrh.services.RecruterService;
import com.codesigne.myrh.shared.dto.RecruterDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/recruter")
public class RecruterController {
    @Autowired
    RecruterService recruterService;
    @GetMapping(path = "/{id}")
    public String getRecruter(@PathVariable String id){
        return "hello from GET recruter method :"+id;
    }

    @GetMapping
    public String getAllRecruter(){
        return "getAll recruter function was called";
    }

    @PostMapping
    public RecruterResponse createRecruter(@RequestBody RecruterRequest recruterRequest){
        RecruterDto recruterDto = new RecruterDto();
        BeanUtils.copyProperties(recruterRequest,recruterDto);
        RecruterDto createRecuter = recruterService.createRecuter(recruterDto);
        RecruterResponse recruterResponse = new RecruterResponse();
        BeanUtils.copyProperties(createRecuter,recruterResponse);
        return recruterResponse;
    }

    @PutMapping
    public String updateRecruter(){

        return "hello fom UPDATE recruter method";
    }

    @DeleteMapping
    public String deleteRecruter(){

        return "hello from DELETE recruter method";
    }
}
