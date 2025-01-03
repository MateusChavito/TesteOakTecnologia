
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mateus.chaves.controller.ProdutoController;
import org.mateus.chaves.model.Produto;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoControllerTest {

    private ProdutoController produtoController;

    @BeforeEach
    void setUp() {
        produtoController = new ProdutoController();
    }

    @Test
    void testAdicionarProduto() {
        produtoController.adicionarProduto("Produto A", "Descrição A", 10.0, true);

        List<Produto> produtos = produtoController.getProdutosOrdenadosPorValor();
        assertEquals(1, produtos.size(), "Deve ter 1 produto na lista");

        Produto produto = produtos.get(0);
        assertEquals("Produto A", produto.getNome());
        assertEquals(10.0, produto.getValor());
    }

    @Test
    void testOrdenarProdutosPorValor() {
        produtoController.adicionarProduto("Produto A", "Descrição A", 10.0, true);
        produtoController.adicionarProduto("Produto B", "Descrição B", 5.0, true);

        List<Produto> produtos = produtoController.getProdutosOrdenadosPorValor();

        assertEquals("Produto B", produtos.get(0).getNome(), "O primeiro produto deve ser o de menor valor");
        assertEquals("Produto A", produtos.get(1).getNome(), "O segundo produto deve ser o de maior valor");
    }

    @Test
    void testListaVazia() {

        List<Produto> produtos = produtoController.getProdutosOrdenadosPorValor();
        assertTrue(produtos.isEmpty(), "A lista deve começar vazia");
    }
}
