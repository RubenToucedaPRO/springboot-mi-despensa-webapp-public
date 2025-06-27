package com.midespensa.mappers;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

import com.midespensa.dtos.RecipeDTO;
import com.midespensa.entities.Ingredient;
import com.midespensa.entities.Recipe;
import com.midespensa.entities.Tag;
import com.midespensa.repositories.IngredientRepository;
import com.midespensa.repositories.TagRepository;

@Mapper(componentModel = "spring")
public abstract class RecipeMapper {

	@Autowired
	private IngredientRepository ingredientRepository;

	@Autowired
	private TagRepository tagRepository;


	// TODO: lógica oculta en versión pública
	
	public abstract RecipeDTO toDto(Recipe recipe);


	// TODO: lógica oculta en versión pública
	
	public abstract Recipe toRecipe(RecipeDTO recipeDTO);

	@Named("mapIngredientsToNames")
	protected Set<String> mapIngredientsToNames(Set<Ingredient> ingredients) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}

	@Named("mapNamesToIngredients")
	protected Set<Ingredient> mapNamesToIngredients(Set<String> ingredientNames) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}

	// Al guardar receta verifica si existe el ingrediente en el repositorio y si no
	// lo añade
	protected Ingredient findOrCreateIngredient(String ingredientName) {
		

			// TODO: lógica oculta en versión pública
			
			return null;
	}

	@Named("mapTagsToNames")
	protected Set<String> mapTagsToNames(Set<Tag> tags) {

		// TODO: lógica oculta en versión pública
		
		return tags.stream().map(Tag::getName).collect(Collectors.toSet());
	}

	@Named("mapNamesToTags")
	protected Set<Tag> mapNamesToTags(Set<String> tagNames) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}
}