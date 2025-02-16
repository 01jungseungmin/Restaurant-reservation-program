package com.proj.restreserve.payment.controller;

import com.proj.restreserve.payment.entity.Payment;
import com.proj.restreserve.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class PaymentController {
    private final PaymentService paymentService;
    @GetMapping("/admin/restaurant/payment/list")
    public ResponseEntity<Page<Payment>> showVisit(@RequestParam(required = false, defaultValue = "1") int page){
        return ResponseEntity.ok(paymentService.showPaymentReserve(page,10));
    }
    @PostMapping("/admin/restaurant/payment/refuse/{paymentid}")
    public ResponseEntity<String> refuseVisit(@PathVariable String paymentid){
        paymentService.refusePayment(paymentid);
        return ResponseEntity.ok("예약 거절");
    }
    @PostMapping("/admin/restaurant/payment/check/{paymentid}")
    public ResponseEntity<String> checkVisit(@PathVariable String paymentid){
        paymentService.checkPayment(paymentid);
        return ResponseEntity.ok("예약 확인");
    }
}
