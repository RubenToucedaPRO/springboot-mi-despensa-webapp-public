package com.midespensa.services;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.midespensa.entities.Ingredient;
import com.midespensa.entities.Recipe;
import com.midespensa.entities.Tag;
import com.midespensa.repositories.RecipeRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

/**
 * Servicio encargado de manejar la lógica de manejar las recetas
 */
@Service
@RequiredArgsConstructor
@Transactional
public class RecipeServiceImpl implements RecipeService {

	private final RecipeRepository recipeRepository;

	private final IngredientService ingredientService;

	private final TagService tagService;

	private final CloudinaryService cloudinaryService;

	@Override
	public List<Recipe> findFilter(Integer difficultyId, Integer categoryId, List<String> ingredients, boolean exact,
			int idUser) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}

	@Override
	public List<Recipe> findFilterAdmin(Integer difficultyId, Integer categoryId, List<String> ingredients,
			boolean exact) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}

	@Override
	public Recipe getById(int id) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}

	@Override
	public void save(Recipe recipe, int idUser, MultipartFile imageFile) {

		// TODO: lógica oculta en versión pública
				
	}

	@Override
	public void delete(int id) {

		// TODO: lógica oculta en versión pública
				
	}

	

}
