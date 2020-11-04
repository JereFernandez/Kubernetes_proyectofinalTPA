package com.example.persona.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import com.example.persona.Entities.Base;
import java.io.Serializable;

@NoRepositoryBean//La interface no se puede instanciar
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {
}
