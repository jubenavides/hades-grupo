/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.web;

import ec.edu.espe.distribuidas.hades.model.Camarote;
import ec.edu.espe.distribuidas.hades.model.Cliente;
import ec.edu.espe.distribuidas.hades.model.ClientePK;
import ec.edu.espe.distribuidas.hades.model.Reserva;
import ec.edu.espe.distribuidas.hades.model.TipoAlimentacion;
import ec.edu.espe.distribuidas.hades.model.Tour;
import ec.edu.espe.distribuidas.hades.model.TourPK;
import ec.edu.espe.distribuidas.hades.service.CamaroteService;
import ec.edu.espe.distribuidas.hades.service.ClienteService;
import ec.edu.espe.distribuidas.hades.service.ReservaService;
import ec.edu.espe.distribuidas.hades.service.TipoAlimentacionService;
import ec.edu.espe.distribuidas.hades.service.TourService;
import ec.edu.espe.distribuidas.hades.web.util.FacesUtil;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Hendrix
 */
@Named
@ViewScoped
public class ReservaBean  extends BaseBean implements Serializable{
    
   
    private List<Cliente> listadoClientes;
    private List<Tour> listadoTours;
    private List<Camarote> listadoCamarotes;
    private List<TipoAlimentacion> tiposDeAlimentacion;
    
    private Reserva reserva;
    private Camarote camarote;
    private Cliente cliente;
    private TipoAlimentacion alimentacion;
    private Tour tour;
    
    @Inject
    private ClienteService clienteService;
    @Inject
    private TourService tourService;
    @Inject
    private CamaroteService camaroteService;
    @Inject
    private TipoAlimentacionService alimentacionService;
    @Inject
    private ReservaService reservaService;
    
    @PostConstruct
    public void init() {
        
        this.reserva = new Reserva();
        this.camarote = new Camarote();
        this.cliente = new Cliente();
        this.cliente.setClientePK(new ClientePK());
        this.alimentacion = new TipoAlimentacion();
        this.tour = new Tour();
        this.tour.setPk(new TourPK());
        
        this.listadoClientes = this.clienteService.obtenerTodos(); 
        this.listadoTours = this.tourService.obtenerTodos();
        this.tiposDeAlimentacion = this.alimentacionService.obtenerTodos();
        this.listadoCamarotes = this.camaroteService.obtenerPorCrucero(listadoTours.get(0).getCrucero().getCodigo());
        this.camarote = (this.camaroteService.obtenerInfoCamarote(listadoCamarotes.get(0).getCrucero().getCodigo(),(int) listadoCamarotes.get(0).getNumero()));
        this.reserva.setCamarote(this.camaroteService.obtenerInfoCamarote(listadoCamarotes.get(0).getCrucero().getCodigo(),(int) listadoCamarotes.get(0).getNumero()));
        System.out.println("Init: "+this.reserva.getCamarote().getTipoCamarote().getNombre());
        System.out.println("Init2: "+this.reserva.getCamarote().getNumero());
    }
    
    @Override
    public void agregar() {
        this.reserva = new Reserva();
        super.agregar();
        
    }
    
    public void guardar() {
        this.reserva.setCliente(this.clienteService.obtenerPorIdentificacion(this.cliente.getClientePK().getIdentificacion()));
        this.reserva.setCamarote(this.camaroteService.obtenerInfoCamarote(this.tour.getCrucero().getCodigo(),(int) this.camarote.getNumero()));
        
        this.reserva.setCodigo(codRandom());
        this.reserva.setIdentificacion(this.reserva.getCliente().getClientePK().getIdentificacion());
        this.reserva.setTipoIdentificacion(this.reserva.getCliente().getClientePK().getTipoIdentificacion());
        this.reserva.setCodTour(this.tour.getPk().getCodTour());
        this.reserva.setCodTipoTour(this.tour.getPk().getCodTipoTour());
        this.reserva.setCodCrucero(this.tour.getPk().getCodCrucero());
        this.reserva.setCodCamarote(this.camarote.getPk().getCodCamarote());
        this.reserva.setCodTipoCamarote(this.camarote.getPk().getCodTipoCamarote());
        this.reserva.setCodTipoAlimentacion(this.alimentacion.getCodigo());

        System.out.println("ID Cliente en reserva: "+ this.reserva.getIdentificacion());
        System.out.println("Tipo de identificacion en reserva: "+ this.reserva.getTipoIdentificacion());
        System.out.println("Cod Tour: "+ this.reserva.getCodTour());
        System.out.println("Tipo Tour: "+ this.reserva.getCodTipoTour());
        System.out.println("Cod Crucero: "+ this.reserva.getCodCrucero());
        System.out.println("Camarote: "+ this.reserva.getCodCamarote());
        System.out.println("Tipo camarote: "+ this.reserva.getCodTipoCamarote());
        System.out.println("Tipo alimentacion: "+ this.reserva.getCodTipoAlimentacion());
        System.out.println("Fecha: "+ this.reserva.getFechaEmision());       
        System.out.println("random "+ codRandom());
        
        super.reset();
        this.reservaService.crear(reserva);
        FacesUtil.addMessageInfo("Se creo la reserva");
        
    }
    
    public void cancelar() {
        super.reset();
        this.reserva = new Reserva();
    }
    
    public void actualizarCamarotes(){
        
        this.tour = (this.tourService.obtenerTourPorCodigo(this.tour.getPk().getCodTour()));
        System.out.println("Codigo del tour: "+this.tour.getPk().getCodTour());
        this.listadoCamarotes = this.camaroteService.obtenerPorCrucero(this.tour.getCrucero().getCodigo());
    }
    
    public void actualizarTipo(){
         System.out.println("Entro Tipo");
         System.out.println("Numero Camarote: "+this.camarote.getNumero());
         this.reserva.setCamarote(this.camaroteService.obtenerInfoCamarote(this.tour.getCrucero().getCodigo(),(int) this.camarote.getNumero()));
         this.camarote = (this.camaroteService.obtenerInfoCamarote(this.tour.getCrucero().getCodigo(),(int) this.camarote.getNumero()));
    }
    
    private String codRandom (){
        char[] chr={'A','C','D','1','2','3'};
		String aleatorio="";
 
		for(int i=0;i<=5;i++){
			aleatorio+=chr[(int)(Math.random()*6)];
		}
         return aleatorio;             
    }
    
    //Setters y Getters
    public List<Cliente> getListadoClientes() {
        return listadoClientes;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public List<Tour> getListadoTours() {
        return listadoTours;
    }

    public List<Camarote> getListadoCamarotes() {
        return listadoCamarotes;
    }

    public List<TipoAlimentacion> getTiposDeAlimentacion() {
        return tiposDeAlimentacion;
    }

    public Camarote getCamarote() {
        return camarote;
    }

    public void setCamarote(Camarote camarote) {
        this.camarote = camarote;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoAlimentacion getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(TipoAlimentacion alimentacion) {
        this.alimentacion = alimentacion;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }
    
    
    
    
}
