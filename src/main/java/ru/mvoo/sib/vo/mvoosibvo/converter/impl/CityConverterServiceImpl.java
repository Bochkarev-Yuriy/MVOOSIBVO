package ru.mvoo.sib.vo.mvoosibvo.converter.impl;

import org.springframework.stereotype.Service;
import ru.mvoo.sib.vo.mvoosibvo.converter.CityConverterService;
import ru.mvoo.sib.vo.mvoosibvo.dto.CityDTO;
import ru.mvoo.sib.vo.mvoosibvo.model.City;

@Service
public class CityConverterServiceImpl implements CityConverterService {

	@Override
	public CityDTO getCityByEntity(City city) {
		CityDTO cityDTO = new CityDTO();
		cityDTO.setId(city.getId());
		cityDTO.setName(city.getName());
		return cityDTO;
	}
}
