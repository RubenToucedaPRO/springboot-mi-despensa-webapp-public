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
import com.midespensa.services.ProductService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

/**
 * Controlador encargado de manejar las rutas de los productos: crear, editar,
 * ver, eliminar, escanear y actualizar
 */
@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

	private final ProductService productService;

	/**
	 * Muestra la página de productos al administrador autenticado.
	 *
	 * @param request Objeto HttpServletRequest para detectar si se accede desde
	 *                móvil
	 * @param model   Objeto Model usado para pasar datos a la vista Thymeleaf
	 * @param page    Número de página para la paginación
	 * @param size    Tamaño de página (por defecto 6)
	 * @return El nombre de la vista Thymeleaf
	 */
	@GetMapping("/list")
	public String findAll(HttpServletRequest request, Model model, @RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "#{'${app.default.page.size.products}'}") int size) {
		boolean isMobile = request.getHeader("User-Agent").toLowerCase().contains("mobile");
		if (isMobile) {
			size = 10000;
		}

		// TODO: lógica oculta en versión pública
		
		return "product/product-list";
	}

	/**
	 * Muestra la página de productos personalizados al administrador autenticado.
	 *
	 * @param request Objeto HttpServletRequest para detectar si se accede desde
	 *                móvil
	 * @param model   Objeto Model usado para pasar datos a la vista Thymeleaf
	 * @param page    Número de página para la paginación
	 * @param size    Tamaño de página (por defecto 6)
	 * @return El nombre de la vista Thymeleaf
	 */
	@GetMapping("/custom")
	public String findAllFilter(Model model, @RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "#{'${app.default.page.size.products}'}") int size) {

		// TODO: lógica oculta en versión pública
		
		return "product/product-list";
	}

	/**
	 * Muestra la página de detalles del producto al usuario autenticado.
	 *
	 * @param context String para saber el contexto desde el que se accede para
	 *                luego retornar al mismo
	 * @param model   Objeto Model usado para pasar datos a la vista Thymeleaf
	 * @param page    Número de página para la paginación
	 * @param size    Tamaño de página (por defecto 6)
	 * @param user    Usuario autenticado obtenido del AuthenticationPrincipal
	 * @return El nombre de la vista Thymeleaf
	 */
	@GetMapping("/view")
	public String viewProduct(@RequestParam int id,
			@RequestParam(required = false, defaultValue = "product") String context, Model model,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "#{'${app.default.page.size.products}'}") int size,
			@AuthenticationPrincipal User user) {

		// TODO: lógica oculta en versión pública
		
		return "product/product-view";
	}

	/**
	 * Añadir producto desde modal con datos a mano
	 *
	 * @param productDTO Objeto ProductDTO usado para pasar datos del producto desde
	 *                   la vista Thymeleaf
	 * @param user       Usuario autenticado obtenido del AuthenticationPrincipal
	 * @param page       Número de página para la paginación
	 * @param size       Tamaño de página (por defecto 11)
	 * @return Redirección a la vista Thymeleaf
	 */
	@PostMapping("/new")
	public String addProductManual(@ModelAttribute ProductDTO productDTO, @AuthenticationPrincipal User user,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "#{'${app.default.page.size.products}'}") int size) {

		// TODO: lógica oculta en versión pública
		
		return "redirect:/products/list?page=" + page + "&size=" + size;
	}

	/**
	 * Muestra la página de formulario del producto al administrador.
	 *
	 * @param context String para saber el contexto desde el que se accede para
	 *                luego retornar al mismo
	 * @param model   Objeto Model usado para pasar datos a la vista Thymeleaf
	 * @param page    Número de página para la paginación
	 * @param size    Tamaño de página (por defecto 6)
	 * @param user    Usuario autenticado obtenido del AuthenticationPrincipal
	 * @return El nombre de la vista Thymeleaf
	 */
	@GetMapping("/{id}/edit")
	public String editProduct(@PathVariable int id,
			@RequestParam(required = false, defaultValue = "product") String context,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "#{'${app.default.page.size.products}'}") int size, Model model) {

		// TODO: lógica oculta en versión pública
		
		return "product/product-form"; // Devolvemos la misma vista de formulario pero con los datos cargados
	}

	/**
	 * Editar producto desde admin
	 *
	 * @param productDTO Objeto ProductDTO usado para pasar datos del producto desde
	 *                   la vista Thymeleaf
	 * @param page       Número de página para la paginación
	 * @param size       Tamaño de página (por defecto 11)
	 * @return Redirección a la vista Thymeleaf
	 */
	@PostMapping("/edit")
	public String updateProduct(@ModelAttribute("product") ProductDTO productDTO,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "#{'${app.default.page.size.products}'}") int size) {
		productService.updateProduct(productDTO);
		return "redirect:/products/list?page=" + page + "&size=" + size;
	}

	/**
	 * Escanear un producto (puede ser scaneado desde productos, despensa o lista de
	 * la compra
	 *
	 * @param barcode String para código de barras
	 * @param context String para saber el contexto desde el que se accede para
	 *                luego retornar al mismo
	 * @param model   Objeto Model usado para pasar datos a la vista Thymeleaf
	 * @param page    Número de página para la paginación
	 * @param size    Tamaño de página (por defecto 11)
	 * @param user    Usuario autenticado obtenido del AuthenticationPrincipal
	 * @return Redirección a la vista Thymeleaf
	 */
	@PostMapping("/scanner")
	public String getProduct(@RequestParam String barcode,
			@RequestParam(required = false, defaultValue = "product") String context, Model model,
			@AuthenticationPrincipal User user) {

		// TODO: lógica oculta en versión pública
		
		return "product/product-form";
	}

	/**
	 * Borrar el producto seleccionado
	 *
	 * @param id   entero usado para pasar id del producto a borrar desde la vista
	 *             Thymeleaf
	 * @param page Número de página para la paginación
	 * @param size Tamaño de página (por defecto 11)
	 * @return Redirección a la vista Thymeleaf
	 */
	@PostMapping("/{id}/delete")
	public String deleteProduct(Model model, @PathVariable int id, @RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "#{'${app.default.page.size.products}'}") int size, RedirectAttributes redirectAttributes) {

		// TODO: lógica oculta en versión pública
		
		return "redirect:/products/list?page=" + page + "&size=" + size;
	}

	/**
	 * Actualizar productos desde API externa
	 *
	 * @param user Usuario autenticado obtenido del AuthenticationPrincipal
	 * @param page Número de página para la paginación
	 * @param size Tamaño de página (por defecto 11)
	 * @return Redirección a la vista Thymeleaf
	 */
	@PostMapping("/updateOpenFoodFacts")
	public String updateProductsFromOpenFoodFacts(@AuthenticationPrincipal User user,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "#{'${app.default.page.size.products}'}") int size) {

		// TODO: lógica oculta en versión pública
		
		return "redirect:/products/list?page=" + page + "&size=" + size;
	}
}
