package ru.mvoo.sib.vo.mvoosibvo.converter;

import ru.mvoo.sib.vo.mvoosibvo.dto.CityDTO;
import ru.mvoo.sib.vo.mvoosibvo.model.City;

public interface CityConverterService {

	CityDTO getCityByEntity(City city);
}
