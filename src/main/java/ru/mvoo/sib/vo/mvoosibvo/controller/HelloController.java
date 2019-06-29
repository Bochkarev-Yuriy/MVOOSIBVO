package ru.mvoo.sib.vo.mvoosibvo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.mvoo.sib.vo.mvoosibvo.service.abstr.AddressService;

@Controller
public class HelloController {

	private AddressService addressService;

	@Autowired
	public void setAddressService(AddressService addressService) {
		this.addressService = addressService;
	}

	@RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("addressView", addressService.getAddressById(1L));
		return modelAndView;
	}
}
