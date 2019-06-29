package ru.mvoo.sib.vo.mvoosibvo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
@NoArgsConstructor
@Table(name = "addresses", schema = "public")
public class Address implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@NonNull
	private Long id;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "address_country")
	@NonNull
	private Country country;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "address_city")
	@NonNull
	private City city;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "address_street")
	@NonNull
	private Street street;

	@Column(name = "house_number")
	@NonNull
	private Long house_number;

	@Column(name = "postcode")
	@NonNull
	private Long postcode;
}
