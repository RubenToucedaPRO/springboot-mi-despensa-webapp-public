package com.midespensa.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.midespensa.dtos.RecipeDTO;
import com.midespensa.entities.Difficulty;
import com.midespensa.entities.Recipe;
import com.midespensa.entities.RecipeCategory;
import com.midespensa.entities.User;
import com.midespensa.mappers.RecipeMapper;
import com.midespensa.services.DifficultyService;
import com.midespensa.services.RecipeCategoryService;
import com.midespensa.services.RecipeService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

/**
 * Controlador encargado de manejar las rutas de las recetas: listar, ver,
 * editar y eliminar
 */
@Controller
@RequestMapping("/recipes")
@RequiredArgsConstructor
public class RecipesController {

	private final RecipeService recipeService;
	private final DifficultyService difficultyService;
	private final RecipeCategoryService recipeCategoryService;
	private final RecipeMapper recipeMapper;

	/**
	 * Muestra la página de recetas visibles al usuario autenticado teniendo en
	 * cuenta los filtros de dificultad, categoria, ingredientes y con todos o algún
	 * ingrediente.
	 *
	 * @param difficultyId id de la dificultad selecccionada
	 * @param categoryId   id de la categrodía selecccionada
	 * @param ingredientes lista de ingredientes
	 * @param exact        boolean indicador de con todos los ingredientes en la
	 *                     receta o con alguno
	 * @param user         Usuario autenticado obtenido del AuthenticationPrincipal
	 * @param model        Objeto Model usado para pasar datos a la vista Thymeleaf
	 * @return El nombre de la vista Thymeleaf
	 */
	@GetMapping("/list")
	public String getAll(@RequestParam(name = "difficulty", required = false) Integer difficultyId,
			@RequestParam(name = "category", required = false) Integer categoryId,
			@RequestParam(required = false) List<String> ingredients,
			@RequestParam(defaultValue = "false") boolean exact, @AuthenticationPrincipal User user, Model model) {

		// TODO: lógica oculta en versión pública
		
		return "recipe/recipe-list";
	}

	/**
	 * Muestra la página de detalles de la receta al usuario autenticado.
	 *
	 * @param model Objeto Model usado para pasar datos a la vista Thymeleaf
	 * @param user  Usuario autenticado obtenido del AuthenticationPrincipal
	 * @return El nombre de la vista Thymeleaf
	 */
	@GetMapping("/view")
	public String view(@RequestParam int id, Model model, @AuthenticationPrincipal User user) {
		Recipe recipe = recipeService.getById(id);
		model.addAttribute("recipeDTO", recipeMapper.toDto(recipe));
		model.addAttribute("user", user.getId());
		return "recipe/recipe-view";
	}

	/**
	 * Muestra el formulario para añadir nueva receta.
	 *
	 * @param model Objeto Model usado para pasar datos a la vista Thymeleaf
	 * @return El nombre de la vista Thymeleaf
	 */
	@GetMapping("/new")
	public String add(Model model) {

		// TODO: lógica oculta en versión pública
		
		return "recipe/recipe-form";
	}

	/**
	 * Muestra el formulario para editar receta.
	 *
	 * @param id    entero usado para pasar id de la receta a borrar desde la vista
	 *              Thymeleaf
	 * @param user  Usuario autenticado obtenido del AuthenticationPrincipal
	 * @param model Objeto Model usado para pasar datos a la vista Thymeleaf
	 * @return Redirección a la vista Thymeleaf
	 */
	@GetMapping("/{id}/edit")
	public String edit(@PathVariable int id, @AuthenticationPrincipal User user, Model model) {

		// TODO: lógica oculta en versión pública
		
		return "recipe/recipe-form";
	}

	/**
	 * Editar la receta seleccionada
	 *
	 * @param recipeDTO          datos de la receta desde la vista Thymeleaf
	 * @param imageFile          archivo de imagen adjunta
	 * @param user               Usuario autenticado obtenido del
	 *                           AuthenticationPrincipal
	 * @param redirectAttributes redirigir mensaje de operación existosa a la vista
	 * @param model              Objeto Model usado para pasar datos a la vista
	 *                           Thymeleaf
	 * @return Redirección a la vista Thymeleaf
	 */
	@PostMapping("/edit")
	public String save(@Valid @ModelAttribute RecipeDTO recipeDTO, @RequestParam MultipartFile imageFile,
			@AuthenticationPrincipal User user, RedirectAttributes redirectAttributes, Model model) {

		// TODO: lógica oculta en versión pública
		
		return "redirect:/recipes/list";
	}

	/**
	 * Borrar la receta seleccionada
	 *
	 * @param id                 entero usado para pasar id de la receta a borrar
	 *                           desde la vista Thymeleaf
	 * @param redirectAttributes redirigir mensaje de operación existosa a la vista
	 * @return Redirección a la vista Thymeleaf
	 */
	@PostMapping("/{id}/delete")
	public String delete(@PathVariable int id, RedirectAttributes redirectAttributes) {

		// TODO: lógica oculta en versión pública
		
		return "redirect:/recipes/list";
	}
}
