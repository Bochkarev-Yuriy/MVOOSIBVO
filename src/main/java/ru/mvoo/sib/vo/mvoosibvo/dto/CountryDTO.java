package ru.mvoo.sib.vo.mvoosibvo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CountryDTO implements Serializable {

	private static final long serialVersionUID = -5403003361851575311L;
	private Long id;
	private String name;
	private AddressDTO addressDTO;
}
