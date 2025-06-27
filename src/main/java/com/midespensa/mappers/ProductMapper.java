package com.midespensa.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.midespensa.dtos.ProductDTO;
import com.midespensa.entities.Barcode;
import com.midespensa.entities.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {

	Barcode ToBarcode(Product product);

	@Mapping(target = "id", ignore = true)
	// TODO: lógica oculta en versión pública
	Product toProduct(Barcode barcode);


	// TODO: lógica oculta en versión pública
	ProductDTO toDto(Product product);

	@Mapping(target = "pantries", ignore = true)
	Product toProduct(ProductDTO productDTO);
}
