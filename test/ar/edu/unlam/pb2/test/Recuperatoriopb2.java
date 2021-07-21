package ar.edu.unlam.pb2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.Batalla;
import ar.edu.unlam.pb2.Gemas;
import ar.edu.unlam.pb2.Heroes;
import ar.edu.unlam.pb2.PersonajeNoEncontradoException;
import ar.edu.unlam.pb2.Personajes;
import ar.edu.unlam.pb2.Villanos;
import ar.edu.unlam.pb2.WorldDestroyedException;
import ar.edu.unlam.pb2.gemaNoEncontradoException;

public class Recuperatoriopb2 {

	@Test
	public void queSePuedaAdquirirUnaGema() throws gemaNoEncontradoException {
		Personajes ironman = new Heroes("Tony stark",3000,"Heroe");
		//Personajes capitanamerica = new Heroes("Steve Rogers",2500,"Heroe");
		//Personajes hulk = new Heroes("Bruce Banner",4300,"Heroe");
		//Personajes loki = new Heroes("Loki",3200,"Villano");
		//Personajes redskull = new Heroes("Red skull",2300,"Villano");
		//Personajes thanos = new Heroes("Thanos",5000,"Villano");
		Gemas gemaDelPoder = new Gemas("Poder");
		Batalla batalla = new Batalla("Infinity war");
		batalla.agregarHeroes(ironman);
		batalla.incorporarGemaAntesDeBatalla(gemaDelPoder, "Tony stark");
		assertTrue(ironman.adquirirPoderDeGema("Poder"));			
	}
	
	@Test(expected = gemaNoEncontradoException.class)
	public void queNoSePuedaTenerMasDe3Gemas() throws gemaNoEncontradoException {
	}
	
	@Test
	public void queGanenLosHeroes() throws gemaNoEncontradoException, PersonajeNoEncontradoException, WorldDestroyedException {
		Personajes ironman = new Heroes("Tony stark",3000,"Heroe");
		Personajes capitanamerica = new Heroes("Steve Rogers",2500,"Heroe");
		Personajes loki = new Villanos("Loki",2100,"Villano");
		Personajes redskull = new Villanos("Red skull",2300,"Villano");
		
		Batalla batalla = new Batalla("Infinity war");
		batalla.agregarHeroes(ironman);
		batalla.agregarHeroes(capitanamerica);
		batalla.agregarVillanos(loki);
		batalla.agregarVillanos(redskull);
		batalla.enfrentarPersonajes("Loki", "Tony stark");
		batalla.enfrentarPersonajes("Red skull", "Steve Rogers");
		assertEquals("Los heroes han ganado",batalla.resultadoFinal());
			
	}
	@Test
	public void queGanenLosVillanos() throws gemaNoEncontradoException, PersonajeNoEncontradoException, WorldDestroyedException {
		Personajes ironman = new Heroes("Tony stark",3000,"Heroe");
		Personajes capitanamerica = new Heroes("Steve Rogers",2500,"Heroe");
		Personajes loki = new Villanos("Loki",5000,"Villano");
		Personajes redskull = new Villanos("Red skull",5000,"Villano");
		
		Batalla batalla = new Batalla("Infinity war");
		batalla.agregarHeroes(ironman);
		batalla.agregarHeroes(capitanamerica);
		batalla.agregarVillanos(loki);
		batalla.agregarVillanos(redskull);
		batalla.enfrentarPersonajes("Loki", "Tony stark");
		batalla.enfrentarPersonajes("Red skull", "Steve Rogers");
		assertEquals("Los villanos han ganado",batalla.resultadoFinal());
			
	}
}
