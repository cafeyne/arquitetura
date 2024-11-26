public class TesteApp {
    public static void main(String[] args) {

        // Criando uma fabrica para SMS
        MensagemFactory smsFactory = new SMSFactory();
        Mensagem sms = smsFactory.criarMensagem();
        sms.enviar("(46) 9119-9889", "Esta é uma mensagem de texto!");

        // Criando fábrica para Email
        MensagemFactory emailFactory = new EmailFactory();
        Mensagem email = emailFactory.criarMensagem();
        email.enviar("GabrielArnaldoMaineGuto@gmail.com", "Parabéns, você enviou a atividade com sucesso!");

        // Criando uma fabrica para Notificação Push
        MensagemFactory pushFactory = new PushNotificationFactory();
        Mensagem push = pushFactory.criarMensagem();
        push.enviar("GaArMaGu", "Você recebeu uma nova notificação de Arquitetura de Software!");
    }
}
