package gr.bill.dissertation.ticket.core.infa.orm;

import lombok.*;

import javax.persistence.MappedSuperclass;
import java.util.Objects;

import static lombok.AccessLevel.PROTECTED;

@Getter
@Setter(PROTECTED)
@MappedSuperclass
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@EqualsAndHashCode(callSuper = false)
public abstract class AbstractId<E> implements IEntityClassAwareId<E> {

    private long id;

    @Override
    public String toString() {
        return Objects.toString(id);
    }

}
