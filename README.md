# Exemplo de Aplicação de uso Padrão DTO
Neste exemplo o endPoint o método findById estará listado junto os livros da categoria. O método findAll não irá listar os livros listando apenas as categorias.
Por isso o uso do Padrão DTO que está sendo implementado em CategoriaDTO.

No caso de uso proposto 1 livro tem que ter abrigatoriamente uma categoria ou seja, na Classe Livro deverá ser implementando a criação de uma chave estrangeira e vai ter
a anoteção @ManyToOne.
Já na classe Categoria, uma categoria pode ter vários livro e vai ser oneToMany.

Utilização de um banco H2 para ficar apenas em memória a utilização dos dados.

