package org.mateus.chaves;
import org.mateus.chaves.controller.ProdutoController;
import org.mateus.chaves.view.ListagemPanel;

import javax.swing.*;
import java.awt.*;

public class ProdutoApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ProdutoApp().iniciar());
    }

    private void iniciar() {
        JFrame frame = new JFrame("Cadastro e Listagem de Produtos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        ProdutoController controller = new ProdutoController();
        JPanel listagemPanel = new ListagemPanel(controller, frame);

        frame.add(listagemPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}