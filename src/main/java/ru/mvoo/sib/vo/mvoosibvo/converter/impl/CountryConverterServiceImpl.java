package ru.mvoo.sib.vo.mvoosibvo.converter.impl;

import org.springframework.stereotype.Service;
import ru.mvoo.sib.vo.mvoosibvo.converter.CountryConverterService;
import ru.mvoo.sib.vo.mvoosibvo.dto.CountryDTO;
import ru.mvoo.sib.vo.mvoosibvo.model.Country;

@Service
public class CountryConverterServiceImpl implements CountryConverterService {

	@Override
	public CountryDTO getCountryDtoByEntity(Country country) {
		CountryDTO countryDTO = new CountryDTO();
		countryDTO.setId(country.getId());
		countryDTO.setName(country.getName());
		return countryDTO;
	}
}
