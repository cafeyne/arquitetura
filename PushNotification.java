public class PushNotification implements Mensagem {
    @Override
    public void enviar(String destinatario, String conteudo) {
        System.out.println("Enviando Notificação Push para " + destinatario + ": " + conteudo);
    }
}
