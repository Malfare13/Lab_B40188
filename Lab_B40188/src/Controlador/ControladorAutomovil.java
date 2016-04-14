/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosAutomovil;
import Vista.FRM_Automovil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angelica
 */
public class ControladorAutomovil implements ActionListener {

    MetodosAutomovil metodos;
    FRM_Automovil ventana;

    public ControladorAutomovil(FRM_Automovil ventana) {
        metodos = new MetodosAutomovil();
        this.ventana = ventana;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Buscar")) {
            System.out.println("buscar");
            this.buscar();
        }
        if (e.getActionCommand().equals("Agregar")) {
            System.out.println("agregar");
            metodos.agregarAuto(ventana.devolverInfo());
            metodos.mostrarInfoAuto();
            ventana.estadoInicialBotones();
            ventana.estadoInicialTxt();
            ventana.mostrarMensaje("El auto fue registrado correctamente");
        }
        if (e.getActionCommand().equals("Modificar")) {
            System.out.println("modificar");
            metodos.modificarAuto(ventana.devolverInfo());
            ventana.estadoInicialTxt();
            ventana.estadoInicialBotones();
            ventana.mostrarMensaje("El auto se modifico correctamente");

        }
        if (e.getActionCommand().equals("Eliminar")) {
            System.out.println("eliminar");
            metodos.eliminarAuto(ventana.devolverInfo());
            ventana.estadoInicialBotones();
            ventana.estadoInicialTxt();
            ventana.limpiarTxt();
            ventana.mostrarMensaje("El auto se elimino correctamente");
        }
    }

    public void buscar() {
        if (metodos.consultarAuto(ventana.devolverNumRegistro())) {
            ventana.colocarInfo(metodos.getArregloDatos());
            ventana.habilitarBotonAgregar();
            ventana.deshabilitarNumRegistro();

        } else {

            ventana.mostrarMensaje("El auto no se encuentra registrado");
            ventana.habilitarTxt();
            ventana.deshabilitarBuscar();
            ventana.habilitarBotonAgregar();
        }

    }
    
    public String numRegistro(){
        return metodos.generarNumeroRegistro();
    }
}
