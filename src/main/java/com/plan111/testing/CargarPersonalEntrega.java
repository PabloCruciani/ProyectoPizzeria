package com.plan111.testing;

import com.plan111.dao.imp.PersonalEntregaDAO;
import com.plan111.modelo.EstadoPersonalEntrega;
import com.plan111.modelo.PersonalEntrega;
import com.plan111.modelo.Vehiculo;

import java.util.*;

/**
 * @author Guido
 */

public class CargarPersonalEntrega {
  public static void main(String[] args) {

    Calendar fecha = new GregorianCalendar(1991, 5, 2);
    Date fechaNacimientoCadeteFull = fecha.getTime();

    Calendar fecha2 = new GregorianCalendar(2020, 0, 1);
    Date fechaVencimientoCarnetCadeteFull = fecha2.getTime();

    List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
    listaVehiculos.add(new Vehiculo("Honda"));

    Vehiculo vehiculoCadeteFull = new Vehiculo(null);
    vehiculoCadeteFull.setMarca(listaVehiculos.get(0).getMarca());

    EstadoPersonalEntrega estadoCadeteFull = new EstadoPersonalEntrega();
    estadoCadeteFull.setNombre("Disponible");

    PersonalEntrega cadete1 = new PersonalEntrega(
        null,
        "Guido",
        "Cavallo",
        99888777,
        154154154,
        123456,
        fechaNacimientoCadeteFull,
        fechaVencimientoCarnetCadeteFull,
        listaVehiculos,
        estadoCadeteFull
    );

    PersonalEntrega cadete2 = new PersonalEntrega(
        null,
        "Pablo",
        "Cruciani",
        88777666,
        154154154,
        123456,
        fechaNacimientoCadeteFull,
        fechaVencimientoCarnetCadeteFull,
        null,
        null
    );

    PersonalEntregaDAO nuevoCadete = new PersonalEntregaDAO();
    nuevoCadete.registrarPersonalEntrega(cadete1);
    nuevoCadete.registrarPersonalEntrega(cadete2);
  }
}
