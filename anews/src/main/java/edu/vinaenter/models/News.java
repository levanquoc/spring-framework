package edu.vinaenter.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class News {
	private int id;
	private String name;
	private String decription;
	private String detail;
	private String image;
	private Category cat;
}