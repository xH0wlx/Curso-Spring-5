package com.cursospringangular.datajpa.app;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.FileSystemUtils;

@SpringBootApplication
public class SpringBootDataJpaApplication implements CommandLineRunner{

	private final static String UPLOADS_FOLDER = "uploads";
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		FileSystemUtils.deleteRecursively(Paths.get(UPLOADS_FOLDER).toFile());
		Files.createDirectory(Paths.get(UPLOADS_FOLDER));
	}
}
