package mk.kalitek.javaweb2telegram.message;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@Service
public class MessageService {
    public List<Message> getMessages() {
        return List.of(
                new Message(
                        1L,
                        "First Java message",
                        "38970500000",
                        "bot_initial",
                        LocalDateTime.of(2023, Month.JANUARY, 9, 17, 34, 13),
                        17
                )
        );
    }
}
