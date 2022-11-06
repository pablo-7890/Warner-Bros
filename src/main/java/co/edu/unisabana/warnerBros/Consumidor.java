package co.edu.unisabana.warnerBros;


import co.edu.unisabana.peliculas.controller.Pelicula;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumidor {

    @RabbitListener(queues = {"unisabana.peliculas.warnerbros"})
    public void receive(@Payload Pelicula mensaje) {
        log.info("la pelicula fue publicada {}", mensaje.getNombrePelicula());
    }
}