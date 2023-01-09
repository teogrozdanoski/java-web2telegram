package mk.kalitek.javaweb2telegram.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/message")
public class MessageController {
    @GetMapping
    public List<Message> getMessages() {
        return List.of(
                new Message(
                        1L,
                        "First Java message",
                        "38970500000",
                        "bot_initial",
                        LocalDateTime.of(2023, Month.JANUARY, 9, 17, 25, 13),
                        17
                )
        );
    }
}
