package com.midespensa.services;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.midespensa.dtos.UserRegisterDTO;
import com.midespensa.dtos.UserViewDTO;
import com.midespensa.entities.User;
import com.midespensa.exceptions.EmailSendException;
import com.midespensa.exceptions.UserException;
import com.midespensa.mappers.UserMapper;
import com.midespensa.repositories.UsersRepository;

import io.micrometer.common.util.StringUtils;
import lombok.RequiredArgsConstructor;

/**
 * Servicio encargado de manejar la lógica de gestión de usuarios
 */
@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {
	private final UsersRepository usersRepository;
	private final PasswordEncoder passwordEncoder;
	private final EmailService emailService;
	private final UserMapper userMapper;
	
	@Override
	public Page<UserViewDTO> findAll(Pageable pageable) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}
	
	@Override
	public boolean registerUser(UserRegisterDTO userRDto) {

		// TODO: lógica oculta en versión pública
		
		return false;
	}
	
	@Override
	public void saveUser(User user, boolean encodePass, boolean sendEmail) {

		// TODO: lógica oculta en versión pública
		
		
	}
	
	@Override
	public String processForgotPassword(String userEmail) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}
	
	@Override
	public boolean validateEmail(String token) {

		// TODO: lógica oculta en versión pública
		
		return false;
	}
	
	@Override
	public boolean isTokenExpired(String token) {

		// TODO: lógica oculta en versión pública
		
		return false;
	}
	
	@Override
	public Optional<User> findUserByToken(String token) {

		// TODO: lógica oculta en versión pública
		
		return Optional.empty();
	}
	
	@Override
	public String updateUser(User user) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}
	
	@Override
	public void deleteUserById(int id) {

		// TODO: lógica oculta en versión pública
		
		
	}

	
}
