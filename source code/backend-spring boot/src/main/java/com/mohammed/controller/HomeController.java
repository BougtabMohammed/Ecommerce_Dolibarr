package com.mohammed.controller;

import com.mohammed.response.ApiResponse;
import com.mohammed.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;
// test de First api depuis Api response 
    @GetMapping
    public ResponseEntity<ApiResponse> home(){
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("I'm Mohammed Bougtab , Welcom to Our Project ");
        return new ResponseEntity<>(apiResponse, HttpStatus.ACCEPTED);
   }




}
