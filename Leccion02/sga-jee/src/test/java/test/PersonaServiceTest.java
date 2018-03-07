package test;

import static org.junit.Assert.*;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaService;
import org.junit.Before;
import org.junit.Test;

public class PersonaServiceTest {

    private PersonaService personaService;

    @Before
    public void setUp() throws Exception {
        EJBContainer contenedor = EJBContainer.createEJBContainer();
        personaService = (PersonaService) contenedor.getContext().lookup("java:global/classes/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaService");
    }

    @Test
    public void testEJBPersonaService() {
        System.out.println("Iniciando test EJB PersonaService");
        assertTrue(personaService != null);

        assertEquals(2, personaService.listarPersonas().size());

        System.out.println("El no. de personas es igual a:" + personaService.listarPersonas().size());

        this.desplegarPersonas(personaService.listarPersonas());
        System.out.println("Fin test EJB PersonaService");
    }

    private void desplegarPersonas(List<Persona> personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}