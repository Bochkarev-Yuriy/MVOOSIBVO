package ru.mvoo.sib.vo.mvoosibvo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "addresses", schema = "public")
public class Address implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter @Setter
	@Column(name = "id")
	private Long id;

	@Getter @Setter
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "address_country")
	private Country country;

	@Getter @Setter
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "address_city")
	private City city;

	@Getter @Setter
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "address_street")
	private Street street;

	@Getter @Setter
	@Column(name = "house_number")
	private Long house_number;

	@Getter @Setter
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
