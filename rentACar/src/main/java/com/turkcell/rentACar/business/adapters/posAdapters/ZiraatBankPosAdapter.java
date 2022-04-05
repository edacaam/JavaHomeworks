package com.turkcell.rentACar.business.adapters.posAdapters;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.turkcell.rentACar.business.abstracts.PosService;
import com.turkcell.rentACar.business.outServices.ZiraatBankPosManager;
import com.turkcell.rentACar.business.requests.CreatePaymentRequest;
import com.turkcell.rentACar.core.utilities.results.ErrorResult;
import com.turkcell.rentACar.core.utilities.results.Result;
import com.turkcell.rentACar.core.utilities.results.SuccessResult;

@Service
@Primary
public class ZiraatBankPosAdapter implements PosService {

	@Override
	public Result makePayment(CreatePaymentRequest createPaymentRequest) {
		ZiraatBankPosManager ziraatBankPosManager= new ZiraatBankPosManager();
		boolean posResult= ziraatBankPosManager.makePayment(createPaymentRequest.getCardNo(), createPaymentRequest.getCardHolder(), createPaymentRequest.getMonth(), createPaymentRequest.getYear(), createPaymentRequest.getCvv());
		if(posResult) 
		{
			return new SuccessResult();
		}
		return new ErrorResult() ;
	}
}
