package br.com.marcioviana.DsList.services;

import br.com.marcioviana.DsList.dto.GameDTO;
import br.com.marcioviana.DsList.dto.GameListDTO;
import br.com.marcioviana.DsList.dto.GameMinDTO;
import br.com.marcioviana.DsList.entities.Game;
import br.com.marcioviana.DsList.entities.GameList;
import br.com.marcioviana.DsList.repositories.GameListRepository;
import br.com.marcioviana.DsList.repositories.Gamerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
