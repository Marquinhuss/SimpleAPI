package com.api1.api.Repository;

import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import com.api1.api.Model.Produto;

@Repository
public class RepositorioProduto {
    
    // Create
    // Read  GetAll() and GetById()
    // Update
    // Delete
    // 
    private List<Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoId = 0;

    /**
     * 
     * @param id
     * @return Metodo para retornar uma lista de produtos
     */
    public List<Produto> obterTodos(){
        return produtos;
    } 
    
    /**
     * 
     * @param id
     * @return Metodo para retornar um produto pelo seu Id
     */
    public Optional<Produto> obterPorId(Integer id){
        return produtos.stream()
                       .filter(p -> p.getId() == id)
                       .findFirst();
    }

    /**
     * 
     * @param id
     * @return Metodo para adicionar um produto
     */
    public Produto adicionarProduto(Produto produto){
        ultimoId++;
        produto.setId(ultimoId);
        produtos.add(produto);
        return produto;
    }

    /**
     * 
     * @param id
     * @return Metodo para remover um produto
     */
    public void deletar(Integer id){
        produtos.removeIf(p -> p.getId() == id);
    }
    /**
     * 
     * @param id
     * @return Metodo para atualizar um produto existente
     */
    public Produto atualizarProduto(Produto produto){
        // Encontrar o produto atual
        Optional<Produto> produtoAntigo = obterPorId(produto.getId());

        if(produtoAntigo.isEmpty()){    
            throw new InputMismatchException("Produto não encontrado");
        }

        // Deletar o produto atual
        deletar(produto.getId());

        // Adicionar o novo produto
        produtos.add(produto);
         
        return produto;
    }

}
