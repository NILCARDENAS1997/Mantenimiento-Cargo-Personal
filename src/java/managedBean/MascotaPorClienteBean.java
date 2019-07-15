/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import dao.ClienteDao;
import dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.hibernate.Session;

/**
 *
 * @author NIL CARDENAS
 */
@ManagedBean
@ViewScoped
public class MascotaPorClienteBean {

    private ArrayList listaclientes;
    private ArrayList listamascotas;
    private ArrayList listaActivos;

    private int idCliente;
    private int idMascota;
    private char estado;

    public MascotaPorClienteBean() {
        listaclientes = new ArrayList();
        listasCombos();
    }

    public void listasCombos() {
        ClienteDao clientedao = new ClienteDao();
        MascotaDao mascotadao = new MascotaDao();
        listaclientes = clientedao.listarClientes();
        listamascotas = mascotadao.listarMascotas();

    }

    public ArrayList getListaclientes() {
        return listaclientes;
    }

    public void setListaclientes(ArrayList listaclientes) {
        this.listaclientes = listaclientes;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList getListamascotas() {
        return listamascotas;
    }

    public void setListamascotas(ArrayList listamascotas) {
        this.listamascotas = listamascotas;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public ArrayList getListaActivos() {
        return listaActivos;
    }

    public void setListaActivos(ArrayList listaActivos) {
        this.listaActivos = listaActivos;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

}
