package ru.mvoo.sib.vo.mvoosibvo.model;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "city", schema = "public")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "name", length = 20, nullable = false, unique = true)
	private String name;

	@OneToOne(mappedBy = "city")
	private Address address;

	public City() {
	}

	public City(String name, Long id) {
		this.name = name;
		this.id = id;
	}

	public City(String name) {
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
		City city = (City) o;
		return Objects.equals(id, city.id) &&
				Objects.equals(name, city.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		return "City{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
