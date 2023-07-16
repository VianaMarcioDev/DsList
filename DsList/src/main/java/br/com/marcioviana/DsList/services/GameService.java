package br.com.marcioviana.DsList.services;

import br.com.marcioviana.DsList.dto.GameMinDTO;
import br.com.marcioviana.DsList.entities.Game;
import br.com.marcioviana.DsList.repositories.Gamerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    Gamerepository gamerepository;

    public List<Game> findAll(){
        List<Game> result = gamerepository.findAll();
        return result;
    }
}
