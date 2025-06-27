package com.midespensa.dtos;

import java.util.HashSet;
import java.util.Set;

import com.midespensa.entities.Difficulty;
import com.midespensa.entities.RecipeCategory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecipeDTO {
	private int id;

	private int idUser;

	private String title;

	private Difficulty difficulty;

	private RecipeCategory category;


	// TODO: lógica oculta en versión pública

}
