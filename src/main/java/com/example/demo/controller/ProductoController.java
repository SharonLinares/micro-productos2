package com.example.demo.controller;

import java.util.List;

import com.example.demo.dto.ProductoDto;
import com.example.demo.service.ProductoService;

public class ProductoController {

	private ProductoService productoService = new ProductoService();

	public void agregarProducto(ProductoDto productodto) {
		productoService.agregarProducto(productodto);
	}

	public void imprimirProductos() {

		List<ProductoDto> traeLista = productoService.consultarProducto();
		// ProductoDto producto0 = traeLista.get(0);
		// ProductoDto producto1 = traeLista.get(1);
		System.out.println("imprimiendo con for inicial");
		for (int i = 0; i < traeLista.size(); i++) {
			ProductoDto productodto = traeLista.get(i);
			System.out.println("este es el codigo: " + productodto.getCodigo());
		}

		System.out.println("imprimiendo con forEach");
		for (ProductoDto productoDto : traeLista) {
			System.out.println("este es el nombre del producto: " + productoDto.getNombre());
		}

	}

}
