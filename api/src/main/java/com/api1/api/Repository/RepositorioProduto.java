package com.api1.api.Repository;


import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import com.api1.api.Model.Produto;

@Repository
public class RepositorioProduto {
    
    // Create
    // Read  GetAll() and GetById()
    // Update
    // Delete
    // 
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoId = 0;

    public List<Produto> buscarTodos(){

    } 
}
