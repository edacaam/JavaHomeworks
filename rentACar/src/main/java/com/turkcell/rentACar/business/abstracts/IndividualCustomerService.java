package com.turkcell.rentACar.business.abstracts;

import java.util.List;

import com.turkcell.rentACar.business.dtos.GetIndividualCustomerDto;
import com.turkcell.rentACar.business.dtos.IndividualCustomerListDto;
import com.turkcell.rentACar.business.requests.CreateIndividualCustomerRequest;
import com.turkcell.rentACar.business.requests.UpdateIndividualCustomerRequest;
import com.turkcell.rentACar.core.utilities.results.DataResult;
import com.turkcell.rentACar.core.utilities.results.Result;

public interface IndividualCustomerService {
	Result add(CreateIndividualCustomerRequest createIndividualCustomerRequest);

	Result delete(int id);

	Result update(UpdateIndividualCustomerRequest updateIndividualCustomerRequest);

	DataResult<GetIndividualCustomerDto> getById(int id);

	DataResult<List<IndividualCustomerListDto>> getAll();
}