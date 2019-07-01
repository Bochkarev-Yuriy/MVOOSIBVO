package ru.mvoo.sib.vo.mvoosibvo.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@Table(name = "city", schema = "public")
public class City implements Serializable {

	private static final long serialVersionUID = -3820014430594967199L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NonNull
	@Column(name = "id")
	private Long id;

	@NonNull
	@Column(name = "name", length = 20, nullable = false, unique = true)
	private String name;

	@NonNull
	@OneToOne(mappedBy = "city")
	private Address address;
}
