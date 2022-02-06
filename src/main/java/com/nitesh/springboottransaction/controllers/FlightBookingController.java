package com.nitesh.springboottransaction.controllers;

import com.nitesh.springboottransaction.dto.FlightBookingAcknowledgement;
import com.nitesh.springboottransaction.dto.FlightBookingRequest;
import com.nitesh.springboottransaction.services.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightBookingController {


    @Autowired
    private FlightBookingService bookingService;

    @PostMapping("bookFlight")
    public FlightBookingAcknowledgement bookFlight(@RequestBody FlightBookingRequest request) {
        return bookingService.bookFlight(request);
    }
}
