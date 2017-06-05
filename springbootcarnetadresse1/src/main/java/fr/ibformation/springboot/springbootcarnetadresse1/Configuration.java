package fr.ibformation.springboot.springbootcarnetadresse1;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@org.springframework.context.annotation.Configuration
@ComponentScan({"fr.ibformation.springboot.springbootcarnetadresse1"})//cherche tous les components a scanner
@EntityScan({"models1"})//cherche toutes les entités a mettre dans la bdd
public class Configuration {}
