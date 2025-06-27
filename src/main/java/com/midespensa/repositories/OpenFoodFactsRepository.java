package com.midespensa.repositories;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.midespensa.entities.Barcode;
import com.midespensa.exceptions.OpenFoodFactsApiException;

import pl.coderion.model.Product;
import pl.coderion.model.ProductResponse;
import pl.coderion.service.OpenFoodFactsWrapper;
import pl.coderion.service.impl.OpenFoodFactsWrapperImpl;

/**
 * Repositorio que obtiene a partir del código de barras los datos del producto
 * de la API Externa OpenFoodsFacts
 */
@Repository
public class OpenFoodFactsRepository {

	/**
	 * Obtiene los datos de un producto desde la API de Open Food Facts usando su
	 * código de barras.
	 *
	 * @param code Código de barras del producto a buscar
	 * @return Un Optional que contiene el objeto Barcode si se encuentra el
	 *         producto, o un Optional vacío si no existe o hay un fallo en la
	 *         llamada a la API.
	 * @throws OpenFoodFactsApiException si ocurre un error en la conexión con la
	 *                                   API externa
	 */
	public Optional<Barcode> getProduct(String code) {
		OpenFoodFactsWrapper wrapper = new OpenFoodFactsWrapperImpl();


		// TODO: lógica oculta en versión pública
		
		return Optional.empty();

	}
}
