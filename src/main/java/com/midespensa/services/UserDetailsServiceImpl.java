package com.midespensa.services;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.midespensa.entities.User;
import com.midespensa.exceptions.UserException;
import com.midespensa.repositories.UsersRepository;

import lombok.RequiredArgsConstructor;

/**
 * Servicio encargado de manejar la lógica de chequeo cuenta validada en Spring
 * Security
 */
@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

	private final UsersRepository usersRepository;

	@Override
	public UserDetails loadUserByUsername(String username) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}

}
