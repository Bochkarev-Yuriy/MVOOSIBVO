package ru.mvoo.sib.vo.mvoosibvo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AddressDTO implements Serializable {
	private Long id;
	private CountryDTO countryDTO;
	private CityDTO cityDTO;
	private StreetDTO streetDTO;
	private Long house_number;
	private Long postcode;
}
