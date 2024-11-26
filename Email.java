public class Email implements Mensagem {
    @Override
    public void enviar(String destinatario, String conteudo) {
        System.out.println("Enviando Email para " + destinatario + ": " + conteudo);
    }
}
