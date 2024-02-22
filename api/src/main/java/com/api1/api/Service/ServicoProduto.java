package com.api1.api.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.api1.api.Model.Produto;
import com.api1.api.Repository.RepositorioProduto;

@Service
public class ServicoProduto {
    
    @Autowired
    private RepositorioProduto repositorio;

    public List<Produto> obterTodos(){
        return repositorio.obterTodos();
    }

    public Optional<Produto> obterPorId(Integer id){
        Optional<Produto> p = repositorio.obterPorId(id);
        return p;
    }

    public Produto adicionarProduto(Produto produto){
        repositorio.adicionarProduto(produto);
        return produto;
    }

    public void deletar(Integer id){
        repositorio.deletar(id);
    }

    public Produto atualizarProduto(Produto produto){
        repositorio.atualizarProduto(produto);
        return produto;
    }
}   
