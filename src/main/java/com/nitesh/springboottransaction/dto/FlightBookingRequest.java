package com.nitesh.springboottransaction.dto;

import com.nitesh.springboottransaction.entities.PassengerInfo;
import com.nitesh.springboottransaction.entities.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingRequest {

    private PassengerInfo passengerInfo;

    private PaymentInfo paymentInfo;
}
