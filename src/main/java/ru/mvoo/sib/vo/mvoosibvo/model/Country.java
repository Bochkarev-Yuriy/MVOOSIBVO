package ru.mvoo.sib.vo.mvoosibvo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Data
@NoArgsConstructor
@Table(name = "country", schema = "public")
public class Country implements Serializable {

	private static final long serialVersionUID = -993833530758465781L;
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
