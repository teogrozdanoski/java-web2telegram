package mk.kalitek.javaweb2telegram.message;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@Configuration
public class MessageConfig {
    @Bean
    CommandLineRunner commandLineRunner(MessageRepository messageRepository) {
        return args -> {
            Message message_01 = new Message(
                    "First Java message",
                    "38970500000",
                    "bot_primary",
                    LocalDateTime.of(2023, Month.JANUARY, 9, 17, 34, 13),
                    17
            );

            Message message_02 = new Message(
                    "Second Java message",
                    "38970500000",
                    "bot_secondary",
                    LocalDateTime.of(2023, Month.JANUARY, 9, 18, 56, 9),
                    18
            );

            messageRepository.saveAll(List.of(message_01, message_02));
        };
    }
}
