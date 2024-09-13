package com.app.server.model;

import java.util.Collection;
import java.util.List;
import java.util.Optional;



public interface CrudDao<TTable, TKey>{

    List<TTable> all();

    Optional<TTable> byId(TKey key);

    List<TTable> byIds(Collection<TKey> keys);

    TTable insert(TTable value);

    int update(TTable value, TKey where);

    int delete(TKey key);
}
