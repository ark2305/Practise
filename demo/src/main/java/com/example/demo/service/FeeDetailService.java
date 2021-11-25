package com.example.demo.service;

import com.example.demo.domain.FeeDetail;
import com.example.demo.dto.FeeDetailDto;
import com.example.demo.repository.FeeDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FeeDetailService {

    @Autowired
    private FeeDetailRepository feeDetailRepository;


    public void save(FeeDetailDto feeDetailDto) {

        FeeDetail feeDetail = convertToBo(feeDetailDto);

        feeDetailRepository.save(feeDetail);

    }

    private FeeDetail convertToBo(FeeDetailDto feeDetailDto) {
        FeeDetail feeDetail = new FeeDetail();
        feeDetail.setFeeType(feeDetailDto.getFeeType());
        feeDetail.setPaymentMode(feeDetailDto.getPaymentMode());
        feeDetail.setAmount(feeDetailDto.getAmount());
        feeDetail.setCgst(feeDetailDto.getCgst());
        feeDetail.setSgst(feeDetailDto.getSgst());
        feeDetail.setIgst(feeDetailDto.getIgst());
        feeDetail.setCess(feeDetailDto.getCess());
        feeDetail.setTotalAmount(feeDetailDto.getTotalAmount());
        return feeDetail;
    }

    public List<FeeDetailDto> reterive(String loanId) {
        return feeDetailRepository.findByLoanId(loanId)
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private FeeDetailDto convertToDto(FeeDetail feeDetail) {
        FeeDetailDto feeDetailDto = new FeeDetailDto();
        feeDetailDto.setFeeType(feeDetailDto.getFeeType());
        feeDetailDto.setPaymentMode(feeDetailDto.getPaymentMode());
        feeDetailDto.setAmount(feeDetailDto.getAmount());
        feeDetailDto.setCgst(feeDetailDto.getCgst());
        feeDetailDto.setSgst(feeDetailDto.getSgst());
        feeDetailDto.setIgst(feeDetailDto.getIgst());
        feeDetailDto.setCess(feeDetailDto.getCess());
        feeDetailDto.setTotalAmount(feeDetailDto.getTotalAmount());
        return feeDetailDto;
    }
}
