package com.test.gis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	  // Aggregate root
	  // tag::get-aggregate-root[]
	  @GetMapping("/users")
	  List<String> all() {
		  
		  List<String> strings = new ArrayList<>();
		  strings.add("Hola");
		  strings.add("Adios");
		  strings.add("Hasta luego");
		  strings.add("Chao");
		  
		  return strings;
	  }
}


