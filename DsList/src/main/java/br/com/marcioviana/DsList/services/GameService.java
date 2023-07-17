package br.com.marcioviana.DsList.services;

import br.com.marcioviana.DsList.dto.GameDTO;
import br.com.marcioviana.DsList.dto.GameMinDTO;
import br.com.marcioviana.DsList.entities.Game;
import br.com.marcioviana.DsList.projections.GameMinProjection;
import br.com.marcioviana.DsList.repositories.Gamerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    Gamerepository gamerepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gamerepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gamerepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gamerepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
