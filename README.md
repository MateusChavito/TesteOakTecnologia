# 🚀 Cadastro e Listagem de Produtos

## Descrição 📋
Este projeto simula o cadastro e a listagem de produtos, com funcionalidades como:
- Cadastro de produtos com nome, descrição, valor e disponibilidade.
- Exibição da lista de produtos ordenada por valor, do menor para o maior.
- Cadastro de novos produtos diretamente pela interface.

## Funcionalidades ⚙️
- **Cadastro de Produtos**: 
  - Nome do produto
  - Descrição do produto
  - Valor do produto
  - Disponível para venda (Sim/Não)

- **Listagem de Produtos**:
  - Exibe nome e valor dos produtos.
  - Ordenação automática dos produtos por valor (menor para o maior).
  - Atualiza a listagem automaticamente após o cadastro de um novo produto.

## Estrutura do Projeto 🗂️

### Classes principais:

- `Produto`: Representa o modelo do produto.
- `ProdutoController`: Controlador responsável por adicionar produtos e retornar a lista ordenada.
- `ProdutoService`: Serviço que manipula a lógica de negócios do produto.
- `ProdutoView`: Interface de exibição do cadastro e listagem de produtos.

## Como Rodar o Projeto 🏃‍♂️

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git
## Testes 🧪

O projeto inclui testes automatizados utilizando **JUnit 5**. Para rodar os testes:

### Com Maven:

1. **Execute o comando** para rodar os testes:
   ```bash
   mvn test

Rodando via IDE:
Clique com o botão direito na classe de teste `ProdutoControllerTest`.
Selecione a opção "Run" para executar os testes diretamente na sua IDE.

Optei por usar o modelo MVC
Créditos: Utilização da IA (ChatGPT) para a conclusão do projeto
