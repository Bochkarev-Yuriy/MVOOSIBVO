package ru.mvoo.sib.vo.mvoosibvo.converter;

import ru.mvoo.sib.vo.mvoosibvo.dto.StreetDTO;
import ru.mvoo.sib.vo.mvoosibvo.model.Street;

public interface StreetConverterService {

	StreetDTO getStreetByEntity(Street street);
}
