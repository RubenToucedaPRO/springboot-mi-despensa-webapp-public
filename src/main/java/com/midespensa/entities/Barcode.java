package com.midespensa.entities;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Barcode {

	@JsonProperty("code")
	private String barcode;

	@JsonAlias({ "product_name_es", "generic_name_es" })
	private String title;


	// TODO: lógica oculta en versión pública
	
}
