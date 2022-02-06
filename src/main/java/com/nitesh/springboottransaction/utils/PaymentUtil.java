package com.nitesh.springboottransaction.utils;

import com.nitesh.springboottransaction.exceptions.InsufficientAmountFoundException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtil {

    private static Map<String, Double> paymentMap = new HashMap<>();

   static {
        paymentMap.put("acc1", 12000.00);
        paymentMap.put("acc2", 10000.00);
        paymentMap.put("acc3", 15000.00);
    }

    public static boolean validateCreditLimit(String accNo, double paidAmount) {
        System.out.println("account no : "+accNo);
        System.out.println("paid amount : " + paidAmount);
        if (paidAmount > paymentMap.get(accNo)) {
            throw new InsufficientAmountFoundException("Insufficient Fund..!!");
        } else {
            return true;
        }
    }
}
