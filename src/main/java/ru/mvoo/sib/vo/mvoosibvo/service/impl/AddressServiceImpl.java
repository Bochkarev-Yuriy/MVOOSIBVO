package ru.mvoo.sib.vo.mvoosibvo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mvoo.sib.vo.mvoosibvo.dao.abstr.AddressDao;
import ru.mvoo.sib.vo.mvoosibvo.model.Address;
import ru.mvoo.sib.vo.mvoosibvo.service.abstr.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	private final AddressDao userDao;

	@Autowired
	public AddressServiceImpl(AddressDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Address getAddressById(Long id) {
		return userDao.getAddressById(id);
	}
}
