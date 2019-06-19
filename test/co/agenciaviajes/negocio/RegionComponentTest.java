package co.agenciaviajes.negocio;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cristian
 */
public class RegionComponentTest {

    public RegionComponentTest() {
    }

    /**
     * TestRegionCRUD method, of class RegionComponent
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testRegionCRUD() throws Exception {
        PaqueteComponent principal = new RegionComponent("Europa");
        PaqueteComponent pais1 = new RegionComponent("Italia");
        PaqueteComponent pais2 = new RegionComponent("Francia");
        PaqueteComponent pais3 = new RegionComponent("España");

        PaqueteComponent ciudad1 = new CiudadComponent("Roma", 1000000);
        PaqueteComponent ciudad2 = new CiudadComponent("Paris", 2000000);
        PaqueteComponent ciudad3 = new CiudadComponent("Madrid", 3000000);
        PaqueteComponent ciudad4 = new CiudadComponent("Valencia", 2000000);

        principal.addComponent(pais1);
        principal.addComponent(pais2);
        principal.addComponent(pais3);

        pais1.addComponent(ciudad1);
        pais2.addComponent(ciudad2);
        pais3.addComponent(ciudad3);
        pais3.addComponent(ciudad4);

        assertEquals("Europa", principal.getNombre());
        
        assertEquals("Italia", pais1.getNombre());
        assertEquals("Francia", pais2.getNombre());
        assertEquals("España", pais3.getNombre());
        
        assertEquals("Roma", ciudad1.getNombre());
        assertEquals("Paris", ciudad2.getNombre());
        assertEquals("Madrid", ciudad3.getNombre());
        assertEquals("Valencia", ciudad4.getNombre());

    }

}
