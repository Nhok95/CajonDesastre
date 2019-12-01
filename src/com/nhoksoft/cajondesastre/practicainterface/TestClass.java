package com.nhoksoft.cajondesastre.practicainterface;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class TestClass {

	private ProductoServices productoServices = new ProductoServicesImplD();
	
	private void run() {
		
		Producto producto = productoServices.read(100);
		//System.out.println(producto);
		
		producto.setDescatalogado(true);
		producto.setNombre("Impresora Epson L2 PRO");
		
		//System.out.println(producto);
		productoServices.update(producto);
		
		//Producto producto = productoServices.delete(100); 
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date f1 = null;
		Date desde = null;
		Date hasta = null;
		
		try {
			f1 = sdf.parse("17/11/2016");
			desde = sdf.parse("11/11/2016");
			hasta = sdf.parse("16/11/2016");		
		}
		catch(Exception e) {
			
		}
		
		Producto p1 = new Producto(0,"Alfombrilla Lionel Messi",f1,4.0,Familia.CONSUMIBLE);
		p1 = productoServices.create(p1);
		
		//Producto np3 = new Producto(108,"Alfombrilla Cristiano Ronaldo",f1,20.00,Familia.CONSUMIBLE);
		//Producto producto2 = productoServices.update(np3);
		
		//List<Producto> listProductos = productoServices.getAll();
		//List<Producto> listProductos = productoServices.getByFamilia(Familia.CONSUMIBLE);
		//List<Producto> listProductos = productoServices.getDescatalogados();
		//List<Producto> listProductos = productoServices.getBetweenPriceRange(2, 8);
		List<Producto> listProductos = productoServices.getBetweenDates(desde, hasta);
		//List<Producto> listProductos = productoServices.getOrderedByCode();
		for (Producto p: listProductos) {
			System.out.println(p);
		}
		
		//int n =  productoServices.getNumberOfProductosByFamilia(Familia.SOFTWARE);
		//System.out.println("Número de productos: " + n);
		
		Map<Familia, Double> mapF = productoServices.getPrecioMedio();
		
		for (Familia key: mapF.keySet()) {
			System.out.println(key + ": " + mapF.get(key));
		}
	
		
	}
	
	public static void main(String[] args) {
		new TestClass().run();
	}

}
