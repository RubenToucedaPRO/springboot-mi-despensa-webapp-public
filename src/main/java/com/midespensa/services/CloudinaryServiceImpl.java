package com.midespensa.services;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.midespensa.exceptions.CloudinaryException;

import net.coobird.thumbnailator.Thumbnails;

/**
 * Servicio encargado de manejar la logica de envio de imágenes a la nube
 * Cloudinary
 */
@Service
public class CloudinaryServiceImpl implements CloudinaryService {

	private final Cloudinary cloudinary;

	public CloudinaryServiceImpl(@Value("${CLOUDINARY_URL}") String cloudinaryUrl) {
        this.cloudinary = new Cloudinary(cloudinaryUrl);
    }

	@Override
	public Map uploadFile(MultipartFile multipartFile) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}

	@Override
	public Map delete(String nameFile) {

		// TODO: lógica oculta en versión pública
		
		return null;
	}
	
}
