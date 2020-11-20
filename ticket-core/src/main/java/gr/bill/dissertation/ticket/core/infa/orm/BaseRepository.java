package gr.bill.dissertation.ticket.core.infa.orm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<E extends AbstractEntity<I>, I extends AbstractId<E>> extends JpaRepository<E, I> {
     Optional<E> findById(I id);
}
