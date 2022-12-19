package org.generation.ecommerce;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.generation.ecommerce.model.Producto;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;

@SpringBootTest
@AutoConfigureMockMvc
class EcommerceApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	@Test 
	@Disabled("Se desactiva temporalmente")
	@DisplayName("Prueba el método delete y su resultado")
	public void pruebaDELETE() throws Exception {
		this.mockMvc.perform(delete ("/api/productos/14"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("/ Raya / 150 hojas")));
	} //pruebaGet
	
	
	@Test 
	@DisplayName("Prueba el método get con id del producto=1")
	public void pruebaGET() throws Exception {
		this.mockMvc.perform(get("/api/productos/1"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Cuadro chico")));
	} //pruebaGet
	
	public static String asJsonString(final Object obj) {
	    try {
	      return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	      throw new RuntimeException(e);
	    }//catch
	 } // asJsonString
	
	@Test 
	@DisplayName("Prueba el método post con id del producto=1")
	public void pruebaPOST() throws Exception {
		Producto p=new Producto();
		p.setNombre("Cuaderno Profesional Scribe Clásico / Raya / 150 hojas");
		p.setDescripcion("Cuaderno Profesional Scribe Clásico / Raya / 150 hojas");
		p.setURL_imagen("producto_7.jpg");
		p.setPrecio(74.22);
		this.mockMvc.perform(post("/api/productos/")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(p))
				)
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("/ Raya /")));
	
		} //pruebaPOST
	@Test 
	@DisplayName("Prueba el método put con id del producto=16")
	public void pruebaPUT() throws Exception {
		this.mockMvc.perform(put("/api/productos/16")
				.queryParam("precio", "81.55"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("81.55")));
	} //pruebaGet
}//class