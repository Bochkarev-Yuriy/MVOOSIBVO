package ru.mvoo.sib.vo.mvoosibvo.model;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Data
@NoArgsConstructor
@Table(name = "country", schema = "public")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NonNull
	@Column(name = "id")
	private Long id;

	@NonNull
	@Column(name = "name", length = 20, nullable = false, unique = true)
	private String name;

	@NonNull
	@OneToOne(mappedBy = "country")
	private Address address;
}
