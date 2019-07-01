package ru.mvoo.sib.vo.mvoosibvo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class StreetDTO implements Serializable {

	private static final long serialVersionUID = -7590719046362346057L;
	private Long id;
	private String name;
	private AddressDTO addressDTO;
}
