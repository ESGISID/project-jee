package esgi.arlo.arjas.resteasyapi.adapers;

import esgi.arlo.arjas.resteasyapi.ports.HelloPort;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;

@Default
@ApplicationScoped
public class HelloService implements HelloPort {
    @Override
    public String sayHello() {
        return "Hello, World!";
    }
}
