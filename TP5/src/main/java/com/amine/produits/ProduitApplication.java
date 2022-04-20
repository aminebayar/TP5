package com.amine.produits;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.amine.produits.controllers.ProduitController;
import com.amine.produits.entities.Produit;
import com.amine.produits.service.ProduitService;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@Import(ProduitController.class)
public class ProduitApplication implements CommandLineRunner {
@Autowired
private RepositoryRestConfiguration repositoryRestConfiguration;
ProduitService produitService;
public static void main(String[] args) {
SpringApplication.run(ProduitApplication.class, args);

}
@Override
public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Produit.class);
}}