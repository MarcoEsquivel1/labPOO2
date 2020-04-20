/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


/**
 *
 * @author MARCO RENÉ ESQUIVEL JUÁREZ
 */
public class Construccion implements TipoInstalacion, Edificio {
    public String nombre;
    public int tipoInstalacion;
    public double superficie;
    
    public Construccion(){
    }
    public Construccion(String n, int t, double s){
        this.setNombre(n); 
        this.setTipoInstalacion(t);
        this.setSuperficie(s);
    }


    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param tipoInstalacion the tipoInstalacion to set
     */
    public void setTipoInstalacion(int tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    /**
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    @Override
    public int getTipoEd() {
        return this.tipoInstalacion;
    }

    @Override
    public double getSuperficieEd() {
        return this.superficie;
    }
}
