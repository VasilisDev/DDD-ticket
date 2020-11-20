package gr.bill.dissertation.ticket.core.infa.orm;

import java.io.Serializable;

public interface IEntityClassAwareId<E> extends Serializable  {

    long getId();

    Class<E> getClassOfEntity();
}
