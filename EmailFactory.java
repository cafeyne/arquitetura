public class EmailFactory extends MensagemFactory {
    @Override
    public Mensagem criarMensagem() {
        return new Email();
    }
}
