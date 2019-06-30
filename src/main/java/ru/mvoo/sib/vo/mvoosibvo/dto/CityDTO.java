package ru.mvoo.sib.vo.mvoosibvo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CityDTO implements Serializable {
	private Long id;
	private String name;
	private AddressDTO addressDTO;
}
