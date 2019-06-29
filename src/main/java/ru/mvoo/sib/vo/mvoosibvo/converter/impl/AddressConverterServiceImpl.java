package ru.mvoo.sib.vo.mvoosibvo.converter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mvoo.sib.vo.mvoosibvo.converter.AddressConverterService;
import ru.mvoo.sib.vo.mvoosibvo.converter.CityConverterService;
import ru.mvoo.sib.vo.mvoosibvo.converter.CountryConverterService;
import ru.mvoo.sib.vo.mvoosibvo.converter.StreetConverterService;
import ru.mvoo.sib.vo.mvoosibvo.dto.AddressDTO;
import ru.mvoo.sib.vo.mvoosibvo.model.Address;


@Service
public class AddressConverterServiceImpl implements AddressConverterService {

	private CountryConverterService countryConverterService;

	private CityConverterService cityConverterService;

	private StreetConverterService streetConverterService;

	@Autowired
	public void setCountryConverterService(CountryConverterService countryConverterService) {
		this.countryConverterService = countryConverterService;
	}

	@Autowired
	public void setCityConverterService(CityConverterService cityConverterService) {
		this.cityConverterService = cityConverterService;
	}

	@Autowired
	public void setStreetConverterService(StreetConverterService streetConverterService) {
		this.streetConverterService = streetConverterService;
	}

	@Override
	public AddressDTO getAddressByEntity(Address address) {
		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setCountryDTO(countryConverterService.getCountryByEntity(address.getCountry()));
		addressDTO.setCityDTO(cityConverterService.getCityByEntity(address.getCity()));
		addressDTO.setStreetDTO(streetConverterService.getStreetByEntity(address.getStreet()));
		addressDTO.setHouse_number(address.getHouse_number());
		addressDTO.setPostcode(address.getPostcode());
		return addressDTO;
	}
}
