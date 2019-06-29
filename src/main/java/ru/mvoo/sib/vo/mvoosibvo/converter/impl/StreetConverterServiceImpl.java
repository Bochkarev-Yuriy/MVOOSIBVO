package ru.mvoo.sib.vo.mvoosibvo.converter.impl;

import org.springframework.stereotype.Service;
import ru.mvoo.sib.vo.mvoosibvo.converter.StreetConverterService;
import ru.mvoo.sib.vo.mvoosibvo.dto.StreetDTO;
import ru.mvoo.sib.vo.mvoosibvo.model.Street;

@Service
public class StreetConverterServiceImpl implements StreetConverterService {

	@Override
	public StreetDTO getStreetByEntity(Street street) {
		StreetDTO streetDTO = new StreetDTO();
		streetDTO.setId(street.getId());
		streetDTO.setName(street.getName());
		return streetDTO;
	}
}
