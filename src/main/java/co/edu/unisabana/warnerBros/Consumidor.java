package co.edu.unisabana.warnerBros;


import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumidor {

    @RabbitListener(queues = {"unisabana.peliculas.notificar"})
    public void receive(@Payload String mensaje) {
        log.info("Escuche de la cola unisabana.peliculas.notificar {}", mensaje);
    }
}