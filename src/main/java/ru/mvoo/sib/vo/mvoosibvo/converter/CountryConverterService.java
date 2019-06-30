package ru.mvoo.sib.vo.mvoosibvo.converter;

import ru.mvoo.sib.vo.mvoosibvo.dto.CountryDTO;
import ru.mvoo.sib.vo.mvoosibvo.model.Country;

public interface CountryConverterService {

	CountryDTO getCountryByEntity(Country country);
}
