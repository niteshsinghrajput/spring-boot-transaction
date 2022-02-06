package com.nitesh.springboottransaction.services;

import com.nitesh.springboottransaction.dto.FlightBookingAcknowledgement;
import com.nitesh.springboottransaction.dto.FlightBookingRequest;
import com.nitesh.springboottransaction.entities.PassengerInfo;
import com.nitesh.springboottransaction.entities.PaymentInfo;
import com.nitesh.springboottransaction.repositories.PassengerInfoRepository;
import com.nitesh.springboottransaction.repositories.PaymentInfoRepository;
import com.nitesh.springboottransaction.utils.PaymentUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class FlightBookingService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional //(readOnly = false, isolation = Isolation.READ_COMMITTED, propagation = )
    public FlightBookingAcknowledgement bookFlight(FlightBookingRequest request) {

        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfo = passengerInfoRepository.save(passengerInfo);
        PaymentInfo paymentInfo = request.getPaymentInfo();
        System.out.println("passenger info : "+ passengerInfo);
        System.out.println("payment info: "+paymentInfo);
        PaymentUtil.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());

        paymentInfo.setPassengerId(passengerInfo.getPId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement("SUCCESS", passengerInfo.getFare(),
                UUID.randomUUID().toString().split("-")[0], passengerInfo);
    }
}
