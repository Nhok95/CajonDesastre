package com.nhoksoft.cajondesastre.practicainterface;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface ProductoServices {
	
	// Operaciones CRUD
	
	public Producto create(Producto producto);
	public Producto read(int codigo);
	public Producto update(Producto producto);
	public Producto delete(int codigo);
	
	// Obtenci�n de listas
	
	public List<Producto> getAll();
	public List<Producto> getByFamilia(Familia familia);
	public List<Producto> getDescatalogados();
	public List<Producto> getBetweenPriceRange(double min, double max);
	public List<Producto> getBetweenDates(Date desde, Date hasta);
	public List<Producto> getOrderedByCode();
	
	// Obtenci�n de estad�sticas y datos agrupados
	
	public int getNumberOfProductosByFamilia(Familia familia);
	public Map<Familia,Double> getPrecioMedio();


}
