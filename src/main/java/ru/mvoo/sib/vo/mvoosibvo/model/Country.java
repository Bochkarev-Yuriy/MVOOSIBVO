package ru.mvoo.sib.vo.mvoosibvo.model;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "country", schema = "public")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "name", length = 20, nullable = false, unique = true)
	private String name;

	@OneToOne(mappedBy = "country")
	private Address address;

	public Country() {
	}

	public Country(String name, Long id) {
		this.name = name;
		this.id = id;
	}

	public Country(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Country country = (Country) o;
		return Objects.equals(id, country.id) &&
				Objects.equals(name, country.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		return "Country{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
