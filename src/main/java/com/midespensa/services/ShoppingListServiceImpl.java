package com.midespensa.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.midespensa.dtos.ProductDTO;
import com.midespensa.entities.IdProductIdUser;
import com.midespensa.entities.Product;
import com.midespensa.entities.ShoppingListItem;
import com.midespensa.entities.User;
import com.midespensa.exceptions.EmailSendException;
import com.midespensa.mappers.ProductMapper;
import com.midespensa.repositories.ProductRepository;
import com.midespensa.repositories.ShoppingListRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

/**
 * Servicio encargado de manejar la lógica de manejar la lista de la compra
 */
@Service
@RequiredArgsConstructor
public class ShoppingListServiceImpl implements ShoppingListService {
	private final ShoppingListRepository shoppingListRepository;
	private final ProductRepository productRepository;
	private final ProductMapper productMapper;
	private final EmailService emailService;
	
	@Override
	public Page<ProductDTO> getAllByIdUser(int userId, Pageable pageable) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}
	
	@Override
	public void addProductFromPantry(int idProduct, int idUser) {

		// TODO: lógica oculta en versión pública
		
		
	}
	
	@Override
	public void addProductManual(ProductDTO product, int idUser) {

		// TODO: lógica oculta en versión pública
				
	}
	@Override
	public void updateUnity(int id, int unity, int idUser) {

		// TODO: lógica oculta en versión pública
			
	}
	
	@Override
	public void delete(int idProduct, int idUser) {

		// TODO: lógica oculta en versión pública
				
	}
	
	@Override
	public void deleteAll(int idUser) {

		// TODO: lógica oculta en versión pública
				
	}
	
	@Override
	public long getShoppingListSize(int id) {

		// TODO: lógica oculta en versión pública
		
		return 0;
	}
	
	@Override
	public boolean sendShoppingList(User user) {

		// TODO: lógica oculta en versión pública
		
		return false;
	}

	

}
