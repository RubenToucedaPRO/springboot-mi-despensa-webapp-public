package com.midespensa.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.midespensa.dtos.ProductDTO;
import com.midespensa.entities.User;
import com.midespensa.services.PantryService;
import com.midespensa.services.ShoppingListService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

/**
 * Controlador encargado de manejar las rutas de la despensa
 */
@Controller
@RequestMapping("/pantry")
@RequiredArgsConstructor
public class PantryController {

	private final PantryService pantryService;
	private final ShoppingListService shoppingListService;

	/**
	 * Muestra la página de la despensa del usuario autenticado.
	 *
	 * @param request Objeto HttpServletRequest para detectar si se accede desde
	 *                móvil
	 * @param model   Objeto Model usado para pasar datos a la vista Thymeleaf
	 * @param page    Número de página para la paginación
	 * @param size    Tamaño de página (por defecto 11)
	 * @param user    Usuario autenticado obtenido del AuthenticationPrincipal
	 * @return El nombre de la vista Thymeleaf
	 */
	@GetMapping("/list")
	public String findAll(HttpServletRequest request, Model model, @RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "#{'${app.default.page.size}'}") int size, @AuthenticationPrincipal User user) {
		
		// TODO: lógica oculta en versión pública
		
		return "pantry/pantry-list";
	}

	/**
	 * Añadir producto desde modal con datos a mano.
	 *
	 * @param productDTO Objeto ProductDTO usado para pasar datos del producto desde
	 *                   la vista Thymeleaf
	 * @param user       Usuario autenticado obtenido del AuthenticationPrincipal
	 * @param page       Número de página para la paginación
	 * @param size       Tamaño de página (por defecto 11)
	 * @return Redirección a la vista Thymeleaf
	 */
	@PostMapping("/new")
	public String addProduct(@ModelAttribute ProductDTO productDTO, @AuthenticationPrincipal User user,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "#{'${app.default.page.size}'}") int size) {

		// TODO: lógica oculta en versión pública
		
		return "redirect:/pantry/list?page=" + page + "&size=" + size;
	}

	/**
	 * Modificar unidades del producto.
	 *
	 * @param id    entero usado para pasar id del producto desde la vista Thymeleaf
	 * @param unity entero usado para pasar las unidade del producto desde la vista
	 *              Thymeleaf
	 * @param user  Usuario autenticado obtenido del AuthenticationPrincipal
	 * @param page  Número de página para la paginación
	 * @param size  Tamaño de página (por defecto 11)
	 * @return Redirección a la vista Thymeleaf
	 */
	@PostMapping("/updateUnits")
	public String updateUnity(@RequestParam int id, @RequestParam int unity, @AuthenticationPrincipal User user,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "#{'${app.default.page.size}'}") int size) {

		// TODO: lógica oculta en versión pública
		
		return "redirect:/pantry/list?page=" + page + "&size=" + size;
	}

	/**
	 * Enviar un producto a la despensa desde la lista de la compra
	 *
	 * @param id                 entero usado para pasar id del producto desde la
	 *                           vista Thymeleaf
	 * @param user               Usuario autenticado obtenido del
	 *                           AuthenticationPrincipal
	 * @param page               Número de página para la paginación
	 * @param size               Tamaño de página (por defecto 11)
	 * @param redirectAttributes redirigir los mensajes de operacion existosa a la
	 *                           vista
	 * @return Redirección a la vista Thymeleaf
	 */
	@PostMapping("/{id}/addFromSL")
	public String addProductFromSL(@PathVariable int id, @AuthenticationPrincipal User user,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "#{'${app.default.page.size}'}") int size,
			RedirectAttributes redirectAttributes) {

		// TODO: lógica oculta en versión pública
		
		return "redirect:/shoppingList/list?page=" + page + "&size=" + size;
	}

	/**
	 * Borrar el producto seleccionado
	 *
	 * @param id   entero usado para pasar id del producto a borrar desde la vista
	 *             Thymeleaf
	 * @param user Usuario autenticado obtenido del AuthenticationPrincipal
	 * @param page Número de página para la paginación
	 * @param size Tamaño de página (por defecto 11)
	 * @return Redirección a la vista Thymeleaf
	 */
	@PostMapping("/{id}/delete")
	public String deleteProduct(@PathVariable int id, @AuthenticationPrincipal User user,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "#{'${app.default.page.size}'}") int size) {

		// TODO: lógica oculta en versión pública
		
		return "redirect:/pantry/list?page=" + page + "&size=" + size;
	}

	/**
	 * Muestra la página formulario producto a editar desde de la despensa del
	 * usuario autenticado
	 *
	 * @param id      entero usado para pasar id del producto a editar desde la
	 *                vista Thymeleaf
	 * @param context Indica el contexto que podría ser pantry o shoppingList
	 * @param model   Objeto Model usado para pasar datos a la vista Thymeleaf
	 * @param user    Usuario autenticado obtenido del AuthenticationPrincipal
	 * @param page    Número de página para la paginación
	 * @param size    Tamaño de página (por defecto 11)
	 * @return Redirección a la vista Thymeleaf
	 */
	@GetMapping("/{id}/edit")
	public String editProduct(@PathVariable int id,
			@RequestParam(required = false, defaultValue = "pantry") String context, Model model,
			@AuthenticationPrincipal User user, @RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "#{'${app.default.page.size}'}") int size) {

		// TODO: lógica oculta en versión pública
		
		return "pantry/pantry-form";
	}

	/**
	 * Actualizar un producto dependiendo del contexto para diferenciar a que vista
	 * redirigir
	 *
	 * @param productDTO datos del producto desde la vista Thymeleaf
	 * @param context    Indica el contexto que podría ser pantry o shoppingList
	 * @param page       Número de página para la paginación
	 * @param size       Tamaño de página (por defecto 11)
	 * @return Redirección a la vista Thymeleaf correspondiente en función del
	 *         contexto
	 */
	@PostMapping("/edit")
	public String updateProduct(@ModelAttribute ProductDTO productDTO, @RequestParam String context,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "#{'${app.default.page.size}'}") int size) {

		// TODO: lógica oculta en versión pública
		
		return "redirect:/pantry/list?page=" + page + "&size=" + size;
	}

	/**
	 * Vaciar la despensa desde la pagina de ajustes usuario
	 *
	 * @param user Usuario autenticado obtenido del AuthenticationPrincipal
	 * @param page Número de página para la paginación
	 * @param size Tamaño de página (por defecto 11)
	 * @return Redirección a la vista Thymeleaf
	 */
	@PostMapping("/deleteAll")
	public String deleteAllProduct(@AuthenticationPrincipal User user, @RequestParam(defaultValue = "#{'${app.default.page.size}'}") int page,
			@RequestParam(defaultValue = "10") int size) {

		// TODO: lógica oculta en versión pública
		
		return "redirect:/pantry/list?page=" + page + "&size=" + size;
	}
}
