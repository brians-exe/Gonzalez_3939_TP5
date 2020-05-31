package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.ICuotaService;
import ar.edu.unju.fi.service.IEquipoService;
import ar.edu.unju.fi.service.IEstadioService;
import ar.edu.unju.fi.service.INoticiaService;
import ar.edu.unju.fi.service.IResutadoService;
import ar.edu.unju.fi.service.IUsuarioService;

/**
 * Permite iniciar la aplicacion de Spring Tools.
 * 
 * @author Brian Leonel Gonzalez
 * @version 1.0
 */

@SpringBootApplication
public class Gonzalez3939Tp5Application implements CommandLineRunner{
	
	//---------------------SERVICIOS-----------------------
	
	/**
	 * Inyecta un objeto que implemente la interface IUsuarioService.
	 */
	@Autowired
	IUsuarioService usuarioService;
	
	/**
	 * Inyecta un objeto que implemente la interface ICuotaService.
	 */
	@Autowired
	ICuotaService cuotaService;
	
	/**
	 * Inyecta un objeto que implemente la interface IEstadioService.
	 */
	@Autowired
	IEstadioService estadioService;
	
	/**
	 * Inyecta un objeto que implemente la interface IEquipoService.
	 */
	@Autowired
	IEquipoService equipoService;
	
	/**
	 * Inyecta un objeto que implemente la interface INoticiaService.
	 */
	@Autowired
	INoticiaService noticiaService;
	
	/**
	 * Inyecta un objeto que implemente la interface IResultadoService.
	 */
	@Autowired
	IResutadoService resultadoService;
	
	//-----------------CLASES---------------------
	
	/**
	 * Inyectar un objeto de la clase Usuario.
	 */
	@Autowired
	Usuario usuario;
	
	/**
	 * Inyectar un objeto de la clase Cuota.
	 */
	@Autowired
	Cuota cuota;
	
	/**
	 * Inyectar un objeto de la clase Estadio.
	 */
	@Autowired
	Estadio estadio;
	
	/**
	 * Inyectar un objeto de la clase Equipo.
	 */
	@Autowired
	Equipo equipo;
	
	/**
	 * Inyectar un objeto de la clase Equipo.
	 */
	@Autowired
	Equipo equipo2;
	
	/**
	 * Inyectar un objeto de la clase Noticia.
	 */
	@Autowired
	Noticia noticia;
	
	/**
	 * Inyectar un objeto de la clase Resultado.
	 */
	@Autowired
	Resultado resultado;

	/**
	 * Inicia el Programa.
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Gonzalez3939Tp5Application.class, args);
	}

	/**
	 * Metodo sobreescrito.
	 */
	@Override
	public void run(String... args) throws Exception {
		
		// Inicializar las variables de objeto Usuario.
		usuario.setApellido("Perez");
		usuario.setDireccion("Avda. Mitre 256");
		usuario.setDni(30215478);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setFechaNacimiento(LocalDate.of(1980, 11, 12));
		usuario.setId(1);
		usuario.setNombre("Juan");
		usuario.setPassword("123");
		usuario.setTipo("SOCIO");
		
		usuarioService.guardar();
		
		// Inicializar las variables de objeto Cuota.
		cuota.setId(1);
		cuota.setMonto(2300.56);
		cuota.setFechaPago(LocalDate.now());
		cuota.setPeriodo("Mayo 2020");
		cuota.setUsuario(usuario);
		cuota.setEstado("PAGADO");
		
		cuotaService.guardar();
		
		// Inicializar las variables de objeto Estadio.
		estadio.setNombre("Monumental");
		estadio.setCiudad("CABA");
		estadio.setCapacidad(70074);
		estadio.setDireccion("Av. Pres. Figueroa Alcorta 7597");
		estadio.setFechaFundacion(LocalDate.of(1983, 05, 25));
		
		estadioService.guardar();
		
		// Inicializar las variables de objeto Equipo.
		equipo.setNombre("Club Atlético River Plate");
		equipo.setEstadio(estadio);
		
		equipoService.guardar();
		// Inicializar las variables de objeto Equipo2.
		
		equipo2.setNombre("San Lorenzo");
		equipo2.setEstadio(estadio);
		equipoService.guardar();
		
		// Inicializar las variables de objeto Noticia.
		noticia.setTitulo("Dura derrota de river");
		noticia.setFecha(LocalDate.of(2020, 04, 04));
		noticia.setResumen("La Liga Universitaria lo superó con goles de Guerra y Borja en el primer tiempo y de Sornoza en el complemento, de penal.");
		
		noticiaService.guardar();
		
		// Inicializar las variables de objeto Resultado.
		resultado.setEquipo1(equipo);
		resultado.setGolesEquipo1(2);
		resultado.setEquipo2(equipo2);
		resultado.setGolesEquipo2(3);
		
		resultadoService.guardar();
		
	}

}
