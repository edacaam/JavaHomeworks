package com.turkcell.rentACar.business.requests;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarMaintenanceRequest {

	@NotNull
	@Positive
	@NotBlank
	private int carMaintenanceId;
	private String description;
	@NotNull
	private Date returnDate;
	@NotNull
	@Positive
	private int carId;
}