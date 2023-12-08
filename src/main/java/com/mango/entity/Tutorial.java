package com.mango.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "tutorials")
public class Tutorial {

	@Id
	private String id;

	private String title;
	private String description;
	private boolean published;
}
