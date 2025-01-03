package org.mateus.chaves.view;

import org.mateus.chaves.controller.ProdutoController;

import javax.swing.*;
import java.awt.*;

public class CadastroPanel extends JPanel {
    public CadastroPanel(ProdutoController controller, JFrame frame) {
        setLayout(new GridLayout(5, 2, 5, 5));

        JTextField nomeField = new JTextField();
        JTextField descricaoField = new JTextField();
        JTextField valorField = new JTextField();
        JComboBox<String> disponivelCombo = new JComboBox<>(new String[]{"Sim", "Não"});

        add(new JLabel("Nome do Produto:"));
        add(nomeField);
        add(new JLabel("Descrição do Produto:"));
        add(descricaoField);
        add(new JLabel("Valor do Produto:"));
        add(valorField);
        add(new JLabel("Disponível para Venda:"));
        add(disponivelCombo);

        JButton cadastrarButton = new JButton("Cadastrar");
        add(new JLabel());
        add(cadastrarButton);

        cadastrarButton.addActionListener(e -> {
            try {
                String nome = nomeField.getText();
                String descricao = descricaoField.getText();
                double valor = Double.parseDouble(valorField.getText());
                boolean disponivel = disponivelCombo.getSelectedItem().equals("Sim");

                controller.adicionarProduto(nome, descricao, valor, disponivel);

                JOptionPane.showMessageDialog(frame, "Produto cadastrado com sucesso!");
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new ListagemPanel(controller, frame));
                frame.revalidate();
                frame.repaint();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Valor inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
