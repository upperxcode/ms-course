package com.jaocode.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaocode.hrpayroll.entities.Payment;
import com.jaocode.hrpayroll.entities.Worker;
import com.jaocode.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	

	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(Long workerkId, int days) {
		
		Worker worker = workerFeignClient.findById(workerkId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
		
		
		
	}
}
