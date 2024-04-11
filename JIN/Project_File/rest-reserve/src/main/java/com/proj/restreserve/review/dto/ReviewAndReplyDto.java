package com.proj.restreserve.review.dto;

import com.proj.restreserve.detailpage.dto.DetailUserDto;
import com.proj.restreserve.payment.dto.PaymentMenuDto;
import com.proj.restreserve.payment.dto.SelectPaymentDto;
import com.proj.restreserve.visit.dto.VisitDto;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ReviewAndReplyDto {
    private String reviewid;
    private int scope;
    private String content;
    private LocalDate date;
    private DetailUserDto user;
    private SelectPaymentDto payment;
    private VisitDto visit;
    private List<PaymentMenuDto> paymentMenuDtos;
    private List<String> iamgeLinks;
    private ReviewReplyDto reviewReplyDto;
}