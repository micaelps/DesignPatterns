import mensagem.Mensagem;
import mensagem.MensagemFactory;
import mensagem.MensagemSMS;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null);

        Mensagem mensagem = MensagemFactory.getMensagem(1);
        mensagem.enviar(texto);
    }
}
