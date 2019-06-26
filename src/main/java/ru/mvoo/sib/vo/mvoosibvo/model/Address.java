package ru.mvoo.sib.vo.mvoosibvo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "addresses", schema = "public")
public class Address implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;


	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "address_country")
	private Country country;


	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "address_city")
	private City city;


	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "address_street")
	private Street street;


	@Column(name = "house_number")
	private Long house_number;

	@Column(name = "postcode")
	private Long postcode;

	public Address() {
	}

	public Address(Country country, City city, Street street, Long house_number, Long postcode) {
		this.country = country;
		this.city = city;
		this.street = street;
		this.house_number = house_number;
		this.postcode = postcode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Street getStreet() {
		return street;
	}

	public void setStreet(Street street) {
		this.street = street;
	}

	public Long getHouse_number() {
		return house_number;
	}

	public void setHouse_number(Long house_number) {
		this.house_number = house_number;
	}

	public Long getPostcode() {
		return postcode;
	}

	public void setPostcode(Long postcode) {
		this.postcode = postcode;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Address address = (Address) o;
		return Objects.equals(id, address.id) &&
				Objects.equals(country, address.country) &&
				Objects.equals(city, address.city) &&
				Objects.equals(street, address.street) &&
				Objects.equals(house_number, address.house_number) &&
				Objects.equals(postcode, address.postcode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, country, city, street, house_number, postcode);
	}

	@Override
	public String toString() {
		return "Address{" +
				"id=" + id +
				", country=" + country +
				", city=" + city +
				", street=" + street +
				", house_number=" + house_number +
				", postcode=" + postcode +
				'}';
	}
}
