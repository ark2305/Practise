package com.example.demo.dto;

import java.util.List;

public class FeeDetailResponse {

    private List<FeeDetailDto> feeDetails;

    public List<FeeDetailDto> getFeeDetails() {
        return feeDetails;
    }

    public void setFeeDetails(List<FeeDetailDto> feeDetails) {
        this.feeDetails = feeDetails;
    }
}
