public class SMS implements Mensagem {
    @Override
    public void enviar(String destinatario, String conteudo) {
        System.out.println("Enviando SMS para " + destinatario + ": " + conteudo);
    }
}
