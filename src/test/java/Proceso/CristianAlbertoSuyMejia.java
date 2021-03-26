/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 *
 * @author Cristian
 */
public class CristianAlbertoSuyMejia {
    @Mock
    private Carrera carrera;
    
    
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void CorroborarCarrera() throws Exception{
        carrera = new Carrera(4,"");
        when(carrera.procesarCarrera()).thenReturn(1);
        assertEquals(4,carrera.procesarCarrera());
    }
    
    @Mock
    private RegistroAcademico registro;
    
    @Test
    public void CorroborarRegistro() throws Exception{
        registro = new RegistroAcademico(2017, "00918");
	when(registro.cheequearCarnet()).thenReturn(true);
        assertEquals(true, registro.cheequearCarnet());
    }
}
