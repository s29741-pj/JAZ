package com.example.cwiczenia1503;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;



@ExtendWith(MockitoExtension.class)
public class FacadeServiceTest {


    @Mock
    private DevService devService;
    @Mock
    private QaService qaService;
    @Mock
    private ProdService prodService;
    @Mock
    private StagingService stagingService;

    private FacadeService facadeService;

    @BeforeEach
    public void setup() {
        Map<String, HandlerServiceInterface> services = new HashMap<>();
        services.put("devService", devService);
        services.put("qaService", qaService);
        services.put("prodService", prodService);
        services.put("stagingService", stagingService);


        facadeService = new FacadeService(services);
    }


    @Test
    public void testOnDefault(){
        String selectedEnv="default";
        facadeService.execute(selectedEnv);
        assertEquals("default", facadeService.getActiveService());

        verifyNoInteractions(devService);
        verifyNoInteractions(qaService);
        verifyNoInteractions(prodService);
        verifyNoInteractions(stagingService);
    }

    @Test
    public void testOnDev(){
        String selectedEnv="dev";
        when(devService.sayHello()).thenReturn("Hello from Dev");
        facadeService.execute(selectedEnv);
        assertEquals("Hello from Dev", facadeService.getActiveService());
    }

    @Test
    public void testOnProd(){
        String selectedEnv="prod";
        when(prodService.sayHello()).thenReturn("Hello from Prod");
        facadeService.execute(selectedEnv);
        assertEquals("Hello from Prod", facadeService.getActiveService());
    }
    @Test
    public void testOnStage(){
        String selectedEnv="staging";
        when(stagingService.sayHello()).thenReturn("Hello from Staging");
        facadeService.execute(selectedEnv);
        assertEquals("Hello from Staging", facadeService.getActiveService());
    }
    @Test
    public void testOnQa(){
        String selectedEnv="qa";
        when(qaService.sayHello()).thenReturn("Hello from QA");
        facadeService.execute(selectedEnv);
        assertEquals("Hello from QA", facadeService.getActiveService());
    }
}
