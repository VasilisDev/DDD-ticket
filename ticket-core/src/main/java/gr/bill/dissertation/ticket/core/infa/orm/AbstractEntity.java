package gr.bill.dissertation.ticket.core.infa.orm;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.AbstractAggregateRoot;
import org.springframework.data.domain.Persistable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(of = "id", callSuper = true)
@ToString(of = "id")
public abstract class AbstractEntity<I extends AbstractId<? extends AbstractEntity<I>>>
        extends AbstractAggregateRoot<AbstractEntity<I>> implements Persistable<I> {



    @EmbeddedId
    private I id;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @Version
    @Column(name = "_version_")
    private Integer version;


    @Override
    public I getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return id == null;
    }
}
