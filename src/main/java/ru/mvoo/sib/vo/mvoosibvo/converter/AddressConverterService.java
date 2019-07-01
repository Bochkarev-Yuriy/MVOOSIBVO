package ru.mvoo.sib.vo.mvoosibvo.converter;

import ru.mvoo.sib.vo.mvoosibvo.dto.AddressDTO;
import ru.mvoo.sib.vo.mvoosibvo.model.Address;

public interface AddressConverterService {

	AddressDTO getAddressDtoByEntity(Address address);
}
