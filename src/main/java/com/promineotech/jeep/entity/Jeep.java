package com.promineotech.jeep.entity;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Jeep {
	private Long modelPK; 

	private JeepModel modelId; 

	private String trimLevel; 

	private int numDoors; 

	private int wheelSize; 

	private BigDecimal basePrice; 
}
