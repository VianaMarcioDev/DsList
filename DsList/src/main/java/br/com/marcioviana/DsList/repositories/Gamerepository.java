package br.com.marcioviana.DsList.repositories;

import br.com.marcioviana.DsList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Gamerepository  extends JpaRepository<Game, Long> {
}
