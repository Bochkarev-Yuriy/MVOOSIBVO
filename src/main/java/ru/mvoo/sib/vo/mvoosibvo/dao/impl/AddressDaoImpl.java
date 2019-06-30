package ru.mvoo.sib.vo.mvoosibvo.dao.impl;

import org.springframework.stereotype.Repository;
import ru.mvoo.sib.vo.mvoosibvo.dao.abstr.AddressDao;
import ru.mvoo.sib.vo.mvoosibvo.model.Address;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AddressDaoImpl implements AddressDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Address getAddressById(Long id) {
		return entityManager.find(Address.class, id);
	}
}
