package mk.kalitek.javaweb2telegram.message;

import java.time.LocalDateTime;

public class Message {
    private Long id;
    private String message_text;
    private String recipient;
    private String bot_name;
    private LocalDateTime datetime_sent;
    private int character_count;

    public Message() {
    }

    public Message(Long id, String message_text, String recipient, String bot_name, LocalDateTime datetime_sent, int character_count) {
        this.id = id;
        this.message_text = message_text;
        this.recipient = recipient;
        this.bot_name = bot_name;
        this.datetime_sent = datetime_sent;
        this.character_count = character_count;
    }

    public Message(String message_text, String recipient, String bot_name, LocalDateTime datetime_sent, int character_count) {
        this.message_text = message_text;
        this.recipient = recipient;
        this.bot_name = bot_name;
        this.datetime_sent = datetime_sent;
        this.character_count = character_count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage_text() {
        return message_text;
    }

    public void setMessage_text(String message_text) {
        this.message_text = message_text;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getBot_name() {
        return bot_name;
    }

    public void setBot_name(String bot_name) {
        this.bot_name = bot_name;
    }

    public LocalDateTime getDatetime_sent() {
        return datetime_sent;
    }

    public void setDatetime_sent(LocalDateTime datetime_sent) {
        this.datetime_sent = datetime_sent;
    }

    public int getCharacter_count() {
        return character_count;
    }

    public void setCharacter_count(int character_count) {
        this.character_count = character_count;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", message_text='" + message_text + '\'' +
                ", recipient='" + recipient + '\'' +
                ", bot_name='" + bot_name + '\'' +
                ", datetime_sent='" + datetime_sent + '\'' +
                ", character_count=" + character_count +
                '}';
    }
}
