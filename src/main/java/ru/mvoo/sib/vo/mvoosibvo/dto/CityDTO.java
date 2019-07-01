package ru.mvoo.sib.vo.mvoosibvo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CityDTO implements Serializable {

	private static final long serialVersionUID = 8352766948782416286L;
	private Long id;
	private String name;
	private AddressDTO addressDTO;
}
