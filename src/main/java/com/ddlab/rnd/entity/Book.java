package com.ddlab.rnd.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "Book")
@Table(name = "book")
@Getter
@Setter
@ToString(exclude = "authors")
@NoArgsConstructor
public class Book {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Author> authors = new HashSet<>();

	public Book(String name) {
		this.name = name;
	}

}
