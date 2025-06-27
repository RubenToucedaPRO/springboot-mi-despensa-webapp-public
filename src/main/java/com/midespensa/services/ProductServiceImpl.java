package com.midespensa.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.midespensa.dtos.ProductDTO;
import com.midespensa.entities.Barcode;
import com.midespensa.entities.IdProductIdUser;
import com.midespensa.entities.Pantry;
import com.midespensa.entities.Product;
import com.midespensa.entities.ShoppingListItem;
import com.midespensa.exceptions.ProductNotFoundException;
import com.midespensa.exceptions.ProductUpdateException;
import com.midespensa.mappers.ProductMapper;
import com.midespensa.repositories.OpenFoodFactsRepository;
import com.midespensa.repositories.PantryRepository;
import com.midespensa.repositories.ProductRepository;
import com.midespensa.repositories.ShoppingListRepository;

import lombok.RequiredArgsConstructor;

/**
 * Servicio encargado de manejar la lógica de productos en la aplicación
 */
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
	private final ProductRepository productRepository;
	private final PantryRepository pantryRepository;
	private final ShoppingListRepository shoppingListRepository;
	private final OpenFoodFactsRepository openFoodFactsRepository;
	private final ProductMapper productMapper;
	
	@Override
	public Page<ProductDTO> getAllProducts(Pageable pageable) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}
	
	@Override
	public Page<ProductDTO> getAllProductsNotIdUser(Pageable pageable, int idUser) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}
	
	@Override
	public ProductDTO getById(int id) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}
	
	@Override
	public void addProduct(ProductDTO productDto) {

		// TODO: lógica oculta en versión pública
		
		
	}
	
	@Override
	public ProductDTO addProductFromPantry(String barcode, int idUser) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}
	
	@Override
	public ProductDTO addProductFromShoppingList(String barcode, int idUser) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}
	
	@Override
	public void updateProduct(ProductDTO productDto) {

		// TODO: lógica oculta en versión pública
		
	}
	
	@Override
	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public ProductDTO getByBarcode(String barcode, boolean pantry, int idUser) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}
	
	@Override
	public void updateProductsFromOpenFoodFacts() {

		// TODO: lógica oculta en versión pública
		
	}

	

}
