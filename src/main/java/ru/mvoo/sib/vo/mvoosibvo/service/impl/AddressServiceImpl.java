package ru.mvoo.sib.vo.mvoosibvo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mvoo.sib.vo.mvoosibvo.converter.AddressConverterService;
import ru.mvoo.sib.vo.mvoosibvo.dao.abstr.AddressDao;
import ru.mvoo.sib.vo.mvoosibvo.dto.AddressDTO;
import ru.mvoo.sib.vo.mvoosibvo.model.Address;
import ru.mvoo.sib.vo.mvoosibvo.service.abstr.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	private AddressDao addressDao;
	private AddressConverterService addressConverterService;

	@Autowired
	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

	@Autowired
	public void setAddressConverterService(AddressConverterService addressConverterService) {
		this.addressConverterService = addressConverterService;
	}

	/**
	 * @param id a {@link Address#id}
	 * @return an instance of an object {@link AddressDTO}
	 */
	@Override
	public AddressDTO getAddressById(Long id) {
		return addressConverterService.getAddressByEntity(addressDao.getAddressById(id));
	}
}
