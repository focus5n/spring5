package decoupled;

public interface MessageRenderer {

    void render();

    void setProvider(MessageProvider messageProvider);

}
