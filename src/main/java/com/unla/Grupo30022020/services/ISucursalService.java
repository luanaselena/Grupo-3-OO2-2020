package com.unla.Grupo30022020.services;

import com.unla.Grupo30022020.entities.Direccion;
import com.unla.Grupo30022020.entities.Sucursal;
import com.unla.Grupo30022020.models.SucursalModel;

import java.util.List;

public interface ISucursalService {

    public List<Sucursal> getAll();

    public SucursalModel findById(long id);

    public SucursalModel findByDireccion(Direccion direccion);

    public SucursalModel insert(SucursalModel sucursalModel);

    public SucursalModel update(SucursalModel sucursalModel);

    public boolean remove(long id);
    
    public SucursalModel calcularSucursalMasCercana(SucursalModel sucursalModel);
    
    public float calcularDistancia(Sucursal sucursal1, Sucursal sucursal2);
}