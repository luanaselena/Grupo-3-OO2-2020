package com.unla.Grupo30022020.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.Grupo30022020.entities.Lote;
import com.unla.Grupo30022020.models.LoteModel;

@Component("loteConverter")
public class LoteConverter {

	@Autowired
	@Qualifier("productoConverter")
	private ProductoConverter productoConverter;
	
	public LoteModel entityToModel(Lote lote) {
		return new LoteModel(lote.getId(), productoConverter.entityToModel(lote.getProducto()), lote.getCantidad(), lote.getCantidadTotal(), lote.getFechaIngreso());
	}

	public Lote modelToEntity(LoteModel loteModel) {
		return new Lote(loteModel.getId(), productoConverter.modelToEntity(loteModel.getProducto()) , loteModel.getCantidad(), loteModel.getCantidadTotal(), loteModel.getFechaIngreso());
	}
}