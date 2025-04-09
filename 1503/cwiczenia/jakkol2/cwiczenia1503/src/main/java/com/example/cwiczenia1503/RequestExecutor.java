package com.example.cwiczenia1503;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class RequestExecutor {
    private final String environment;
    private final FacadeService facadeService;


//    Home 02
    public RequestExecutor(FacadeService facadeService, @Value("${app.environment:dev}") String environment) {

        this.facadeService = facadeService;
        this.environment = environment;
    }

    public String getEnvironment() {
        return environment;
    }

    public void runFacade() {
        facadeService.execute(environment);
    }
}
