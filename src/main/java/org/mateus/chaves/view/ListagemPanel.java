package org.mateus.chaves.view;

import org.mateus.chaves.controller.ProdutoController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ListagemPanel extends JPanel {
    public ListagemPanel(ProdutoController controller, JFrame frame) {
        setLayout(new BorderLayout());

        DefaultTableModel model = new DefaultTableModel(new String[]{"Nome", "Valor"}, 0);
        JTable tabela = new JTable(model);

        controller.getProdutosOrdenadosPorValor().forEach(produto ->
                model.addRow(new Object[]{produto.getNome(), produto.getValor()}));

        add(new JScrollPane(tabela), BorderLayout.CENTER);

        JButton novoProdutoButton = new JButton("Cadastrar Novo Produto");
        add(novoProdutoButton, BorderLayout.SOUTH);

        novoProdutoButton.addActionListener(e -> {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(new CadastroPanel(controller, frame));
            frame.revalidate();
            frame.repaint();
        });
    }
}