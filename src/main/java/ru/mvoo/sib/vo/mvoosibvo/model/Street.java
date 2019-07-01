package ru.mvoo.sib.vo.mvoosibvo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@Table(name = "street", schema = "public")
public class Street implements Serializable {

	private static final long serialVersionUID = -9044155711326760259L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NonNull
	@Column(name = "id")
	private Long id;

	@NonNull
	@Column(name = "name", length = 20, nullable = false, unique = true)
	private String name;

	@NonNull
	@OneToOne(mappedBy = "street")
	private Address address;
}