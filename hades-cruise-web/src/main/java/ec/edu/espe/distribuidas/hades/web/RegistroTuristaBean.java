/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.web;

import ec.edu.espe.distribuidas.hades.model.Reserva;
import ec.edu.espe.distribuidas.hades.model.TuristaReserva;
import ec.edu.espe.distribuidas.hades.service.ReservaService;
import ec.edu.espe.distribuidas.hades.service.TuristaReservaService;
import ec.edu.espe.distribuidas.hades.web.util.FacesUtil;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author jubenavides
 */
@Named
@ViewScoped
public class RegistroTuristaBean extends BaseBean implements Serializable {
    
    private List<TuristaReserva> turistas;
    private TuristaReserva turista;
    private TuristaReserva turistaSel;
    private Reserva reserva;
    
    @Inject
    private TuristaReservaService turistaReservaService;
    
    @Inject
    private ReservaService reservaService;
    

    @PostConstruct
    public void init() {
        this.turistas = this.turistaReservaService.obtenerTodos();
        this.turista = new TuristaReserva();
        this.reserva = new Reserva();
    }

    public List<TuristaReserva> getclientes() {
        return turistas;
    }

    @Override
    public void agregar() {
        this.turista = new TuristaReserva();
        super.agregar();
        
    }

    @Override
    public void modificar() {
        super.modificar();
        this.turista = new TuristaReserva();
        this.turista.setCodigo(this.turistaSel.getCodigo());
        this.turista.setCodigoReserva(this.turistaSel.getReserva().getCodigo());
        this.turista.setTipoIdentificacion(this.turistaSel.getTipoIdentificacion());
        this.turista.setIdentificacion(this.turistaSel.getIdentificacion());
        this.turista.setNombre(this.turistaSel.getNombre());
        this.turista.setFechaNacimiento(this.turistaSel.getFechaNacimiento());
        this.turista.setPesoMaleta(this.turistaSel.getPesoMaleta());
    }

    @Override
    public void detalles() {
        super.detalles();
        this.turista = this.turistaSel;
    }

    public void cancelar() {
        super.reset();
        this.turista = new TuristaReserva();
    }

    public void guardar() {
        try {
            this.turistaReservaService.crear(this.turista);
            FacesUtil.addMessageInfo("Se agregó el turista: " + this.turista.getNombre());
        } catch (Exception ex) {
            FacesUtil.addMessageError(null, "Ocurrí\u00f3 un error al actualizar la informaci\u00f3n");
        }
        super.reset();
        this.turista = new TuristaReserva();
        this.turistas = this.turistaReservaService.obtenerTodos();
    }

    public List<TuristaReserva> getTuristas() {
        return turistas;
    }

    public TuristaReserva getTurista() {
        return turista;
    }

    public void setTurista(TuristaReserva turista) {
        this.turista = turista;
    }

    public TuristaReserva getTuristaSel() {
        return turistaSel;
    }

    public void setTuristaSel(TuristaReserva turistaSel) {
        this.turistaSel = turistaSel;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
   
}
