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
public class ConstruccionConOficinas extends Construccion{
    public int cantOficinas;
    private int cantPlantas;
    public ConstruccionConOficinas(){
    }
    public ConstruccionConOficinas(String n, int t, double s, int o, int p){
        this.setNombre(n);
        this.setTipoInstalacion(t);
        this.setSuperficie(s);
        this.setCantOficinas(o);
        this.setCantPlantas(p);
    }
    /**
     * @return the cantOficinas
     */
    public int getCantOficinas() {
        return cantOficinas;
    }

    /**
     * @param cantOficinas the cantOficinas to set
     */
    public void setCantOficinas(int cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    /**
     * @return the cantPlantas
     */
    public int getCantPlantas() {
        return cantPlantas;
    }

    /**
     * @param cantPlantas the cantPlantas to set
     */
    public void setCantPlantas(int cantPlantas) {
        this.cantPlantas = cantPlantas;
    }
}
