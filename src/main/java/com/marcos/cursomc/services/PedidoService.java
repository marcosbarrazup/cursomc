package com.marcos.cursomc.services;

import com.marcos.cursomc.domain.Pedido;
import com.marcos.cursomc.exceptions.ObjectNotFoundException;
import com.marcos.cursomc.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido buscar(Integer id){
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id
            + ", Tipo: " + Pedido.class.getName()));
    }
}
