package com.example.demo.controller;

import com.example.demo.domain.FeeDetail;
import com.example.demo.dto.FeeDetailDto;
import com.example.demo.dto.FeeDetailResponse;
import com.example.demo.service.FeeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/feeDetail")
public class FeeDetailController {

    @Autowired
    private FeeDetailService feeDetailService;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody FeeDetailDto feeDetailDto){

        feeDetailService.save(feeDetailDto);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @GetMapping(path="/{loanId}", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<FeeDetailResponse> find(@PathParam("loanId") String loanId) {

        FeeDetailResponse feeDetailResponse = new FeeDetailResponse();
        feeDetailResponse.setFeeDetails(feeDetailService.reterive(loanId));

        return ResponseEntity.ok(feeDetailResponse);
    }
}


