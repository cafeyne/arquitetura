public class SMSFactory extends MensagemFactory {
    @Override
    public Mensagem criarMensagem() {
        return new SMS();
    }
}
