package br.com.marcioviana.DsList.repositories;

import br.com.marcioviana.DsList.entities.Game;
import br.com.marcioviana.DsList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
