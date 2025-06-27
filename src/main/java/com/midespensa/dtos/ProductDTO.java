package com.midespensa.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

	private int id;

	private int idUser;

	private String barcode;

	private String title;


	// TODO: lógica oculta en versión pública
	
	public ProductDTO(int id) {
		this.id = id;
	}

	

}
