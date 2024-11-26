public class PushNotificationFactory extends MensagemFactory {
    @Override
    public Mensagem criarMensagem() {
        return new PushNotification();
    }
}
