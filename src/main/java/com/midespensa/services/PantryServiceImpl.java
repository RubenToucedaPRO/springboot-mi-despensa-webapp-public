package com.midespensa.services;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.midespensa.dtos.ProductDTO;
import com.midespensa.entities.IdProductIdUser;
import com.midespensa.entities.Pantry;
import com.midespensa.entities.Product;
import com.midespensa.entities.ShoppingListItem;
import com.midespensa.mappers.ProductMapper;
import com.midespensa.repositories.PantryRepository;
import com.midespensa.repositories.ProductRepository;
import com.midespensa.repositories.ShoppingListRepository;
import com.midespensa.repositories.UsersRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

/**
 * Servicio encargado de manejar la lógica de manejar la despensa
 */
@Service
@RequiredArgsConstructor
public class PantryServiceImpl implements PantryService {
	private final PantryRepository pantryRepository;
	private final ProductRepository productRepository;
	private final ShoppingListRepository shoppingListRepository;
	private final UsersRepository usersRepository;
	private final ProductMapper productMapper;
	@Override
	public Page<ProductDTO> getAllByIdUser(int userId, Pageable pageable) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}
	
	@Override
	public ProductDTO getByIdProduct(int id) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}
	
	@Override
	public void addProductManual(ProductDTO product, int idUser) {

		// TODO: lógica oculta en versión pública
		
	}
	
	@Override
	public void addProductFromShoppingList(int id, int idUser) {

		// TODO: lógica oculta en versión pública
		
	}
	
	@Override
	public void updateProduct(ProductDTO product) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateUnity(int id, int unity, int idUser) {

		// TODO: lógica oculta en versión pública
		
	}
	
	@Override
	public void deleteProduct(int id, int idUser) {

		// TODO: lógica oculta en versión pública
		
	}
	
	@Override
	public void deleteAll(int idUser) {

		// TODO: lógica oculta en versión pública
		
	}

	

}
