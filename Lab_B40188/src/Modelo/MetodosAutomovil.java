/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.FRM_Automovil;
import java.util.ArrayList;

/**
 *
 * @author Angelica
 */
public class MetodosAutomovil {

    /**
     * @param args the command line arguments
     */
    

    ArrayList <Automovil> arrayAuto;
    String arregloDatos[];

        public MetodosAutomovil() {
            this.arrayAuto = new ArrayList <Automovil>();
            this.arregloDatos = new String[3];
        }
    
    
    
    public void agregarAuto(String infoAuto[]){
        Automovil temporal= new Automovil(infoAuto[0],infoAuto[1], infoAuto[2],infoAuto[3]);
        arrayAuto.add(temporal);
    }
    
    public void mostrarInfoAuto(){
        Automovil temporal;
        temporal= arrayAuto.get(0);
        System.out.println(temporal);
    }
    
    
    public void modificarAuto(String infoAuto[]){
        
        for(int contador=0; contador<arrayAuto.size();contador ++){
            if(arrayAuto.get(contador).getNumeroRegistro().equals(infoAuto[0])){
              arrayAuto.get(contador).setNombreDueno(infoAuto[1]);
              arrayAuto.get(contador).setCedulaDueno(infoAuto[2]);
              arrayAuto.get(contador).setPlacaAuto(infoAuto[3]);
            }
        }
        
        
    }
    
    public void eliminarAuto(String infoAuto[]){
        
        for(int contador=0; contador<arrayAuto.size();contador ++){
            if(arrayAuto.get(contador).getNumeroRegistro().equals(infoAuto[0])){
              arrayAuto.remove(contador);
            }
        }
        
        
    }
    
    public boolean consultarAuto(String numeroRegistro){
         boolean existeAuto=false;
        for(int contador=0; contador<arrayAuto.size();contador ++){
        if(arrayAuto.get(contador).getNumeroRegistro().equals(numeroRegistro)){
            arregloDatos[0]=arrayAuto.get(contador).getNumeroRegistro();
            arregloDatos[1]=arrayAuto.get(contador).getNombreDueno();
            arregloDatos[2]=arrayAuto.get(contador).getCedulaDueno();
            arregloDatos[3]=arrayAuto.get(contador).getPlacaAuto();
            existeAuto=true;
        }
        }
               return existeAuto;
    }
    
    
    public String[] getArregloDatos(){
    
        return arregloDatos;
    }
    
    
    public String generarNumeroRegistro(){
        String numReg="0000";
        if(this.arrayAuto.size()==0){
            numReg="0001";
        }else{
            for(int contador=0;contador<arrayAuto.size();contador++){
                if(arrayAuto.get(contador)!=null){
            numReg=arrayAuto.get(contador).getNumeroRegistro(); 
                }

            }
            int numero=Integer.parseInt(numReg);
            numero++;
            numReg=""+numero;
        }
        return numReg;
    }
}
    


