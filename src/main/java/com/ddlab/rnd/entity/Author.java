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

@Entity(name="Author")
@Table(name="author")
@Getter @Setter @ToString(exclude="books") @NoArgsConstructor
public class Author {
	
	@Id @GeneratedValue
	private Long id;
	
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "authors")
	private Set<Book> books = new HashSet<>();
	
	public Author(String name) {
		this.name = name;
	}
}
